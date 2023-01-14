package com.kadiryuksel.without_ioc_and_di;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdiEmployee")
@ApplicationScoped
public class Employee {

    private Boss boss;

    public Employee() {
        this.boss = new Boss();
    }

    public String getData(String data){
        return boss.version(data);
    }
}
