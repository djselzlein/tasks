package com.selzlein.djeison.tasks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selzlein.djeison.tasks.domain.Task;
import com.selzlein.djeison.tasks.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

	@Autowired
	private TaskService service;

	@GetMapping(value = { "", "/" })
	public Iterable<Task> list() {
		return service.list();
	}

}
