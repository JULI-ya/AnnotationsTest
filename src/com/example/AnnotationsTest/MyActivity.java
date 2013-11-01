package com.example.AnnotationsTest;

import android.app.Activity;
import android.os.Bundle;
import com.example.AnnotationsProcessor.CustomAnnotation;
import com.example.AnnotationsProcessor.Handleable;
import com.example.AnnotationsProcessor.Option;

public class MyActivity extends Activity {

    @Handleable
    private String stuff;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @CustomAnnotation(className = "String", type = 1)
    public void annotatedMethod(String value) {
    }
}
