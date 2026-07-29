let a = 0;
let b = 1;
let c;
console.log(a);
console.log(b);
for (let i = 1; i <= 5; i++) {
    c = a + b;
    console.log(c);
    a = b;
    b = c;
}
