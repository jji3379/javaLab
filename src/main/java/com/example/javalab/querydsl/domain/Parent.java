package com.example.javalab.querydsl.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String parentName;

    @OneToMany(mappedBy = "childId", cascade = CascadeType.ALL)
    private List<Child> childList = new ArrayList<>();
}
