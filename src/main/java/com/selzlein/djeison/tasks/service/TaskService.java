package com.selzlein.djeison.tasks.service;

import com.selzlein.djeison.tasks.domain.Task;

public interface TaskService {
	
	public Iterable<Task> list();
	
	public Task save(Task t);

}
