package com.example.AnnotationsTest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.example.AnnotationsProcessor.CustomAnnotation;
import android.widget.TextView;
import com.example.AnnotationsProcessor.LoadCompleteListener;

public class MyActivity extends Activity implements LoadCompleteListener {

    TextView textView;
    Weather weather;

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

        textView = (TextView) findViewById(R.id.text);

        ReqObj reqObj = new ReqObj(this);
        reqObj.getJson("Minsk");

        MyObj myObj = new MyObj();
        MyObj.parse(stuffChild, myObj);
        Log.d(getPackageName(), " " + myObj.name);

        weather = new Weather();
    }

    @CustomAnnotation(className = "String", type = 2)
    public void annotatedMethod(String value) {
    }

    @Override
    public void onLoadComplete(String result) {
        Weather.parse(result, weather);
        textView.setText("City = " + weather.name +"\nLatitude = " + String.valueOf(weather.coord.lat) + "\nLongitude = " + String.valueOf(weather.coord.lon));
    }
}
