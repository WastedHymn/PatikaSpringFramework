package com.kadiryuksel.cdi;

import com.kadiryuksel.dto.StudentDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {

    @Produces
    public String createData(@New StudentDto studentDto){
        studentDto = StudentDto.builder()
                .studentId(0L)
                .firstName("studentName")
                .build();
        return studentDto.getFirstName();
    }

    @Getter
    @Inject
    private String depletiveData;
}
