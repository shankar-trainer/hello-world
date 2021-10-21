import {BasicPhone} from './BasicPhone';
import {SmartPhone} from './SmartPhone';

var bPhone=new BasicPhone(55656566,"nokia basic 105 ",6677,"basicType");
bPhone.printMobileDetail();
console.log('type '+bPhone.mobileType);

var sPhone=new SmartPhone(55656567,"samsung pro7 ",6677,"SmartPhone");
sPhone.printMobileDetail();
console.log('type '+sPhone.mobileType);

