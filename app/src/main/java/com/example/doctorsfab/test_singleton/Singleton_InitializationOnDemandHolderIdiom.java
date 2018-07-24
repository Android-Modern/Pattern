package com.example.doctorsfab.test_singleton;

import android.util.Log;

import java.util.zip.InflaterInputStream;

public class Singleton_InitializationOnDemandHolderIdiom {

    private static final String tag = " tag >>>>>>>>>>>>>>> ";


    private Singleton_InitializationOnDemandHolderIdiom(){}


    private static class Singleton{
        private static final Singleton_InitializationOnDemandHolderIdiom instance = new Singleton_InitializationOnDemandHolderIdiom();
    }

    public static Singleton_InitializationOnDemandHolderIdiom getInstance(){
        System.out.println("create instance");
        Log.d(tag,"InitializationOnDemandHolderIdiom");
        return Singleton.instance;
    }


    public void SendMsg(){
        Log.d(tag,"sendMsg");
    }
}
