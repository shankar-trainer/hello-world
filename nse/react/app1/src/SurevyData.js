import { Button } from "bootstrap";
import { Component } from "react";
import Survey from "./survey";

export default class SurveyData extends Component {

    constructor(props) {
        super(props)
        this.state = {
            id: 10001,
            name: 'education',
            location: 'new delhi'
        }
        const edu_data = [
            {
                id: "70001",
                area: "mayur vihar",
                sector: "01",
                education: [
                    {
                        personId: 6001,
                        personName: 'anand kumar',
                        personQualification: 'graduate',
                    },
                    {
                        personId: 6002,
                        personName: 'parvin kumar',
                        personQualification: 'under graduate',
                    },
                    {
                        personId: 6003,
                        personName: 'vivek kumar',
                        personQualification: 'post graduate',
                    },
                    {
                        personId: 6004,
                        personName: 'radhul kumar',
                        personQualification: 'graduate',
                    },
                    {
                        personId: 6005,
                        personName: 'lalan kumar',
                        personQualification: 'graduate',
                    },
                    {
                        personId: 6006,
                        personName: 'jaswant kumar',
                        personQualification: 'post graduate',
                    },

                ]
            },
            {
                id: "70002",
                area: "laxminagar",
                sector: "02",
                education: [
                    {
                        personId: 6001,
                        personName: 'anand kumar',
                        personQualification: 'graduate',
                    },
                    {
                        personId: 6002,
                        personName: 'parvin kumar',
                        personQualification: 'under graduate',
                    },
                    {
                        personId: 6003,
                        personName: 'vivek kumar',
                        personQualification: 'post graduate',
                    },
                    {
                        personId: 6004,
                        personName: 'radhul kumar',
                        personQualification: 'graduate',
                    },
                    {
                        personId: 6005,
                        personName: 'lalan kumar',
                        personQualification: 'graduate',
                    },
                    {
                        personId: 6006,
                        personName: 'jaswant kumar',
                        personQualification: 'post graduate',
                    },

                ]
            },
            {
                id: "70003",
                area: "vasant vihar",
                sector: "03",
                education: [
                    {
                        personId: 6001,
                        personName: 'anand kumar',
                        personQualification: 'graduate',
                    },
                    {
                        personId: 6002,
                        personName: 'parvin kumar',
                        personQualification: 'under graduate',
                    },
                    {
                        personId: 6003,
                        personName: 'vivek kumar',
                        personQualification: 'post graduate',
                    },
                    {
                        personId: 6004,
                        personName: 'radhul kumar',
                        personQualification: 'graduate',
                    },
                    {
                        personId: 6005,
                        personName: 'lalan kumar',
                        personQualification: 'graduate',
                    },
                    {
                        personId: 6006,
                        personName: 'jaswant kumar',
                        personQualification: 'post graduate',
                    },

                ]
            }, {
                id: "70004",
                area: "swasthya vihar",
                sector: "01",
                education: [
                    {
                        personId: 6001,
                        personName: 'anand kumar',
                        personQualification: 'graduate',
                    },
                    {
                        personId: 6002,
                        personName: 'parvin kumar',
                        personQualification: 'under graduate',
                    },
                    {
                        personId: 6003,
                        personName: 'vivek kumar',
                        personQualification: 'post graduate',
                    },
                    {
                        personId: 6004,
                        personName: 'radhul kumar',
                        personQualification: 'graduate',
                    },
                    {
                        personId: 6005,
                        personName: 'lalan kumar',
                        personQualification: 'graduate',
                    },
                    {
                        personId: 6006,
                        personName: 'jaswant kumar',
                        personQualification: 'post graduate',
                    },

                ]
            }
        ]
    }

changeData = (e) => {
    this.setState(
        {
            id: 90001,
            name: 'pouplation',
            location: 'chennai'
        }
    )
    e.preventDefault()
}
render() {
    return (
        <div className="m-5 w-75 p-5 bg-info text-dark">     
               <p>Survey Data </p>
            Id is {this.state.id}<br></br>
            Name is {this.state.name}<br></br>
            Location is {this.state.location}<br></br>
            <button type='button' onClick={this.changeData}> Change Survey Data</button>
            <Survey data1={this.edu_data}>


            </Survey>
        </div>

    )
}

}