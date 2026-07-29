const a = 5;
const b = "5";

if (a == b) {
    console.log("a is loosely equal to b");
} else {
    console.log("a is not loosely equal to b");
}

if (a === b) {
    console.log("a is strictly equal to b");
} else {
    console.log("a is not strictly equal to b");
}

const x = "250";
y = parseInt(x);

const z = y + 50;
console.log("The result of adding 50 to y is:", z);

const m = 12.895623;
const roundedM = m.toFixed(2);
console.log("Rounded value of m to 2 decimal places is:", roundedM);

const n = 15.6789;
const roundedN = n.toFixed(3);
console.log("Rounded value of n to 3 decimal places is:", roundedN);

