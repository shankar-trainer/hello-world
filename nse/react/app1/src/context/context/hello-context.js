import React from "react"

export const messages={
    message1:{
        firstWord:'hi',
        secondWord:'hi',
    }
}

export const HelloContext=React.createElement(
    {message:messages.message1,
    Object toggleMessage:()=>{}
    }
)