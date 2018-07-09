package com.checkpoint.check.util;

import com.checkpoint.check.form.NoteForm;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by 
 * 2017-07-04 01:30
 */
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }

    public  static <T>  T fromJson(String json,Class<T> tClass){
        Gson gson=new Gson();
        return gson.fromJson(json,tClass);
    }


    public  static void  main(String[]args){
        NoteForm noteForm=new NoteForm();
        noteForm.setId("1");
        noteForm.setAge("12");
        noteForm.setBeSurveyName("aaaaa");
        System.out.println(toJson(noteForm));
       // Gson gson=new Gson();
        NoteForm s=fromJson(toJson(noteForm),NoteForm.class);
        System.out.println(s.toString());
    }
}
