import { Fragment } from "react";
import { ExpenseItem } from "./components/ExpenseItem";

export const App = () => {

    const expenses = [
        {
            id: 'e1',
            title: 'Toilet Paper',
            amount: 94.12,
            date: new Date(2020, 7, 14),
        },
        { id: 'e2', title: 'New TV', amount: 799.49, date: new Date(2021, 2, 12) },
        {
            id: 'e3',
            title: 'Car Insurance',
            amount: 294.67,
            date: new Date(2021, 2, 28),
        },
        {
            id: 'e4',
            title: 'New Desk (Wooden)',
            amount: 450,
            date: new Date(2021, 5, 12),
        },
    ];
    var ar = [1, 2, 3, 4, 5,]
    return (
        <Fragment>

            {/* <ExpenseItem date={expenses[0].date}  title={expenses[0].amount} amount={expenses[0].amount} >
                </ExpenseItem>
                 */}
             {
                expenses.map(a=>
                    <ExpenseItem date={a.date}  title={a.amount} amount={a.amount} >
                </ExpenseItem>
                )
            } 
            
           
           

        </Fragment>
    )

}