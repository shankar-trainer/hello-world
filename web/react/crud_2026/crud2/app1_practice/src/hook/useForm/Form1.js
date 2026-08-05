import { useForm } from "react-hook-form";

export const Form1=()=>{

      const { register, handleSubmit } = useForm();
  
  function onSubmit(data) {
    console.log(data);
  }

  return (
    <form onSubmit={handleSubmit(onSubmit)}>
      <input {...register("firstName")} /> 
      <button type="submit">Submit</button>
    </form>
  );


}