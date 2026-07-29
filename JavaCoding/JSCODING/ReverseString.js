let name = "Ahsan";
let reversedName = "";
let length = name.length;
for (let i = length - 1; i >= 0; i--) {
    reversedName = reversedName + name[i];
}
console.log(reversedName);