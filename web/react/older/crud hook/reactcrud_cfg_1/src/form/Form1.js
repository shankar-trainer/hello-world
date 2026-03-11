//'use client'
import React, { useState } from "react";
//import { useForm } from "./useForm";
import { useForm } from 'react-hook-form';


const Form1 = () => {
  const [values, handleChange] = useForm({ email: "", password: "" });
  const [values2, handleChange2] = useForm({ firstName: "", lastName: "" });

  return (
    <div>
      <>
        <input name="email" value={values.email} onChange={handleChange} />
        <input
          type="password"
          name="password"
          value={values.password}
          onChange={handleChange}
        />
      </>
    </div>
  );
};

export default Form1;
//https://github.com/benawad/react-hooks-tutorial/blob/master/src/App.js