run project 

cd demo_project

then 
python manage.py runserver

http://127.0.0.1:8000/



================
📁 Step 1: Create and Enter a Project DirectoryOpen your terminal application and create a dedicated folder to house your web development files.bashmkdir django_example
cd django_example
Use code with caution.🌐 Step 2: Set Up a Virtual Environment (Recommended)Isolate your development libraries from your global operating system environments.On Windows (Command Prompt):cmdpython -m venv env
env\Scripts\activate
Use code with caution.On macOS / Linux:bashpython3 -m venv env
source env/bin/activate
Use code with caution.⚡ Step 3: Install DjangoDownload the core framework tools directly using the Python package manager.
bash
pip install django

🛠️ Step 4: Generate the Project StructureInitialize the baseline boilerplate code needed to build a functional web solution. We will title our template project demo_project.bashdjango-admin startproject demo_project
Use code with caution.Navigate straight into the primary root directory created by the utility script:bashcd demo_project
Use code with caution.🚀 Step 5: Start the Local Development ServerBoot up the lightweight, integrated web server to check your site instantly.bashpython manage.py runserver
Use code with caution.🖥️ Expected OutputYour terminal log window will provide the local system connection link:textWatching for file changes with StatReloader
Performing system checks...

System check identified no issues (0 silenced).
August 20, 2026 - 15:40:00
Django version 5.x
Starting development server at http://127.0.0.1:8000/
Quit the server with CONTROL-C.
Use code with caution.Open your internet browser and navigate directly to http://127.0.0.1:8000/ to view the rocket landing confirmation screen. Once you are done, press Ctrl + C inside your terminal window to safely terminate the running server session.If you are ready to begin building your web application components, let m
=====================
To add a home app to your Django project, follow these step-by-step instructions to create the app, set up a view, configure the URL routes, and register it with your project.

---

### Step 1: Create the Home App

Open your terminal (make sure your virtual environment is activated and you are in the root project folder containing `manage.py`) and run:

```bash
python manage.py startapp home

```

This creates a new folder named `home` with a basic file structure for models, views, and apps.

---

### Step 2: Register the App in `settings.py`

Open your project's main settings file (`my_django_project/settings.py`), find the `INSTALLED_APPS` list, and add your new `'home'` app:

```python
# my_django_project/settings.py

INSTALLED_APPS = [
    # ... default django apps ...
    'home.apps.HomeConfig',  # or simply 'home'
]

```

---

### Step 3: Create a View

Open `home/views.py` and write a simple view function that returns an HTTP response for your home page:

```python
# home/views.py

from django.http import HttpResponse

def home_view(request):
    return HttpResponse("Welcome to my Django Home Page!")

```

---

### Step 4: Configure URL Routing

1. Create a new file named `urls.py` inside the `home/` folder:
```python
# home/urls.py

from django.urls import path
from .views import home_view

urlpatterns = [
    path('', home_view, name='home'),
]

```


2. Connect the app's URLs to your main project URL configuration in `my_django_project/urls.py`:
```python
# my_django_project/urls.py

from django.contrib import admin
from django.urls import path, include

urlpatterns = [
    path('admin/', admin.site.urls),
    path('', include('home.urls')),  # Routes root URL to the home app
]


### Step 5: Test Your Home Page

Start your development server again if it isn't already running:

```bash
python manage.py runserver

```

localhost:8000

================

To create a new Django project from scratch, you run the django-admin startproject <project_name> command in your command line terminal.Here is a step-by-step example showing how to build, configure, and launch a brand new Django project called my_store.1. Set Up Your EnvironmentBefore running Django commands, it is best practice to create a dedicated environment folder using the Python Virtual Environments Guide to keep your packages isolated.bash# Create a project folder and enter it
mkdir my_store_project && cd my_store_project

# Create a virtual environment
python -m venv venv

# Activate the virtual environment
# On macOS/Linux:
source venv/bin/activate
# On Windows:
venv\Scripts\activate

# Install Django
pip install django
Use code with caution.
2. Create the Django ProjectUse the core Django administration command-line tool to initialize your project template:bashdjango-admin startproject my_store .
Use code with caution.(Note: Adding the . at the end creates the configuration files directly inside your current folder, avoiding an extra nested directory.)3. Verify Project StructureYour folder will now automatically contain the following structural configuration template:manage.py: A command-line utility used to interact with your project.my_store/: The main configuration package directory.__init__.py: Tells Python this directory is a package.settings.py: Settings and configurations for the project.urls.py: The URL declarations and routing maps for the website.asgi.py / wsgi.py: Web server integration hook configurations.4. Start the Local ServerVerify everything works perfectly by firing up Django's built-in local development server:bashpython manage.py runserver
Use code with caution.Open your favorite web browser and navigate to http://127.0.0.
You will be greeted by the default Django welcome splash page, confirming your new project is successfully configured and running!If you want to move beyond the welcome page, let me know:Would you like to create your first app




=====================================
https://docs.djangoproject.com/en/6.1/intro/tutorial01/

Writing your first Django app, part 1¶

Let’s learn by example.

Throughout this tutorial, we’ll walk you through the creation of a basic poll application.

It’ll consist of two parts:

    A public site that lets people view polls and vote in them.

    An admin site that lets you add, change, and delete polls.

We’ll assume you have Django installed already. You can tell Django is installed and which version by running the following command in a shell prompt (indicated by the $ prefix):
/ 

$ python -m django --version

If Django is installed, you should see the version of your installation. If it isn’t, you’ll get an error telling “No module named django”.

This tutorial is written for Django 6.1, which supports Python 3.12 and later. If the Django version doesn’t match, you can refer to the tutorial for your version of Django by using the version switcher at the bottom right corner of this page, or update Django to the newest version. If you’re using an older version of Python, check What Python version can I use with Django? to find a compatible version of Django.

Where to get help:

If you’re having trouble going through this tutorial, please head over to the Getting Help section of the FAQ.
Creating a project¶

If this is your first time using Django, you’ll have to take care of some initial setup. Namely, you’ll need to auto-generate some code that establishes a Django project – a collection of settings for an instance of Django, including database configuration, Django-specific options and application-specific settings.

From the command line, cd into a directory where you’d like to store your code and run the following command to bootstrap a new Django project:
/ 

$ django-admin startproject mysite djangotutorial

This will create a directory djangotutorial with a project called mysite inside. The directory name doesn’t matter to Django; you can rename it to anything you like. If it didn’t work, see Problems running django-admin.

Note

You’ll need to avoid naming projects after built-in Python or Django components. In particular, this means you should avoid using names like django (which will conflict with Django itself) or test (which conflicts with a built-in Python package).

Let’s look at what startproject created:

djangotutorial/
    manage.py
    mysite/
        __init__.py
        settings.py
        urls.py
        asgi.py
        wsgi.py

These files are:

    manage.py: A command-line utility that lets you interact with this Django project in various ways. You can read all the details about manage.py in django-admin and manage.py.

    mysite/: A directory that is the actual Python package for your project. Its name is the Python package name you’ll need to use to import anything inside it (e.g. mysite.urls).

    mysite/__init__.py: An empty file that tells Python that this directory should be considered a Python package. If you’re a Python beginner, read more about packages in the official Python docs.

    mysite/settings.py: Settings/configuration for this Django project. Django settings will tell you all about how settings work.

    mysite/urls.py: The URL declarations for this Django project; a “table of contents” of your Django-powered site. You can read more about URLs in URL dispatcher.

    mysite/asgi.py: An entry-point for ASGI-compatible web servers to serve your project. See How to deploy with ASGI for more details.

    mysite/wsgi.py: An entry-point for WSGI-compatible web servers to serve your project. See How to deploy with WSGI for more details.

The development server¶

Let’s verify your Django project works. Change into the djangotutorial directory, if you haven’t already, and run the following commands:
/ 

$ python manage.py runserver

You’ll see the following output on the command line:

Performing system checks...

System check identified no issues (0 silenced).

You have unapplied migrations; your app may not work properly until they are
applied. Run 'python manage.py migrate' to apply them.

August 19, 2026 - 15:50:53
Django version 6.1, using settings 'mysite.settings'
Starting development server at http://127.0.0.1:8000/
Quit the server with CONTROL-C.

WARNING: This is a development server. Do not use it in a production setting. Use a production WSGI or ASGI server instead.
For more information on production servers see: https://docs.djangoproject.com/en/6.1/howto/deployment/

Note

Ignore the warning about unapplied database migrations for now; we’ll deal with the database shortly.

Now that the server’s running, visit http://127.0.0.1:8000/ with your web browser. You’ll see a “Congratulations!” page, with a rocket taking off. It worked!

You’ve started the Django development server, a lightweight web server written purely in Python. We’ve included this with Django so you can develop things rapidly, without having to deal with configuring a production server – such as Apache – until you’re ready for production.

Now’s a good time to note: don’t use this server in anything resembling a production environment. It’s intended only for use while developing. (We’re in the business of making web frameworks, not web servers.)

(To serve the site on a different port, see the runserver reference.)

Automatic reloading of runserver

The development server automatically reloads Python code for each request as needed. You don’t need to restart the server for code changes to take effect. However, some actions like adding files don’t trigger a restart, so you’ll have to restart the server in these cases.
Creating the Polls app¶

Now that your environment – a “project” – is set up, you’re set to start doing work.

Each application you write in Django consists of a Python package that follows a certain convention. Django comes with a utility that automatically generates the basic directory structure of an app, so you can focus on writing code rather than creating directories.

Projects vs. apps

What’s the difference between a project and an app? An app is a web application that does something – e.g., a blog system, a database of public records or a small poll app. A project is a collection of configuration and apps for a particular website. A project can contain multiple apps. An app can be in multiple projects.

Your apps can live anywhere in your Python path. In this tutorial, we’ll create our poll app inside the djangotutorial folder.

To create your app, make sure you’re in the same directory as manage.py and type this command:
/ 

$ python manage.py startapp polls

That’ll create a directory polls, which is laid out like this:

polls/
    __init__.py
    admin.py
    apps.py
    migrations/
        __init__.py
    models.py
    tests.py
    views.py

This directory structure will house the poll application.
Write your first view¶

Let’s write the first view. Open the file polls/views.py and put the following Python code in it:
polls/views.py¶

from django.http import HttpResponse


def index(request):
    return HttpResponse("Hello, world. You're at the polls index.")

This is the most basic view possible in Django. To access it in a browser, we need to map it to a URL - and for this we need to define a URL configuration, or “URLconf” for short. These URL configurations are defined inside each Django app, and they are Python files named urls.py.

To define a URLconf for the polls app, create a file polls/urls.py with the following content:
polls/urls.py¶

from django.urls import path

from . import views

urlpatterns = [
    path("", views.index, name="index"),
]

Your app directory should now look like:

polls/
    __init__.py
    admin.py
    apps.py
    migrations/
        __init__.py
    models.py
    tests.py
    urls.py
    views.py

The next step is to configure the root URLconf in the mysite project to include the URLconf defined in polls.urls. To do this, add an import for django.urls.include in mysite/urls.py and insert an include() in the urlpatterns list, so you have:
mysite/urls.py¶

from django.contrib import admin
from django.urls import include, path

urlpatterns = [
    path("polls/", include("polls.urls")),
    path("admin/", admin.site.urls),
]

The path() function expects at least two arguments: route and view. The include() function allows referencing other URLconfs. Whenever Django encounters include(), it chops off whatever part of the URL matched up to that point and sends the remaining string to the included URLconf for further processing.

The idea behind include() is to make it easy to plug-and-play URLs. Since polls are in their own URLconf (polls/urls.py), they can be placed under “/polls/”, or under “/fun_polls/”, or under “/content/polls/”, or any other path root, and the app will still work.

When to use include()

You should always use include() when you include other URL patterns. The only exception is admin.site.urls, which is a pre-built URLconf provided by Django for the default admin site.

You have now wired an index view into the URLconf. Verify it’s working with the following command:
/ 

$ python manage.py runserver

Go to http://localhost:8000/polls/ in your browser, and you should see the text “Hello, world. You’re at the polls index.”, which you defined in the index view.

Page not found?

If you get an error page here, check that you’re going to http://localhost:8000/polls/ and not http://localhost:8000/.

When you’re comfortable with the basic request and response flow, read part 2 of this tutorial to start working with the database.
