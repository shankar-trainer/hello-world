in window 

set path
"C:\Users\shank\AppData\Local\Programs\Python\Python312";"C:\Users\shank\PycharmProjects\pythonProject\.venv\Scripts";"C:\Program Files\JetBrains\PyCharm Community Edition 2024.2.4\bin"

.venv\Scripts\activate

pip install django

django-admin startproject django2

py manage.py runserver

in pycharm  rt click in manage.py
run configuration

in window set interpretter
then in script parameter add
runserver


================================
python django in ubuntu 

first way 

 sudo apt install python3-pip python3-venv

 mkdir ~/newproject

 cd ~/newproject


 python3 -m venv my_env
 my_env/bin/activate
 my_env/bin/pip install django


 my_env/bin/pip install django


second way

 git clone git://github.com/django/django ~/django-dev
 cd ~/django-dev
 python3 -m venv my_env
 source my_env/bin/activate
 pip install -e ~/django-dev
 django-admin --version



=== running 

  create project 
  my_env/bin/django-admin startproject my_tennis_club 
  my_tennis_club$ cp -r ../my_env/ .

  my_env/bin/python3 manage.py runserver

  
  it will run the server


 Starting development server at http://127.0.0.1:8000/
Quit the server with CTRL-BREAK. 


