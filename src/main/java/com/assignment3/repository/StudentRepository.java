package com.assignment3.repository;

import com.assignment3.domain.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long>
{
    Student GetMysesf(long id);
}
