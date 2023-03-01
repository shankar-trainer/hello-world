import { HelloContext } from "../context/hello-context"

const Message = () => {
    return (
        <HelloContext.Consumer>
            {
                ({ message, toggleMessage }

                ) => (
                    <header className="App-header">
                        <h1 className="App-title">
                            {
                                message.firstword + ' ' + message.secondword
                            }
                        </h1>
                        <ButtonContext.Consumer>
                            {
                                ({ title }) => (
                                    <div>
                                        <button onClick={toggleMessage}>
                                            {title}
                                        </button>
                                        <ActionContextConsumer.Consumer>
                                            {
                                                ({ alertMessage, asyncAlertMessage }) => (
                                                    <div>
                                                        <button OnClick
                                                            ={
                                                                alertMessage(message.firstword + '  ' + message.secondword)
                                                            }>
                                                            Fire title as alert message
                                                        </button>
                                                        <button onClick={
                                                            asyncAlertMessage(message.firstword+' '+message.secondword,3000)
                                                        }>
                                                            Fire title as alert message after 3 second 

                                                        </button>
                                                                                                   </div>
                                                )
                                            }
                                        </ActionContextConsumer.Consumer>
                                    </div>
                                )
                            }
                        </ButtonContext.Consumer>
                    </header>
                )
            }
        </HelloContext.Consumer>
    )
}
export default Message;