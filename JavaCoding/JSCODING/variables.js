let name = "John";
const age = 30;
var department = "Engineering";
var isStudent = true;

console.log("Name:", name);
console.log("Age:", age);
console.log("Department:", department);

// Updating the value of name
name = "Jane";
console.log("Updated Name:", name); // This will work because 'name' is declared with 'let'

if (isStudent) {
    console.log(name + " is a student.");
}

console.log(typeof name); // Output: string
console.log(typeof age); // Output: number
console.log(typeof department); // Output: string
console.log(typeof isStudent); // Output: boolean

const myName = "Hafiz Muhammad Ahsan";
console.log("myName Length is :",myName.length, "characters"); // Output: Hafiz Muhammad Ahsan

console.log("myName in Uppercase is :", myName.toUpperCase()); // Output: HAFIZ MUHAMMAD AHSAN
console.log("myName in Lowercase is :", myName.toLowerCase()); // Output: hafiz muhammad ahsan

console.log("Replace 'Muhammad' with 'Orhan' in myName :", myName.replace("Muhammad", "Orhan")); // Output: Hafiz Orhan Ahsan

console.log("myName includes 'Ahsan' :", myName.includes("Ahsan")); // Output: true