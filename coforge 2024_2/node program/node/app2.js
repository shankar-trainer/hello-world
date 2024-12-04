var express=require('express');
var app=express();

app.use(require('./router/index'));
app.use(require('./router/emp'));
app.listen(3000);
