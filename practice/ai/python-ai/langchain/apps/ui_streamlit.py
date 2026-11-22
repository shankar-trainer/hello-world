import streamlit as st

st.title("My First Website")

name = st.text_input("Enter your name")

if st.button("Submit"):
    st.success(f"Hello, {name}!")


# pip install streamlit
# streamlit run app.py    