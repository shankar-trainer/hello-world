npm install @ngrx/store --save


npm i angular-bootstrap


add in angular.json file. 

JSON

"styles": [
  "src/styles.css",
  "node_modules/bootstrap/dist/css/bootstrap.min.css"
],
"scripts": [
  "node_modules/bootstrap/dist/js/bootstrap.bundle.min.js"
]


--- for json server 
npm install -g json-server

make  file db.json and add values 
{
  "books":
    [
      {"isbn":"10001",
      "bname":"angular in action"
      }
    ]
}

json-server --watch db.json

  add in  app.config.ts 
    provideRouter(routes), for routing 
     provideStore({ counter: counterReducer }), for ngrx 
     importProvidersFrom(HttpClientModule) for HttpClient 
     
ng generate interceptor logging
