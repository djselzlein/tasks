package com.selzlein.djeison.tasks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selzlein.djeison.tasks.domain.Task;
import com.selzlein.djeison.tasks.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

	@Autowired
	private TaskService service;
	
	@GetMapping(value = { "", "/" }, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Iterable<Task> list() {
		return service.list();
	}
	
	@PostMapping("save")
	public Task save(@RequestBody Task t) {
		return service.save(t);
	}

}
