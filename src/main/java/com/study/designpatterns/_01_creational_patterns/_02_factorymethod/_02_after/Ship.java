package com.study.designpatterns._01_creational_patterns._02_factorymethod._02_after;

import com.study.designpatterns._01_creational_patterns._03_abstract_factory._02_after.Anchor;
import com.study.designpatterns._01_creational_patterns._03_abstract_factory._02_after.Wheel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Ship {

    private String name;

    private String color;

    private String logo;

    private Wheel wheel;

    private Anchor anchor;
}
