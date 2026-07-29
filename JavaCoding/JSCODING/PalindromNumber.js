let number = 12321;
let originalNumber = number;
let reversed = 0;

while (number > 0) {
    let digit = number % 10;
    reversed = reversed * 10 + digit;
    number = Math.floor(number / 10);
}

if (originalNumber === reversed) {
    console.log(originalNumber + " is a palindrome number.");
} else {
    console.log(originalNumber + " is not a palindrome number.");
}