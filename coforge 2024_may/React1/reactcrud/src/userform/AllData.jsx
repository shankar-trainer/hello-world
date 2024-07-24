import { useState } from "react"

export const AllData = () => {

    const data = [
        {
            "id": 10001,
            "name": "amit kumar",
            "salary": 20000
        },
        {
            "id": 10001,
            "name": "amit kumar",
            "salary": 20000
        },
        {
            "id": 10001,
            "name": "amit kumar",
            "salary": 20000
        },
        {
            "id": 10001,
            "name": "amit kumar",
            "salary": 20000
        }
    ]

    const [users,setUsers]=  useState(data)

    const addUser=(user)=>{
        setUsers([
            users,user
        ])

    }

}