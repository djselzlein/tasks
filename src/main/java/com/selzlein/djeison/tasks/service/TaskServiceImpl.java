package com.selzlein.djeison.tasks.service;

import com.selzlein.djeison.tasks.domain.Task;
import com.selzlein.djeison.tasks.repository.TaskRepository;

public class TaskServiceImpl implements TaskService {
	
	private TaskRepository repository;
	
	public TaskServiceImpl(TaskRepository repository) {
		this.repository = repository;
	}

	@Override
	public Iterable<Task> list() {
		return this.repository.findAll();
	}
	
}
