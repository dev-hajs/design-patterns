package com.study.designpatterns._01_creational_patterns._02_factorymethod._02_after;

import com.study.designpatterns._01_creational_patterns._03_abstract_factory._01_before.WhiteAnchor;
import com.study.designpatterns._01_creational_patterns._03_abstract_factory._01_before.WhiteWheel;
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

    private WhiteWheel wheel;

    private WhiteAnchor anchor;
}
