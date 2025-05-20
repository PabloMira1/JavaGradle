package com.pablo.JavaSpringboot.Repository;

import com.pablo.JavaSpringboot.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Long> {

}
