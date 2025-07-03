let a, b, plus, min, sum, riz;

function number1() {
    let n = prompt("Enter array length:");
    n = parseInt(n);

    if (isNaN(n) || n <= 0) {
        displayOutput("Invalid number :D");
        return;
    }

    let mac = Array.from({ length: n }, (_, i) => i + 1).reverse();
    console.log(`Length: ${n} ==> [ ${mac} ]`);
    displayOutput(`Generated array: [ ${mac} ] (Check console)`);
}

function number2(mac) {
    let num = mac.find(num => mac.indexOf(num) === mac.lastIndexOf(num));
    if (num == null) {
        displayOutput("No unique number");
    } else {
        displayOutput(`Array: [ ${mac} ], Unique number: ${num}`);
    }
    console.log("Array ==>", mac, "Number ==>:", num);
    return num;
}

function number3(mac) {
    return mac.flat().sort((a, b) => a - b);
}

function numbers() {
    a = prompt("Enter first number:");
    a = parseInt(a);

    if (isNaN(a)) {
        displayOutput("Invalid number :D");
        return;
    }

    b = prompt("Enter second number:");
    b = parseInt(b);

    if (isNaN(b)) {
        displayOutput("Invalid number :D");
        return;
    }

    plus = a + b;
    min = a - b;
    sum = a * b;
    riz = a / b;
}

function add() {
    displayOutput(`${a} + ${b} = ${plus}`);
}

function sub() {
    displayOutput(`${a} - ${b} = ${min}`);
}

function mul() {
    displayOutput(`${a} * ${b} = ${sum}`);
}

function div() {
    if (a <= 0 && b <= 0) {
        displayOutput("Error :D");
        return;
    }
    displayOutput(`${a} / ${b} = ${riz}`);
}

function cacl() {
    let diy = prompt("Enter operation (+, -, *, /):");
    switch (diy) {
        case "+":
            add();
            break;
        case "-":
            sub();
            break;
        case "*":
            mul();
            break;
        case "/":
            div();
            break;
        default:
            displayOutput("No such operation");
    }
}

function number5() {
    let a = prompt("Enter a number:");
    a = parseInt(a);

    if (isNaN(a)) {
        displayOutput("Invalid number :D");
        return;
    }

    let output = "";
    if (a > 0) {
        output += "Number is positive\n";
    } else if (a === 0) {
        output += "Zero\n";
    } else {
        output += "Number is negative\n";
    }

    if (a <= 1) {
        output += "Number is not prime\n";
    } else if (a === 2) {
        output += "Prime number\n";
    } else if (a % 2 === 0) {
        output += "Number is not prime\n";
    } else {
        let isPrime = true;
        for (let i = 3; i <= Math.sqrt(a); i += 2) {
            if (a % i === 0) {
                isPrime = false;
                break;
            }
        }
        output += isPrime ? "Prime number\n" : "Not a prime number\n";
    }

    if (a % 2 === 0) output += "Divisible by 2\n"; else output += "Not divisible by 2\n";
    if (a % 5 === 0) output += "Divisible by 5\n"; else output += "Not divisible by 5\n";
    if (a % 3 === 0) output += "Divisible by 3\n"; else output += "Not divisible by 3\n";
    if (a % 6 === 0) output += "Divisible by 6\n"; else output += "Not divisible by 6\n";
    if (a % 9 === 0) output += "Divisible by 9\n"; else output += "Not divisible by 9\n";

    displayOutput(output || "Number not divisible by 2, 5, 3, 6, 9");
}

function number8(arr) {
    let sum = arr.reduce((acc, num) => acc + num, 0);
    let serA = sum / arr.length;
    displayOutput(`Arithmetic mean: [${serA}]`);
}

function number9(mac) {
    let arr = mac.map(element => typeof element === 'number' ? element ** 2 : element).reverse();
    displayOutput(arr.join(', '));
}

function number10() {
    let side = prompt("Enter side length:");
    let count = prompt("Enter number of sides:");

    if (isNaN(side) || isNaN(count) || side <= 0 || count <= 0) {
        displayOutput("Invalid number :D");
        return;
    }
    displayOutput(`Perimeter = ${side * count}`);
}