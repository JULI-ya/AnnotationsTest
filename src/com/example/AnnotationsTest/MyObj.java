package com.example.AnnotationsTest;


import com.example.AnnotationsProcessor.ChildObj;
import com.example.AnnotationsProcessor.ParcelableObj;

@ParcelableObj
public class MyObj extends MyObjProjection {

    public int id;
    public String name;
    boolean isCheck;
    @ChildObj
    MyObjChild child;


}

