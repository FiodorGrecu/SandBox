let numbers  = [1, 2, 3, 4, NaN];

function showAlert() {
    alert("No numbers here pal !!!")
}
// Old JS script  |
             //   |
//                V

// if(numbers.indexOf(2) !== -1) { 
//     console.log('Array contains value');
// }

// The new Version ES7 of the same scrip 

// if (numbers.includes(3)) 
if (numbers.includes(5)) {
    console.log('Array contains value (indexOf())')
} else{
    console.log(function(showAlert) {
        showAlert();
    });
}
let i = 3;
let j = 4;
let k = 1;
for (var i = 0; i <3; i++){
    k += j;
    j = j-1;
    console.log()
}