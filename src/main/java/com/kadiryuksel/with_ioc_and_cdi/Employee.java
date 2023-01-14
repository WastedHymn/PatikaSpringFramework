package com.kadiryuksel.with_ioc_and_cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "cdiIocEmployee")
@ApplicationScoped
public class Employee {

    @Inject
    private BossInterface bossInterface;

    public Employee() {
        //this.bossInterface = new Boss();
    }

    public String getData(String data) {
        return bossInterface.version(data);
    }
}
