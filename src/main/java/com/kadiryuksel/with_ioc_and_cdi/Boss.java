package com.kadiryuksel.with_ioc_and_cdi;

public class Boss implements BossInterface{

    @Override
    public String version(String data){
        return "version: " + data;
    }
}
