package com.geekster.University_Event_Management.repository;

import com.geekster.University_Event_Management.model.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends CrudRepository<StudentModel,Integer>{
    String saveStudentBy();

    void updateDetailsBy(int id, StudentModel studentDetails);
}
