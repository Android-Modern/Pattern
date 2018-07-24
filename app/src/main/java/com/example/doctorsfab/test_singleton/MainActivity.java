package com.example.doctorsfab.test_singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String tag = " tag >>>>>>>>>>>>>>>>> ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(SingletonActivity_enum.getInstance().test);
        Log.d(tag, SingletonActivity_enum.getInstance().test);

        Singleton_InitializationOnDemandHolderIdiom.getInstance().SendMsg();
    }
}
