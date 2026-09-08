
from django.contrib import admin
from django.db import router
from django.urls import path, include
from rest_framework import routers



urlpatterns = [
    path('snippets/', include('snippets.urls', namespace='snippets')),
    # path('', include(router.urls)),
    path('admin/', admin.site.urls),
]
