# Android 组件化

###一、组件化的目标

##### 1.代码解耦

```
把庞大的代码进行拆分，分解为一个个组件。主要利用Android studio 提供的multiple module 功能。
主要分成两类：
·基础库library
可以被其他组件直接引用，比如网络库、图片库
·Component
有完整功能的module，组件之间不能互相依赖，代码完全隔离，不仅不能直接使用其他组件中的类，最好能根本不了解其中的细节，方便以后随意拆装组件。
```

##### 2.组件单独运行

```拆分后的组件可以单独运行，有属于自己的启动activity
在调试的时候可以作为一个application单独运行，以加快调试速度.在app打包时作为一个library，做到按需装载。
```

##### 3.数据传递

```因为每个组件都会给其他组件提供服务，需要解决主项目（host）与组件、组件与组件直接传递数据的问题。
因为每个组件都会给其他组件提供服务，需要解决主项目（host）与组件、组件与组件直接传递数据的问题。
```

##### 4.UI跳转

```组件与组件直接可以随意跳转页面，activity、fragment等```

##### 5、代码隔离、资源隔离

```
不同组件之间代码、资源隔离，在编译时无法调用，但是可以通过路由间接调用，只有做到这一步，才是对组件真正的解耦。
```

##### 6.组件的生命周期

```不同
对于已经参与编译的组件是可以动态的加载和卸载的。
```

###二、具体实现

##### 1.module拆分

```
basiclib：基础依赖库，一切第三方依赖库、基础组件都在定义这个Module下。
basicres：基础资源库，一切公共资源都在这个module下、例如全局通用的theme和color等。
component_service：组件服务库，定义了所有component提供的服务。没有具体实现、只有接口，具体实现在各自的component module中。
component_xxxx：组件库(xxxx为各自的组件名称,例如 component_home),放置本模块所有具体实现、和提供给外界调用的接口实现。
·····
app：主项目，负责集成众多组件，控制组件的生命周期，理应没有任何具体代码实现，实际情况下可放一些闪屏和启动等简单逻辑。
```

##### 2.分层图

![image-20190819161634775](/Users/jinxianlun/Library/Application Support/typora-user-images/image-20190819161634775.png)



##### 3.单独调试和发布

```
通过在组件工程下的gradle.properties文件中设置一个isRunAlone的变量来区分不同的场景：
```

![image-20190819164235180](/Users/jinxianlun/Library/Application Support/typora-user-images/image-20190819164235180.png)

#####·gradle.properties:

![image-20190819164305969](/Users/jinxianlun/Library/Application Support/typora-user-images/image-20190819164305969.png)

##### ·配置使用不同资源

![image-20190819164401724](/Users/jinxianlun/Library/Application Support/typora-user-images/image-20190819164401724.png)

#####4.组件交互和UI跳转

```使用Arouter作为UI跳转工具。
·使用Arouter作为UI跳转工具。
Author author = new Author("Jack", 18, "China");
ARouter.getInstance().build(HomeService.PATH_SHAREBOOK)
                    .withString("bookName", "月亮与六便士")
                    .withString("key3", "888")
                    .withParcelable("author", author)
                    .navigation();

·使用Arouter调用component中提供的方法
HomeService homeService = ARouter.getInstance().navigation(HomeService.class);
if (homeService != null) {
			homeService.sayHello(getApplicationContext(), "你好啊！");
} else {
			Toast.makeText(getApplicationContext(), "组件服务未加载", Toast.LENGTH_LONG).show();
}
```



### 三、存在的问题

1.component初始化需要手动在app主项目中集成，没有做到自动化组装。

```
后续可以编写gralde plugin在打包时扫描代码，将初始化代码动态插入app主项目中，参考以下项目：https://github.com/ren93/initiator
```

2.还未实现动态的组件卸载。

```
考虑使用Arouter拦截器实现
```