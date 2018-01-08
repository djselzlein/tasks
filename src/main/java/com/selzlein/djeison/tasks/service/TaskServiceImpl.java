package com.selzlein.djeison.tasks.service;

import org.springframework.stereotype.Service;

import com.selzlein.djeison.tasks.domain.Task;
import com.selzlein.djeison.tasks.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {
	
	private TaskRepository repository;
	
	public TaskServiceImpl(TaskRepository repository) {
		this.repository = repository;
	}

	@Override
	public Iterable<Task> list() {
		return this.repository.findAll();
	}
	
	@Override
	public Task save(Task t) {
		return this.repository.save(t);
	}
}
