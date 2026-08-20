
from django.urls import path, include

from .views import home_view
from django.contrib import admin

urlpatterns = [
    path('admin/', admin.site.urls),
     path('', home_view, name='home'),
]
