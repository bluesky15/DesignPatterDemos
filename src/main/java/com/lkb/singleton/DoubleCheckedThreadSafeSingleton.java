package com.lkb.singleton;

/**
 * Although ThreadSafeSingleton works fine and provides thread-safety
 * but it reduces the performance because of cost associated
 * with the synchronized method, although we need it only for the
 * first few threads who might create the separate instances
 * (Read: Java Synchronization). To avoid this extra overhead every time,
 * double checked locking principle is used. In this approach,
 * the synchronized block is used inside the if condition with an additional
 * check to ensure that only one instance of singleton class is created.
 */
public class DoubleCheckedThreadSafeSingleton {
    private static DoubleCheckedThreadSafeSingleton instance;
    private DoubleCheckedThreadSafeSingleton(){}
    public static DoubleCheckedThreadSafeSingleton getInstance(){
        if(instance!=null){
            synchronized (DoubleCheckedThreadSafeSingleton.class){
                instance = new DoubleCheckedThreadSafeSingleton();
            }
        }
        return instance;
    }
}
