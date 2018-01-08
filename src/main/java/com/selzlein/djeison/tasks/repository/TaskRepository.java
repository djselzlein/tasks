package com.selzlein.djeison.tasks.repository;

import org.springframework.data.repository.CrudRepository;

import com.selzlein.djeison.tasks.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
