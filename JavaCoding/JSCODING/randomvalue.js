let randomNumber = Math.floor(Math.random() * 100) + 1; // Generates a random number between 1 and 100
console.log("Random Number:", randomNumber);

if (randomNumber % 2 === 0) {
    console.log(randomNumber + " is an even number.");
} else {
    console.log(randomNumber + " is an odd number.");
}

let result = false; // Initialize result as false
if (randomNumber >= 18) {
    console.log( "Person with age " + randomNumber + " is eligible for voting.");
    result = true;
} else {
    console.log(randomNumber + " is not eligible for voting.");
}

if (result) {
    console.log("The person is eligible to vote.");
} else {
    console.log("The person is not eligible to vote.");
}

const isStudent = true; // This variable is declared but not used in the code snippet
console.log("Is the person a student?", isStudent); // Output: true