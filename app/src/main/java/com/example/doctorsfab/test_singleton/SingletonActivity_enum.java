package com.example.doctorsfab.test_singleton;


enum SingletonActivity_enum {

    INSTANCE;

    static  String test = "";

    public static SingletonActivity_enum getInstance(){
        test = "test11";
        return INSTANCE;

    }
}
