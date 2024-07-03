import { useForm } from "react-hook-form";
export default function App1() {
const { register, formState: { errors }, handleSubmit } = useForm();

return (
  <form onSubmit={handleSubmit()}>
   <input {...register("firstName", { required: true })} />
   {errors.firstName?.type === 'required' && "First name is required"}
  
   <input {...register("lastName", { required: true })} />
   {errors.lastName && "Last name is required"}
  
   <input type="submit" />
  </form>
 );
 }