https://github.com/jskim1991/react-axios-interceptors.git
https://jskim1991.medium.com/react-routing-to-an-error-page-with-axios-interceptors

Handling 404 errors from an Axios GET request within a React hook involves using a try-catch block and managing state for the error.
1. Basic Error Handling with useState and useEffect:
JavaScript

import React, { useState, useEffect } from 'react';
import axios from 'axios';

function MyComponent() {
  const [data, setData] = useState(null);
  const [error, setError] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await axios.get('https://api.example.com/nonexistent-resource'); // This will trigger a 404
        setData(response.data);
      } catch (err) {
        if (err.response && err.response.status === 404) {
          setError('Resource not found (404)');
        } else {
          setError('An unexpected error occurred');
        }
      } finally {
        setLoading(false);
      }
    };

    fetchData();
  }, []); // Empty dependency array means this runs once on component mount

  if (loading) return <div>Loading...</div>;
  if (error) return <div>Error: {error}</div>;

  return (
    <div>
      {data ? <pre>{JSON.stringify(data, null, 2)}</pre> : <p>No data found.</p>}
    </div>
  );
}

export default MyComponent;
Explanation:
useState hooks: data stores the fetched data, error stores any error message, and loading indicates the request status.
useEffect hook: This hook initiates the data fetching when the component mounts.
try-catch-finally block:
try: Attempts the axios.get request.
catch(err): If an error occurs (like a 404), it's caught here.
err.response is checked to see if it's an HTTP error response.
err.response.status === 404 specifically checks for a 404 status.
setError updates the error state with a user-friendly message.
finally: setLoading(false) always runs after the try or catch block, regardless of success or failure.
2. Custom Hook for Reusability:
For more complex applications, encapsulate this logic into a custom hook for reusability:
JavaScript

import { useState, useEffect } from 'react';
import axios from 'axios';

const useFetch = (url) => {
  const [data, setData] = useState(null);
  const [error, setError] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await axios.get(url);
        setData(response.data);
      } catch (err) {
        if (err.response && err.response.status === 404) {
          setError('Resource not found (404)');
        } else {
          setError('An unexpected error occurred');
        }
      } finally {
        setLoading(false);
      }
    };

    fetchData();
  }, [url]); // Re-run if URL changes

  return { data, error, loading };
};

export default useFetch;
Usage of the Custom Hook:
JavaScript

import React from 'react';
import useFetch from './useFetch'; // Assuming useFetch.js is in the same directory

function AnotherComponent() {
  const { data, error, loading } = useFetch('https://api.example.com/another-nonexistent-resource');

  if (loading) return <div>Loading...</div>;
  if (error) return <div>Error: {error}</div>;

  return (
    <div>
      {data ? <pre>{JSON.stringify(data, null, 2)}</pre> : <p>No data found.</p>}
    </div>
  );
}

export default AnotherComponent;


=========== medium
======

[React] Routing to an Error Page with axios interceptors
Jay Kim
Jay Kim

Follow
3 min read
·
Jun 1, 2022
2


1



Recently, I came across a user story where the frontend routes to an Error Page when it fails to communicate with the backend.

GIVEN as 000 as user of this product
WHEN  navigating to a different page
THEN  I can see an error page when data was not fetched successfully
On top of that, users can go back to the previous page to retry.

GIVEN as 000 as user of this product and
      I am currently on the error page
WHEN  I click 'Go Back' button
THEN  I can go back to the previous page to use this product again
In order to implement this,

handle errors in catch block
use axios interceptors to intercept responses before they are handled by then or catch
For simplicity, I will route to an error page when the status is 404.

First Attempt
First attempt was to redirect to an error page using window.location.


However, with this approach the states stored on the frontend gets lost because window.location causes a reload according to this Stack Overflow answer.

From this experiment, I learned that I had to use navigate from react-router-v6 in order to maintain the states. Then, the challenge was about how to use useNavigate hook outside of React components.

Second Attempt
Second attempt was to handle errors in try-catch. With this approach, React components using this HttpClient.get() will have to pass in a callback function for routing.


Then, the page calling HttpClient would look like this. This would be adequate if each React Component needs to route to different error pages. However, normally different error pages are meant for different error statuses.


Final Implementation with Unit Tests
We have most of it working, the final attempt was to merge the good sides of past attempts and to refactor. I liked the idea of using interceptors more because then all axios requests work the same way and the page components making these requests don’t need to worry about the callbacks.

HttpClient

Here is the test code to verify that HttpClient will work the way it is intended. This demonstrates how to unit test axios interceptors.


App
In the App.js, the interceptors need to be set up. index.js could be a better place to set up one thing because App.js will run every time when a different page is rendered. To ensure that the interceptors are set up once, a boolean state was used.


ProductDetailPage
All the navigate callbacks from the page component seen in the second attempt are now gone because the callback is provided in App.js.


ErrorPage
Of course, the error page needs to have a button to go back to the previous page.


Tests for the error page:


Integration Tests
Lastly, here are some integration tests to cover user journeys.

Happy Path

Happy(?) Path with Error Page
This test is to cover the entire flow where user starts off happy but then sees the error page with an error. Then user can click “Go Back” button to retry from the UI.


This article covered

How to use axios interceptors to handle specific errors
How to unit test axios interceptors
How to integrate test with axios interceptors
Full source can be found at:

GitHub - jskim1991/react-axios-interceptors


