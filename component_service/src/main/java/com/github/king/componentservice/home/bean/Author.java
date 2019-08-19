package com.github.king.componentservice.home.bean;

/**
 * @author Created by jinxl on 2018/12/20.
 */
public class Author {
    private String name;
    private int age;
    private String county;

    public Author(String name, int age, String county) {
        this.name = name;
        this.age = age;
        this.county = county;
    }

    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", county='" + county + '\'' +
                '}';
    }
}
