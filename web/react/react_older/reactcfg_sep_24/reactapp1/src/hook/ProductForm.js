import { useForm } from "react-hook-form";

export const ProductForm = () => {
    const { register, handleSubmit, formState: { errors } } = useForm()
    const onSubmit = data => console.log(data);
    return (
        <div className="container p-5 m-5 w-50 bg-info">
            <form onSubmit={handleSubmit(onSubmit)}>
                <div className="form-group">
                    <label>Enter First Name</label>
                    <input {...register("firstName", { required: "first name is required", maxLength: 20, minLength: 5 })} className="form-control"></input>
                    <span className="text-danger"> {errors.firstName && errors.firstName.message}</span>
                    <span className="text-danger">{errors.firstName?.type === 'maxLength' && <p role="alert">first name maximum length is 20 </p>}
                    </span>

                    <span className="text-danger">{errors.firstName?.type === 'minLength' && <p role="alert">first name minLength is 5 character </p>}
                    </span>

                </div>
                <div className="form-group">
                    <label>Enter Last  Name</label>
                    <input {...register("lastName", { required: "last name is required", maxLength: 20 })} className="form-control"></input>
                    <span className="text-danger">{errors.lastName && errors.lastName.message}</span>
                    <span className="text-danger">{errors.lastName?.type === 'maxLength' && <p role="alert">last name maximum length is 20 </p>}
                    </span>
                    <span className="text-danger">{errors.lastName?.type === 'minLength' && <p role="alert">last name minLength is 5 character </p>}
                    </span>

                </div>

                <div className="form-group">
                    <label>Enter Age</label>
                    <input type="number" {...register("age", { min: 18, max: 99, required: true })} className="form-control" />
                    <span className="text-danger">{errors.age?.type === 'required' && <p role="alert"> age is empty</p>}
                    </span>

                    <span className="text-danger">{errors.age?.type === 'min' && <p role="alert">min age is 18 years</p>}
                    </span>
                    <span className="text-danger">{errors.age?.type === 'max' && <p role="alert">max age is 99 years</p>}
                    </span>
                </div>

                <div className="form-group">
                    <label>Enter Email</label>
                    <input  {...register("email", {
                        minLength: 10, maxLength: 20, required: true,
                        pattern: {
                            value: /^[A-Z0-9]._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/i,
                            message: "invalid email address"
                        }
                    })} className="form-control" />
                    <span className="text-danger"> {errors.email && errors.email.message}</span>

                    <span className="text-danger">{errors.email?.type === 'required' && <p role="alert">email is empty</p>}</span>

                    <span className="text-danger">{errors.email?.type === 'minLength' && <p role="alert">email must of 10 character minimum</p>}
                    </span>
                    <span className="text-danger">{errors.email?.type === 'maxLength' && <p role="alert">email must of 20 character  maximum</p>}
                    </span>
                </div>

                <div>
                    <input type="submit" className="btn btn-primary mt-3" ></input>
                    <input type="reset" className="btn btn-primary mt-3" ></input>
                </div>
            </form >
        </div >
    )

}

