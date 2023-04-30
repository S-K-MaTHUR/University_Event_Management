package com.geekster.University_Event_Management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class StudentModel {

    @Column(name = "student_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentId;

    @Column(name = "student_first_name", unique = true)
    private String student_first_Name;

    @Column(name = "student_first_name")
    private String student_last_Name;

    @Column(name = "age")
    private Integer studentAge;



}
