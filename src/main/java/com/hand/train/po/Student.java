package com.hand.train.po;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class Student {
    private Integer stuId;
    private String stuName;
    private String sex;
    private LocalDate borndate;
}
