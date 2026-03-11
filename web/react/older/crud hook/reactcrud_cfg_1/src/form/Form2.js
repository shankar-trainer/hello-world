import { useForm } from "react-hook-form";
//import { useForm } from 'react-hook-form';
function Form2() {
    const {register, handleSubmit} = useForm();

    function onSubmitButton(data) {
        console.log(data)
    }

    return (
        <>
        <div className="bg-info w-50 p-5 m-5">
            <h1>Order weather</h1>
            <form onSubmit={handleSubmit(onSubmitButton)}>
                <div className="form-group">
            
                <input
                    {...register("fullName")}
                    type="text"
                    placeholder="Name and surname"
                    id="name" className="form-control"
                />
                </div>
                <div className="form-group">
                            
                <input
                    {...register("city")}
                    type="text"
                    placeholder="City"
                    id="city" className="form-control"
                />
                </div>
                <div className="form-group">
                <p>I would like to:</p>
                <label htmlFor="field-rain">
                    <input
                        {...register("weather")}
                        type="radio"
                        value="rain"
                        id="field-rain"
                
                    />
                    Rain
                </label>
                
                <label htmlFor="field-wind">
                    <input
                        {...register("weather")}
                        type="radio"
                        value="wind"
                        id="field-wind"
                    />
                    Lots of wind
                </label>
                
                <label htmlFor="field-sun">
                    <input
                        {...register("weather")}
                        type="radio"
                        value="sun"
                        id="field-sun"
                    />
                    Sunny
                </label>
                </div>
                <button type="submit">
                    Send
                </button>
            </form>
            <div>
                
            </div>
            </div>
        </>
    );
}

export default Form2;
