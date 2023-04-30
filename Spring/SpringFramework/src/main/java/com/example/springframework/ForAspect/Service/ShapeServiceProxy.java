package com.example.springframework.ForAspect.Service;

import com.example.springframework.ForAspect.aspect.LoggingAspect;
import com.example.springframework.ForAspect.model.Circle;

//now i can make additional calls before i call the target method
public class ShapeServiceProxy extends ShapeService{
    public Circle getCircle() {
        //i am just calling the method of super class
        //now  this is same as beforeAdvice
        new LoggingAspect().loggableAdvice();
      return super.getCircle();
    }
}
