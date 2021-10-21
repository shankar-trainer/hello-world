import { Exam } from './exam';

export class Question {

    public questionId:number;
    public questionTitle:string;
    public answer:string;
    public exam:Exam=new Exam();
    public optA:string;
    public optB:string;
    public optC:string;
    public optD:string;
}
/*
{
        "questionId": "1006",
        "questionTitle": "capital of india",
        "answer": "optA",
        "exam": {
            "examId": 1,
            "examName": "exam1",
            "minutes": 30
        },
        "optA": "delhi",
        "optB": "chennai",
        "optC": "madurai",
        "optD": "ooty"
    }
*/
