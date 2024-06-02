https://docs.djangoproject.com/en/5.0/intro/tutorial01/


"E:\software\python\Portable Python-3.10.5 x64\App\Python\python.exe  

pip install 
 download get-pip.py 
E:\software\python\Portable Python-3.10.5 x64\App\Python\python.exe   get-pip.py

pip location

E:\software\python\Portable Python-3.10.5 x64\App\Python\Scripts


set path=E:\software\python\Portable Python-3.10.5 x64\App\Python\Scripts;"E:\software\python\Portable Python-3.10.5 x64\App\Python\

pip install Django 

create project 

django-admin startproject django_1 
cd django_1

python manage.py runserver

http://localhost:8000


Create App

python  manage.py startapp users

users/urls.py 
from django.urls import path

from . import views

urlpatterns = [
    path("", views.index, name="index"),
]

users/views.py 
from django.http import HttpResponse

def index(request):
    return HttpResponse("Hello, world. You're at the polls index.")


django_1/urls.py 

from django.contrib import admin
from django.urls import include, path

urlpatterns = [
    path("users/", include("users.urls")),
    path("admin/", admin.site.urls),
]
	
	restart server 
	python manage.py runserver
	
	open 
	
http://localhost:8000/users/

============= in intellij ======

set path=C:\Users\shankar\PycharmProjects\django1\.venv\Scripts

pip install Django 

django-admin startproject my_tennis_club

cd my_tennis_club

python manage.py runserver

http://localhost:8000/

in pycharm 
 setting python interpreter click on + sign or (alt+insert)
select package 
click on install



pip install jupyterlab

launch JupyterLab with:

jupyter lab
pip install notebook
To run the notebook:

jupyter notebook

jupyter notebook <notebook>.ipynb

jupyter lab <notebook>.ipynb
