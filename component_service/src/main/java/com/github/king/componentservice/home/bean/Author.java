package com.github.king.componentservice.home.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Created by jinxl on 2018/12/20.
 */
public class Author implements Parcelable {
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.age);
        dest.writeString(this.county);
    }

    protected Author(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
        this.county = in.readString();
    }

    public static final Parcelable.Creator<Author> CREATOR = new Parcelable.Creator<Author>() {
        @Override
        public Author createFromParcel(Parcel source) {
            return new Author(source);
        }

        @Override
        public Author[] newArray(int size) {
            return new Author[size];
        }
    };
}
