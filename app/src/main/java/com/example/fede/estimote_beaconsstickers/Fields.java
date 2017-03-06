package com.example.fede.estimote_beaconsstickers;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by selim on 07/02/2017.
 */

public class Fields {
    String id;
    boolean motion;
    long lastMotionStateDuration;
    long currentMotionStateDuration;
    String acceleration;
    double temperature;
    String batterylevel;
    String color;
    String type;

    public Fields(String id, boolean motion, long lastMotionStateDuration,long currentMotionStateDuration, String acceleration, double temperature, String batterylevel,
                  String color, String type){
        this.id=id;
        this.motion=motion;
        this.lastMotionStateDuration=lastMotionStateDuration;
        this.currentMotionStateDuration=currentMotionStateDuration;
        this.acceleration=acceleration;
        this.temperature=temperature;
        this.batterylevel=batterylevel;
        this.color=color;
        this.type=type;
    }

    @Override
    public String toString(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy      hh:mm:ss");
        String res = simpleDateFormat.format(new Date());

        return res+ "\nID: " + id + "\nMotion: " + motion + "\nLastMotionStateDuration: " + lastMotionStateDuration + "s" +
                "\nCurrentMotionStateDuration: " + currentMotionStateDuration+ "s" + "\nAcceleration (x,y,z): " + acceleration +
                "\nTemperature: " + temperature + "\nBatteryLevel: " + batterylevel + "\nColor: " + color +
                "\nType: " + type;
    }

    public String onlyChecked(ArrayList<Boolean> check){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy      hh:mm:ss");
        String res = simpleDateFormat.format(new Date());

        if(check.get(0)) res += "\nID: " + id;
        if(check.get(1)) res += "\nMotion: " + motion;
        if(check.get(2)) res += "\nLastMotionStateDuration: " + lastMotionStateDuration + "s";
        if(check.get(3)) res += "\nCurrentMotionStateDuration: " + currentMotionStateDuration + "s";
        if(check.get(4)) res += "\nAcceleration (x,y,z): " + acceleration;
        if(check.get(5)) res += "\nTemperature: " + new DecimalFormat("##.##°C").format(temperature);
        if(check.get(6)) res += "\nBatteryLevel: " + batterylevel;
        if(check.get(7)) res += "\nColor: " + color;
        if(check.get(8)) res += "\nType/Name: " + type;

        return res;

    }

    //beacons
    public void setColor (String color){
        this.color = color;
    }

    public void setType(String type){
        this.type = type;

    }
}

