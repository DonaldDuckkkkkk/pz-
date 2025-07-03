function number1() {
    let n = prompt("Enter array length:");
    n = parseInt(n);

    if (isNaN(n) || n <= 0) {
        alert("Invalid number :D");
        return;
    }

    let mac = Array.from({ length: n }, (_, i) => i + 1).reverse();
    console.log(`Length: ${n} ==> [ ${mac} ]`);
    alert("Generated array in console");
}

function number2(mac) {
    let num = mac.find(num => mac.indexOf(num) === mac.lastIndexOf(num));
    if (num == null) {
        alert("No unique number");
    }
    console.log("Array ==>", mac, "Number ==>:", num);
    return num;
}

function number3(mac) {
    return mac.flat().sort((a, b) => a - b);
}

let a, b, plus, min, sum, riz;

function numbers() {
    a = prompt("Enter first number:");
    a = parseInt(a);

    if (isNaN(a)) {
        alert("Invalid number :D");
        return;
    }

    b = prompt("Enter second number:");
    b = parseInt(b);

    if (isNaN(b)) {
        alert("Invalid number :D");
        return;
    }

    plus = a + b;
    min = a - b;
    sum = a * b;
    riz = a / b;
}

function add() {
    alert(`${a} + ${b} = ${plus}`);
}

function sub() {
    alert(`${a} - ${b} = ${min}`);
}

function mul() {
    alert(`${a} * ${b} = ${sum}`);
}

function div() {
    if (a <= 0 && b <= 0) {
        alert("Error :D");
        return;
    }
    alert(`${a} / ${b} = ${riz}`);
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
            alert("No such operation");
    }
}

function number5() {
    let a = prompt("Enter a number:");
    a = parseInt(a);

    if (isNaN(a)) {
        alert("Invalid number :D");
        return;
    }

    if (a > 0) {
        alert("Number is positive");
    } else if (a === 0) {
        alert("Zero");
    } else {
        alert("Number is negative");
    }

    if (a <= 1) {
        alert("Number is not prime");
    } else if (a === 2) {
        alert("Prime number");
    } else if (a % 2 === 0) {
        alert("Number is not prime");
    } else {
        let isPrime = true;
        for (let i = 3; i <= Math.sqrt(a); i += 2) {
            if (a % i === 0) {
                isPrime = false;
                break;
            }
        }
        alert(isPrime ? "Prime number" : "Not a prime number");
    }

    let txt = "";
    if (a % 2 === 0) txt += "Divisible by 2\n"; else txt += "Not divisible by 2\n";
    if (a % 5 === 0) txt += "Divisible by 5\n"; else txt += "Not divisible by 5\n";
    if (a % 3 === 0) txt += "Divisible by 3\n"; else txt += "Not divisible by 3\n";
    if (a % 6 === 0) txt += "Divisible by 6\n"; else txt += "Not divisible by 6\n";
    if (a % 9 === 0) txt += "Divisible by 9\n"; else txt += "Not divisible by 9\n";

    alert(txt || "Number not divisible by 2, 5, 3, 6, 9");
}

function number8(arr) {
    let sum = arr.reduce((acc, num) => acc + num, 0);
    let serA = sum / arr.length;
    alert("Arithmetic mean: [" + serA + "]");
}

function number9(mac) {
    let arr = mac.map(element => typeof element === 'number' ? element ** 2 : element).reverse();
    alert(arr.join(', '));
}

function number10() {
    let side = prompt("Enter side length:");
    let count = prompt("Enter number of sides:");

    if (isNaN(side) || isNaN(count) || side <= 0 || count <= 0) {
        alert("Invalid number :D");
        return;
    }
    alert(`Perimeter = ${side * count}`);
}