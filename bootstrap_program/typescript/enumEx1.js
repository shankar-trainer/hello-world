var Season;
(function (Season) {
    Season[Season["Winter"] = 0] = "Winter";
    Season[Season["Autumn"] = 1] = "Autumn";
    Season[Season["Summer"] = 2] = "Summer";
})(Season || (Season = {}));
var s = Season.Autumn;
console.log(s);
console.log(Season.Summer);
// console.log(s)
function addition() {
    console.log('addition program');
}
function sum(p1, p2, p3) {
    return p1 + p2 + p3;
}
addition();
console.log(sum(11, 22, 33));
console.log(sum(11, 22, undefined));
