package com.example.colorpicker;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.LinkedList;


public class ColorViewModel extends ViewModel {
    private MutableLiveData<LinkedList<String>> colorsall;
    private ColorViewModel model;
    public ColorViewModel(){
        colorsall = new MutableLiveData<>();
    }


    public void setCOlors(LinkedList<String> l){

    }

    public LinkedList<String> addColor(String color){
        return colorsall.getValue();
    }


}
