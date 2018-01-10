import { Component, OnInit } from '@angular/core';
import { Task } from '../task.model';
import { TaskService } from '../task.service';

@Component({
  selector: 'app-tasks-add',
  templateUrl: './tasks-add.component.html',
  styleUrls: ['./tasks-add.component.css']
})
export class TasksAddComponent implements OnInit {

  addTaskValue: string = null;

  constructor(private taskService: TaskService) { }

  ngOnInit() {
  }

  onTaskAdd(event) {
    let task: Task = new Task(event.target.value, false, '10/04/2018');
    this.taskService.add(task)
      .subscribe(
        (newTask: Task) => {
          this.addTaskValue = '';
          this.taskService.onTaskAdded.emit(newTask);
        }
      );
  }

}
