FROM node:alpine
WORKDIR /usr/src/app
COPY . /usr/src/app
RUN npm  i -g create-react-app
RUN npm install

CMD ["npm", "run", "start"]

# docker build -t reactapp .
#docker run -p 3000:3000 reactapp
