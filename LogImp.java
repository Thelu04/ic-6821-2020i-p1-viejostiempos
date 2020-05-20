package com.company;

import java.awt.*;

class LogImp implements Log{
    private List book;
    private Log instance;

    private  LogImp() {
        instance = null;
    }

    public Log getInstance(){
        if(instance==null){
            instance = new LogImp();}
        return instance;
    }

    public void createEntry(String date){
        System.out.println(date);
    }
}
