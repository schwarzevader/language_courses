package com.example.courses.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity(name="Language")
@Table(name = "c")
@NoArgsConstructor
@Getter
@Setter
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "language_id" , unique = true, nullable = false)
    private Long id;
    @Column(name = "language_name")
    private String name;

    @OneToMany(mappedBy ="language",cascade = CascadeType.ALL,orphanRemoval = false,fetch = FetchType.LAZY)
    private List<LanguageTeacherItem> languageTeacherItems = new ArrayList<>();

}
