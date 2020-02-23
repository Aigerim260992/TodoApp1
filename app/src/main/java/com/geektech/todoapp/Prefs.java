package com.geektech.todoapp;

import android.content.Context;
import android.content.SharedPreferences;

public class Prefs {

    private static volatile Prefs instanse;

    private SharedPreferences preferences;

    public Prefs(Context context) {
        instanse = this;
        preferences = context.getSharedPreferences("settings",
                Context.MODE_PRIVATE);
    }

    public static Prefs getInstance(Context context) {
        if (instanse == null) new Prefs(context);
        return instanse;
    }

    public boolean isShown(){

        return  preferences.getBoolean("isShown", false);
    }

    public void saveShown(){
        preferences.edit().putBoolean("isShown", true).apply();

    }
    public void Delete(){
        preferences.edit().clear().apply();
    }



}
