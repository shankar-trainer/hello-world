import { useForm } from 'react-hook-form';

export const Reacthookform = () => {
  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm();

  //  const onSubmit=(data)=>{
  //     alert("first name "+data.firstName)
  //     alert("last name "+data.lastName)
  //   }

  return (
    <form onSubmit={handleSubmit((data) => console.log(data))}>
      {/* <form onSubmit={handleSubmit(onSubmit)}> */}
      <div>
        <input {...register('firstName')} placeholder='Enter First Name' />
      </div>
      <div>
        <input {...register('lastName', { required: true })} placeholder='Enter First Name' />
        {errors.lastName && <p>Last name is required.</p>}
      </div>
      <div>
        <input {...register('age', { pattern: /\d+/ })} placeholder='Enter Age' />
        {errors.age && <p>Please enter number for age.</p>}
      </div>
      <div>
        <input type="submit" />
      </div>
    </form>
  );
}
