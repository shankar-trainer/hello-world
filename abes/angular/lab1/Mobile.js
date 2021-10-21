"use strict";
exports.__esModule = true;
var Mobile = /** @class */ (function () {
    function Mobile(mobileId, mobileName, mobileCost) {
        this.mobileId = mobileId;
        this.mobileName = mobileName;
        this.mobileCost = mobileCost;
    }
    Mobile.prototype.printMobileDetail = function () {
        console.log('mobile Id ' + this.mobileId);
        console.log('mobile Name ' + this.mobileName);
        console.log('mobile Cost ' + this.mobileCost);
    };
    return Mobile;
}());
exports.Mobile = Mobile;
