var lifeInches = 45;

var calcInches = function(startAge, endAge, inchesPerYear) {
    var totalInches = inchesPerYear * (endAge - startAge)
    lifeInches += totalInches;
    return totalInches;
}

console.log("From 0 - 7 years:" + calcInches(0,7,2))
console.log("From 7 - 16 years:" + calcInches(7,16, 4))
console.log("Total growth over life :" + lifeInches)
