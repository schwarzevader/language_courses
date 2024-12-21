package com.example.courses.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name="StudentCourseItem")
@Table(name = "student_course_items")
@NoArgsConstructor
@Getter
@Setter
public class StudentCourseItem {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "student_course_item_id" , unique = true, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "language_course_id")
    private LanguageCourse course;
}
