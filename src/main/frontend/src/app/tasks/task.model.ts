export class Task {
    public id: number;
    public name: string;
    public complete: boolean;
    public dueDate: string;

    constructor(name: string, complete: boolean, dueDate: string){
        this.name = name;
        this.complete = complete;
        this.dueDate = dueDate;
    }
}