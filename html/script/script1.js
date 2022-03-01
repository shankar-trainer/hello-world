 function factorial( a){
      var  fact=1;
          
          for(let x=1;x<=a;x++){
             fact=fact*x;
          }

          console.log("factorial is "+fact)
          return fact;
       }      
       function fullname(fname,lname){
          alert("full name is "+fname+" "+lname)
       }