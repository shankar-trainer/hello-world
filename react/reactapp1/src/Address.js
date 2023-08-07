function Address(props) {
    return (
        <div className="border border-primary">
            <h2>Address is </h2>
            <div>
                city is {props.city}
            </div>
            <div>
                state is {props.state}
            </div>
            <div>
                country  is {props.country}
            </div>
        </div>
    )
}
export default Address;