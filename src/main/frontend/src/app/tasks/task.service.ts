import { Http } from "@angular/http";
import { Injectable } from "@angular/core";
import "rxjs/add/operator/map";

@Injectable()
export class TaskService {

    constructor(private http: Http){

    }

    get() {
        return this.http.get('/api/tasks').map(response => response.json());
    }

}