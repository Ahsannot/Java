// let name = "Hello World";
let name = "madam";
let reversedName = "";
let length = name.length;
for (let i = length - 1; i >= 0; i--) {
    reversedName = reversedName + name[i];
}
if (name === reversedName) {
    console.log(name + " is a palindrome string.");
} else {
    console.log(name + " is not a palindrome string.");
}