import React, { useState } from 'react';

function RequiredFieldForm() {
  const [inputValue, setInputValue] = useState('');
  const [error, setError] = useState('');

  const handleInputChange = (e) => {
    const value = e.target.value;
    setInputValue(value);

    // Validate if the input is not empty
    if (!value.trim()) {
      setError('This field is required.');
    } else {
      setError('');
    }
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (!error) {
      // Submit form
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <input
        type="text"
        value={inputValue}
        onChange={handleInputChange}
      />
      {error && <p>{error}</p>}
      <button type="submit">Submit</button>
    </form>
  );
}
export default RequiredFieldForm;