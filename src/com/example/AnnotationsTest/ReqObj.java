package com.example.AnnotationsTest;

import com.example.AnnotationsProcessor.LoadCompleteListener;
import com.example.AnnotationsProcessor.RequestObj;

@RequestObj
public class ReqObj extends ReqObjProjection  {

    ReqObj(LoadCompleteListener listener) {
        super(listener);
    }
}

