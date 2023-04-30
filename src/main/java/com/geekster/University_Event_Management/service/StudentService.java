package com.geekster.University_Event_Management.service;

import com.geekster.University_Event_Management.model.StudentModel;
import com.geekster.University_Event_Management.repository.IStudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    @Autowired
    IStudentRepository studentRepo;

    public String saveStudent(List<StudentModel> studentList) {
        return studentRepo.saveStudentBy();
    }
@Transactional
    public void updateDetails(int id, StudentModel studentDetails) {
         studentRepo.updateDetailsBy(id,studentDetails);
    }



//    public Iterable<StudentModel> getAllStudents() {
//        return studentRepo.getAllStudentsBy(id);
//    }
//
//    public Iterable<StudentModel> findStudentsById() {
//    }
}
