"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var Employee_1 = require("./Employee");
var BankEmployee = /** @class */ (function (_super) {
    __extends(BankEmployee, _super);
    function BankEmployee(empId, empName, empSalary, location, hra) {
        var _this = _super.call(this, empId, empName, empSalary) || this;
        _this.location = location;
        _this.hra = hra;
        return _this;
    }
    BankEmployee.prototype.bankEmpInfo = function () {
        _super.prototype.empInfo.call(this);
        console.log('location is ' + this.location);
        console.log('hra is ' + this.hra);
    };
    return BankEmployee;
}(Employee_1.Employee));
var emp1 = new BankEmployee(1001, 'a kumar', 20000, 'chennai', 0.05);
emp1.bankEmpInfo();
