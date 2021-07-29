package com.macintoshfan.generics;

public class GenericsClass<T> {
    public T obj;

    public GenericsClass(T obj) {
        this.obj = obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }

    // Optional: if you wish to directly get your object as a String, uncomment the method below
    /*
    @Override
    public String toString() {
        return this.obj.toString();
    }
     */
}
