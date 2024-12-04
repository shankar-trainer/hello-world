FROM node:alpine
WORKDIR /usr/src/app
COPY . /usr/src/app
RUN npm install -g @angular/cli
RUN npm install

CMD ["ng", "serve", "--host", "0.0.0.0"]
#EXPOSE 8080

# docker build -t app5 .
# docker run -t app5 
#docker run -p 4200:4200 app5 