package com.geekster.University_Event_Management.controller;

import com.geekster.University_Event_Management.model.StudentModel;
import com.geekster.University_Event_Management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(value = "/addStudent")
    public String addStudent(@RequestBody List<StudentModel> studentList)
    {
        return studentService.saveStudent(studentList);
    }
    @PutMapping("/updateStudentDepartment/{id}")
    public void updateStudentDetails(@PathVariable int id,@RequestBody StudentModel studentDetails)
    {
         studentService.updateDetails(id, studentDetails);
    }
//    @GetMapping("/getStudents")
//    public Iterable<StudentModel> getStudents()
//    {
//        return studentService.getAllStudents();
//    }
//    @GetMapping("/getStudentById/{id}")
//    public Iterable<StudentModel> getStudentById(@PathVariable Integer id)
//    {
//        return studentService.findStudentsById();
//    }


}
