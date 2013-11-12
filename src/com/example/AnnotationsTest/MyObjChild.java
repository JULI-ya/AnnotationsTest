package com.example.AnnotationsTest;


import com.example.AnnotationsProcessor.ParcelableObj;

@ParcelableObj
public class MyObjChild extends MyObjChildProjection {

    public int id;
    public String name;
    public int parentId;
}
