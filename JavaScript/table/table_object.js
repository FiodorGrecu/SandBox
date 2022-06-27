function Person(firstName, lastName, age, zodiac) {
    this.firstName = firstName;
    this.lasttName = lastName;
    this.age = age;
    this.zodiac = zodiac;
}

var me = new Person("Fiodor", "Grecu", 37, "Gemini");
var natalia = new Person("Natalia", "Grecu", 37, "Leo");

console.table(me);
console.table(natalia);