package com.example.courses.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity(name="LanguageCourse")
@Table(name = "language_courses")
@NoArgsConstructor
@Getter
@Setter
public class LanguageCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "language_course_id" , unique = true, nullable = false)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "language_id")
    private Language language;

    //дана начала курса  дата окончания курса

    @Column(name = "total_number_of_lessons")
    private long totalNumberOfLessons;

    @Column(name = "number_of_lessons_conducted")
    private long numberOfLessonsConducted;




    @OneToMany(	mappedBy = "languageCourse",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<StudentCourseItem> studentList = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
