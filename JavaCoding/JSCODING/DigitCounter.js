let number = 12321;
let reversed = 0;
let digit = 0;
let count = 0;
let evenCount = 0;
let oddCount = 0;
let sum = 0;
while (number > 0) {
    digit = number % 10;
    sum = sum + digit;
    reversed = reversed * 10 + digit;
    number = Math.floor(number / 10);
    count++;
    if (digit % 2 === 0) {
        // console.log(digit + " is an even digit.");
        evenCount++;
    } else {
        // console.log(digit + " is an odd digit.");
        oddCount++;
    }
}
console.log("Reversed Number: " + reversed);
console.log("Total Digits: " + count);
console.log("Even Digits: " + evenCount);
console.log("Odd Digits: " + oddCount);
console.log("Sum of Digits: " + sum);