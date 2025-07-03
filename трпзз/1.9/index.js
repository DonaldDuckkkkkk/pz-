let a, b, plus, min, sum, riz;

function number1() {
    let n = prompt("Введіть довжину масиву:");
    n = parseInt(n);

    if (isNaN(n) || n <= 0) {
        displayOutput("Невірне число :D");
        return;
    }

    let mac = Array.from({ length: n }, (_, i) => i + 1).reverse();
    console.log(`Довжина: ${n} ==> [ ${mac} ]`);
    displayOutput(`Згенерований масив: [ ${mac} ] (Перевірте консоль)`);
}

function number2(mac) {
    let num = mac.find(num => mac.indexOf(num) === mac.lastIndexOf(num));
    if (num == null) {
        displayOutput("Немає унікального числа");
    } else {
        displayOutput(`Масив: [ ${mac} ], Унікальне число: ${num}`);
    }
    console.log("Масив ==>", mac, "Число ==>:", num);
    return num;
}

function number3(mac) {
    return mac.flat().sort((a, b) => a - b);
}

function numbers() {
    a = prompt("Введіть перше число:");
    a = parseInt(a);

    if (isNaN(a)) {
        displayOutput("Невірне число :D");
        return;
    }

    b = prompt("Введіть друге число:");
    b = parseInt(b);

    if (isNaN(b)) {
        displayOutput("Невірне число :D");
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
        displayOutput("Помилка :D");
        return;
    }
    displayOutput(`${a} / ${b} = ${riz}`);
}

function cacl() {
    let diy = prompt("Введіть операцію (+, -, *, /):");
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
            displayOutput("Немає такої операції");
    }
}

function number5() {
    let a = prompt("Введіть число:");
    a = parseInt(a);

    if (isNaN(a)) {
        displayOutput("Невірне число :D");
        return;
    }

    let output = "";
    if (a > 0) {
        output += "Число позитивне\n";
    } else if (a === 0) {
        output += "Нуль\n";
    } else {
        output += "Число негативне\n";
    }

    if (a <= 1) {
        output += "Число не є простим\n";
    } else if (a === 2) {
        output += "Просте число\n";
    } else if (a % 2 === 0) {
        output += "Число не є простим\n";
    } else {
        let isPrime = true;
        for (let i = 3; i <= Math.sqrt(a); i += 2) {
            if (a % i === 0) {
                isPrime = false;
                break;
            }
        }
        output += isPrime ? "Просте число\n" : "Непросте число\n";
    }

    if (a % 2 === 0) output += "Число ділиться на 2\n"; else output += "Число не ділиться на 2\n";
    if (a % 5 === 0) output += "Число ділиться на 5\n"; else output += "Число не ділиться на 5\n";
    if (a % 3 === 0) output += "Число ділиться на 3\n"; else output += "Число не ділиться на 3\n";
    if (a % 6 === 0) output += "Число ділиться на 6\n"; else output += "Число не ділиться на 6\n";
    if (a % 9 === 0) output += "Число ділиться на 9\n"; else output += "Число не ділиться на 9\n";

    displayOutput(output || "Число не ділиться на 2, 5, 3, 6, 9");
}

function number8(arr) {
    let sum = arr.reduce((acc, num) => acc + num, 0);
    let serA = sum / arr.length;
    displayOutput(`Середнє арифметичне: [${serA}]`);
}

function number9(mac) {
    let arr = mac.map(element => typeof element === 'number' ? element ** 2 : element).reverse();
    displayOutput(arr.join(', '));
}

function number10() {
    let side = prompt("Введіть довжину сторони:");
    let count = prompt("Введіть кількість сторін:");

    if (isNaN(side) || isNaN(count) || side <= 0 || count <= 0) {
        displayOutput("Невірне число :D");
        return;
    }
    displayOutput(`Периметр = ${side * count}`);
}