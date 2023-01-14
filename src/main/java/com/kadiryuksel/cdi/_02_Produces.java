package com.kadiryuksel.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value = "producetuto")
@ApplicationScoped
public class _02_Produces {

    @Produces
    public List<String> getList(){
        List<String> strings = new ArrayList<>();
        strings.add("html5");
        strings.add("css");
        strings.add("js");
        strings.add("react");
        strings.add("angular");
        return strings;
    }
}
