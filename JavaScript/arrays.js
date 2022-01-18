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
var num = [1,3,5,6]
for (let i = 0; i <num.length; i++) {
   console.log(num[i]);
}