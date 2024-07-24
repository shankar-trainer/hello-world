import { Fragment } from "react"

export const ExpenseItem=(props)=>{
    return(
        <Fragment>
            <div className="border border-primary p-5 w-50 m-5">
            <div >
             Date    {props.date.toISOString()}
            </div>
            <div>
                <h2>Title {props.title}</h2>
                <div>
                   Amount  {props.amount}
                </div>
            </div>
            </div>
        </Fragment>
    )
}