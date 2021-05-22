export class Survey {
    surveyId: number;
    surveyName: string;
    surveyDate: Date;
    surveyLocation: string;

    constructor(surveyId: number,
        surveyName: string,
        surveyDate: Date,
        surveyLocation: string
    ) {
        this.surveyId = surveyId;
        this.surveyName = surveyName;
        this.surveyDate = surveyDate;
        this.surveyLocation = surveyLocation;
    }


}
