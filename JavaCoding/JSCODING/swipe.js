let a = 5;
let b = 10;

a = a + b;
b = a - b;
a = a - b;

console.log("After swapping, a is:", a);
console.log("After swapping, b is:", b);

if (a % 2 === 0) {
    console.log("Number a is even.");
} else {
    console.log("Number a is odd.");
}