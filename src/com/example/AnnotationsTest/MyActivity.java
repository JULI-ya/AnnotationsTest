package com.example.AnnotationsTest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.example.AnnotationsProcessor.CustomAnnotation;
import android.widget.TextView;

public class MyActivity extends Activity {

    TextView textView;

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


        ReqObj reqObj = new ReqObj();
        reqObj.getJson("Minsk");

        MyObj myObj = new MyObj();
        MyObj.parse(stuffChild, myObj);
        Log.d(getPackageName(), " " + myObj.name);
    }

    @CustomAnnotation(className = "String", type = 2)
    public void annotatedMethod(String value) {
    }
}
