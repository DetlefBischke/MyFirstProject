package com.db.app.main;

/**
 * Created by phoenix on 22.07.17.
 */
public class Executor {

    public static void main(String[] args) {
        String hello = MainServiceFactory.getInstance().sayHello();
        System.out.println(hello);
    }
}
