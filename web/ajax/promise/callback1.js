function welcome(name) {
  console.log("welcome " + name)
}

function addition(a, b) {
  console.log("addition is " + (a + b))
}

// welcome("ram kumar");
// addition(12, 13);

// function show(msg, callback1, callback2) {
//   //console.log("show message"+msg);
//   setTimeout(() => {
//     console.log("show message " + msg)
//   }, 500);

//   callback1("amit kumar");
//   callback2(23, 25);
// }

function show(msg, callback1, callback2) {
  //console.log("show message"+msg);
  setTimeout(() => {
    console.log("show message " + msg)
    callback1("amit kumar");
    callback2(23, 25);
  }, 500);
}

show("greeting", welcome, addition)
