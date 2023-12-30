// Завдання: https://shpp.gitbook.io/zero/tutorials/commands/hello-world#chastina-1

console.log("Hello world");

// Завдання: https://shpp.gitbook.io/zero/tutorials/commands/hello-world#chastina-2

console.log("hello\nworld");

// Завдання: https://shpp.gitbook.io/zero/tutorials/commands/hello-world#chastina-3

console.log(12892323 + 454665768);

// Завдання: https://shpp.gitbook.io/zero/tutorials/commands/swap#chastina-2
let first = 5;
let second = 10;

console.log(first);
console.log(second);
let third = 0;

third = second;
second = first;
first = third;

console.log(first);
console.log(second);

// Завдання: https://shpp.gitbook.io/zero/tutorials/commands/swap#chastina-3-ne-obovyazkovo
let first = 5;
let second = 10;

console.log(first);
console.log(second);
/*let third = 0;

third = second;
second = first;
first = third;*/

console.log(first + second - first);
console.log(second + first - second);

// Завдання: https://shpp.gitbook.io/zero/tutorials/commands/swap#chastina-3-ne-obovyazkovo
let first = 5;
let second = 10;

console.log(first);
console.log(second);

first = second + first;
second = first - second;
first = first - second;
console.log(first);
con ole.log(second);

let n = +prompt("введи число");

console.log(n + 1);

// Завдання: https://shpp.gitbook.io/zero/tutorials/input-output/addition
let n1 = prompt("введи першеЧисло число");
let n2 = prompt("введи другеЧисло число");
let n3 = +n1 + +n2;

console.put(n1);
console.put(" + ");
console.put(n2);
console.put(" = ");
console.put(+n3);