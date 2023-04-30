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
    private String firstName;

    @Column(name = "student_last_name")
    private String lastName;

    @Column(name = "student_age")
    @Min(value = 18, message = "Age value should be in between 18 to 24")
    @Max(value = 25, message = "Age value should be in between 18 to 24")
    private Integer age;

    @Column(name = "student_department")
    private String department;
}
