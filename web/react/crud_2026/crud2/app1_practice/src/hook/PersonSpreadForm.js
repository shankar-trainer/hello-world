import axios from "axios";
import { useState } from "react";

export const PersonSpreadForm = () => {
    const [msg, setMessage] = useState("");
    const [employee, setEmployee] = useState({});
    const [errors, setErrors] = useState({});

    const submit = (e) => {
        e.preventDefault();
    }

    return (
        <div className="container">
            <form onSubmit={submit}>
                {/* <div className="form-group">
                    <label>enter id</label>
                    <input className="form-control" type="number" onChange={(e) => {
                        const val = e.target.value;
                        const numValue = Number(val);

                        // Update employee safely
                        setEmployee(prev => ({ ...prev, id: val }));

                        // Update errors safely using functional state
                        setErrors(prevErrors => {
                            // If prevErrors is undefined, default to {}
                            const currentErrors = prevErrors || {};

                            if (val === "") {
                                return { ...currentErrors, id: "ID is required" };
                            } else if (numValue < 10000 || numValue > 50000) {
                                return { ...currentErrors, id: "ID must be between 10000 - 50000" };
                            } else {
                                // Return errors without the id property (clears it)
                                const { id, ...rest } = currentErrors;
                                return rest;
                            }
                        });
                    }}
                    >
                    </input>
                    {errors.id && <> {errors.id}</>}
                </div> */}

                <div className="form-group">
                    <label>Enter ID</label>
                    <input
                        className="form-control"
                        onChange={(e) => {
                            const value = e.target.value;

                            // 1. Update the employee data
                            setEmployee({ ...employee, id: value });

                            // 2. Validation Logic
                            if (value === "") {
                                setErrors({ ...errors, id: "id is empty" });
                            }
                            else if (Number(value) <= 0) {
                                setErrors({ ...errors, id: "invalid id" });
                            }
                            else if (Number(value) < 10000 || Number(value) > 50000) {
                                // FIXED: Use setErrors instead of return
                                setErrors({ ...errors, id: "ID must be between 10000 - 50000" });
                            }
                            else {
                                // FIXED: Clear the error state when valid
                                setErrors({ ...errors, id: "" });
                            }
                        }}
                    />
                    {errors.id && <span className="text-danger">{errors.id}</span>}
                </div>


                <div className="form-group">
                    <label>enter name</label>
                    <input className="form-control" onChange={(e) => {
                        const value = e.target.value;
                        setEmployee({ ...employee, name: value })

                        if (value.length < 5 || value.length > 20) {
                            setErrors({ ...errors, name: "name must of  5- 20 chars" })
                        }
                        else {
                            setErrors({ ...errors, name: null })
                        }
                    }}
                    >
                    </input>
                    {errors.name && <> {errors.name}</>}
                </div>

                <div className="form-group">
                    <label>enter salary</label>
                    <input className="form-control" onChange={(e) => {
                        const value = e.target.value;
                        setEmployee({ ...employee, salary: value })

                        if (e.target.value < 10000 || e.target.value > 50000) {
                            setErrors({ ...errors, salary: "salary must between 10000 - 50000" })
                        }
                        else {
                            setErrors({ ...errors, salary: 0 })
                        }
                    }}
                    >
                    </input>
                    {errors.salary && <span className="text-danger text-info"> {errors.salary}</span>}
                </div>
                <div>
                    <button type="submit">add record</button>
                    <button type="reset">cancel record</button>
                </div>

            </form>
            {msg}
        </div>
    )
}