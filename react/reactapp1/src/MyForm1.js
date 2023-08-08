import { useState } from "react";

function MyForm1() {
    const [name, SetName] = useState("");
    const [id, SetId] = useState();
    const [errorid, SetErrorId] = useState();
    const [errorname, SetErrorName] = useState();

    // const ShowAll = (event) => {
    //     event.preventDefault()
    //     alert('Id is ' + id + "\nname is " + name)
    // }

    return (
        <div className="bg-info w-50 text-dark p-5 mt-5" style={{ 'marginLeft': '300px' }}>
            <form>
                <div className="form-group">
                    <div>
                        <label> Enter Id (1000- 10000)</label>
                    </div>
                    <div>
                        <input onChange={(e) => {
                            if (e.target.value == '') {
                                SetErrorId('id blank')
                            }
                            else if (e.target.value <= 0) {
                                SetErrorId('id is zero or -ve ')
                            }
                            else if (isNaN(e.target.value)) {
                                SetErrorId('id must be number ')
                            }
                            else if (e.target.value < 1000 || e.target.value > 10000) {
                                SetErrorId('id not in range of 1000 - 10000')
                            }
                            else {
                                SetErrorId('  ')
                                SetId(e.target.value)
                            }
                        }
                        }
                            className="form-control"
                        ></input>
                        <div className="text-danger">{errorid} </div>
                    </div>
                </div>
                <div className="form-group">
                    <div>
                        <label> Enter Name ( 5 -15 chars )</label>
                    </div>
                    <div>
                        <input onChange={(e) => {
                            if (e.target.value == '') {
                                SetErrorName('name  is  blank')
                            }
                            else if (e.target.value.length < 5 || e.target.value.length > 15) {
                                SetErrorName('name must of 5 -15 chars ')
                            }
                            else {
                                SetErrorName(' ')
                                SetName(e.target.value)
                            }
                        }}
                            className="form-control"
                        ></input>
                        <div className="text-danger">{errorname} </div>
                    </div>
                </div>
                <div className="form-group mt-2">
                    <button type="submit" onClick={(e) => {
                        e.preventDefault();
                        alert('id is ' + id + '\nname is ' + name)
                    }
                    } >Send</button>
                    <button type="reset" style={{ marginLeft: '10px' }}>Cancel</button>
                </div>

                <div className="mt-5 border border-primary p-5 ">
                    <div>Id is {id}
                    </div>
                    <div>Name is {name}
                    </div>
                </div>
            </form>
        </div >
    );
}

export default MyForm1;