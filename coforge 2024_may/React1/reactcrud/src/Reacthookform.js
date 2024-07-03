import { useForm } from 'react-hook-form';

export const Reacthookform=()=> {
  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm();

  return (
    <form onSubmit={handleSubmit((data) => console.log(data))}>
      <div>
      <input {...register('firstName')} placeholder='Enter First Name'   />
      </div>
      <div>
      <input {...register('lastName', { required: true })}  placeholder='Enter First Name' />
      {errors.lastName && <p>Last name is required.</p>}
      </div>
      <div>
      <input {...register('age', { pattern: /\d+/ })}  placeholder='Enter Age' />
      {errors.age && <p>Please enter number for age.</p>}
      </div>
      <div>
      <input type="submit" />
      </div>
    </form>
  );
}
