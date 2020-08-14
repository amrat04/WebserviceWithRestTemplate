package com.example.demowebapp.jpa;

import com.example.demowebapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

  //  @Query("select * from user where username=:usename and password=:password and isActive=true")
  //  Student findByUsernameAndPasswordByNativeQuery(String username, String password);

    Student findByUsernameAndPassword(String username, String password);

}
