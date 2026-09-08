It looks like you might have meant Django REST Framework (DRF), the powerful and flexible toolkit used to build Web APIs in Django.
Medium

Here is a quick overview of how to get started with Django REST Framework, its core features, and a brief setup guide.

## Core Features of Django REST Framework
Serializers: Converts complex data types (like Django querysets and model instances) into native Python data types that can easily be rendered into JSON or XML.
Medium

ViewSets & Routers: Combines the logic for multiple related views into a single class and automatically generates URL patterns.
Medium

Authentication & Permissions: Out-of-the-box support for authentication systems like OAuth1a, OAuth2, and JSON Web Tokens (JWT).
Medium

Browsable API: A helpful web-based UI that lets you interact with your API directly from the browser for easy testing and debugging.
Medium

## Quickstart Guide
1. Installation
Install DRF via pip:
www.django-rest-framework.org

Bash
pip install djangorestframework

2. Configure settings.py
Add rest_framework to your INSTALLED_APPS:
www.django-rest-framework.org

Python
INSTALLED_APPS = [
    # ...
    'django.contrib.admin',
    'django.contrib.auth',
    'django.contrib.contenttypes',
    'django.contrib.sessions',
    'django.contrib.messages',
    'django.contrib.staticfiles',

    # Third-party
    'rest_framework',
]
3. Define a Serializer and ViewSet
Create a basic serializer and viewset using Django’s built-in User model:
www.django-rest-framework.org

Python
from django.contrib.auth.models import User
from rest_framework import routers, serializers, viewsets

# 1. Serializer
class UserSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = User
        fields = ['url', 'username', 'email', 'is_staff']

# 2. ViewSet
class UserViewSet(viewsets.ModelViewSet):
    queryset = User.objects.all()
    serializer_class = UserSerializer
4. Setup URLs
Wire up your application URLs using DRF’s default router in your root urls.py:

Python
from django.contrib import admin
from django.urls import path, include
from rest_framework import routers
from yourapp.views import UserViewSet

router = routers.DefaultRouter()
router.register(r'users', UserViewSet)

urlpatterns = [
    path('admin/', admin.site.urls),
    path('', include(router.urls)),
    path('api-auth/', include('rest_framework.urls', namespace='rest_framework'))
]
If you meant something else by "django rest1" (such as a specific package, tutorial step, or configuration), please let me know!

python manage.py runserver
