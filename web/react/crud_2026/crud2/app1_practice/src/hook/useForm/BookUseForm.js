import { useForm } from "react-hook-form"

export const BookUseForm=()=>{
  const{register,handleSubmit,formState:{errors},}  =useForm({
    mode: 'onChange' 
  })

const submit=(data)=>{
  alert('name is '+data.name)
  alert('cost is '+data.cost)
}
return(
    <div className="container">
        <form onSubmit={handleSubmit(submit)}>

         <div className="form-group">
            <label>enter name</label>
            <input {...register('name',{
                required:'name is required',
                minLength:{
                    value:5,
                    message:'name must of minimum 5 characters'
                    },
                     maxLength:{
                     value:15,
                     message:'name must of maximum 15 characters'
                      }
                     }
                    )} className="form-control"></input>
            
            {errors.name && <p>{errors.name.message}</p>}

         </div>
         
         <div className="form-group">
            <label>enter cost</label>
            <input {...register('cost',{required:true})} className="form-control"></input>
            {errors.cost && <p>cost is empty</p>}
         </div>
         <div className="form-group">
            <button type="submit">ok</button>
            <button type="reset">cancel</button>
         </div>
        </form>
    </div>
)
}

/*

By default, React Hook Form uses an "onSubmit" validation strategy. 
This means it won't check for errors (like your minLength or required rules) until the user first clicks that "ok" button.

If you want the validation to trigger as the user types, you need to set the mode in your useForm hook.
const { register, handleSubmit, formState: { errors } } = useForm({
  mode: 'onChange' // This is the secret sauce!
});

*/
