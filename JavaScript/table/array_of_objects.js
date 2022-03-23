function Person(firstName, lastName, age, zodiac, car) {
    this.firstName = firstName;
    this.lasttName = lastName;
    this.age = age;
    this.zodiac = zodiac;
    this.car = car;
}

var me = new Person("Fiodor", "Grecu", 37, "Gemini", "Jeep");
var natalia = new Person("Natalia", "Grecu", 37, "Leo", "Mercedes");
var sebastian = new Person("Sebastian", "Grecu", 6, "Scorpio", "None");

// console.table([me, natalia, sebastian], ["firstName"]["lastName"]["age"]["zodiac"]);
console.table([me, natalia, sebastian],["firstName"]['lastName']);
