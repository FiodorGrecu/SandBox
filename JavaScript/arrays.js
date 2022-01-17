let numbers  = [1, 2, 3, 4, NaN];

// Old JS script  |
             //   |
//                V

// if(numbers.indexOf(2) !== -1) { 
//     console.log('Array contains value');
// }

// The new Version ES7 of the same scrip 

// if (numbers.includes(3)) 
if (numbers.includes(NaN)) {
    console.log('Array contains value (indexOf())')

}