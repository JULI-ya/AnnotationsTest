package com.example.AnnotationsTest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.example.AnnotationsProcessor.CustomAnnotation;

@CustomAnnotation(className = "String", type = 1)
public class MyActivity extends Activity {

    private String stuff = "{\n" +
            "    \"id\": 12,\n" +
            "    \"name\": \"Yuliya\",\n" +
            "    \"isCheck\": true\n" +
            "}";

    private String stuffChild = "{\n" +
            "    \"id\": \"12\",\n" +
            "    \"name\": \"Yuliya\",\n" +
            "    \"child\": {\n" +
            "        \"id\": 5,\n" +
            "        \"name\": \"child\",\n" +
            "        \"parentId\": 12\n" +
            "    },\n" +
            "    \"isCheck\": \"true\"\n" +
            "}";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        MyObj myObj = new MyObj();
        MyObj.parse(stuffChild, myObj);
        Log.d(getPackageName(), " " + myObj.name);
    }

    @CustomAnnotation(className = "String", type = 2)
    public void annotatedMethod(String value) {
    }
}
