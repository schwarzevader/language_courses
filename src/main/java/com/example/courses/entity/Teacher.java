package com.example.courses.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity(name="Teacher")
@Table(name = "teachers")
@NoArgsConstructor
@Getter
@Setter
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "teacher_id" , unique = true, nullable = false)
    private Long id;



    @OneToMany(mappedBy ="teacher"
            ,cascade = CascadeType.ALL
            ,orphanRemoval = false
            ,fetch = FetchType.LAZY)
    private List<LanguageCourse> languageCourseList = new ArrayList<>();

    @OneToMany(mappedBy ="teacher",cascade = CascadeType.ALL,orphanRemoval = false,fetch = FetchType.LAZY)
    private List<LanguageTeacherItem> languageTeacherItems = new ArrayList<>();
}
