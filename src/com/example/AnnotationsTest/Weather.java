package com.example.AnnotationsTest;

import com.example.AnnotationsProcessor.ChildObj;
import com.example.AnnotationsProcessor.ParcelableObj;

@ParcelableObj
public class Weather extends WeatherProjection {

    String name;

    @ChildObj
    Coordinates coord;
}

