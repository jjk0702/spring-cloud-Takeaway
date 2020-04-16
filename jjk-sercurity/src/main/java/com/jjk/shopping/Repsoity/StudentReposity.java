package com.jjk.shopping.Repsoity;

import com.jjk.shopping.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
// JpaSpecificationExecutor<Student>
@Repository
public interface StudentReposity extends JpaRepository<Student,Integer>,JpaSpecificationExecutor<Student> {

    Student findByName(String name);
}
