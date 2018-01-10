import { Component, OnInit } from '@angular/core';
import { Task } from '../task.model';
import { TaskService } from '../task.service';

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

  tasks: Task[] = [];

  constructor(private taskService: TaskService) { }

  ngOnInit() {
    this.taskService.get()
      .subscribe(
        (tasks: any[]) => {
          this.tasks = tasks;
          console.log(this.tasks);
        },
        (error) => console.log(error)
    );

    this.taskService.onTaskAdded.subscribe(
      (task: Task) => this.tasks.push(task)
    );

  }

  getDueDateLabel(task: Task){
    return task.complete ? 'label-success' : 'label-primary';
  }

  onTaskChange(event, task) {
    console.log(event.target.checked);
    this.taskService.save(task, event.target.checked).subscribe();
  }

}
