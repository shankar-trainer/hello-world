var a=10;

if(a%2==0)
alert(a+' is even no ')
else
alert(a+' is odd   no ')

var state=prompt('enter state');
switch (state) {
    case 'tamil nadu':
          alert(state+" capital is chennani");
        break;

    case 'west bengal':
          alert(state+" capital is kolkotta");
        break;

    case 'bihar':
          alert(state+" capital is patna");
        break;

    case 'uttar pardesh':
          alert(state+" capital is lucknow");
        break;

    default:
        aler('not found ')
        break;
}