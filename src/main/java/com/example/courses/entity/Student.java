package com.example.courses.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity(name="Student")
@Table(name = "students")
@NoArgsConstructor
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "student_id" , unique = true, nullable = false)
    private Long id;


//-Преподаватель (выпадающий список всех зарегистрированных преподавателей);
//-Язык (выпадающий список всех языков);
//-Курс (выпадающий список, 3 опции: названия языка + для взрослых, для детей и подростков, носитель языка);

//-Всего уроков (количество оплаченных уроков) (поле необязательно для заполнения, предусмотреть возможность внесения количества уроков после регистрации пользователя);

    @Column(name = "student_name")
    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "skype")
    private String skype;

    @Column(name = "password")
    private String password;
    @Column(name = "number_of_lessons")
    private long numberOfLessons;

    @Column(name = "date_of_payment")
    private LocalDate date;

    @OneToMany(	mappedBy = "student",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<StudentCourseItem> studentList = new ArrayList<>();
}
