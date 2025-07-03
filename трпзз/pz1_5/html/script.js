function loopWhile() {
    let a = 0;
    while (a <= 100) {
        console.log(`Number: ${a}`);
        a++;
    }
    alert("While loop completed. Check console for numbers 0 to 100.");
}

function loopDoWhile() {
    let a = 0;
    do {
        if (a === 0) {
            console.log(`${a} - this is zero`);
        } else if (a % 2 === 0) {
            console.log(`${a} - even number`);
        } else {
            console.log(`${a} - odd number`);
        }
        a++;
    } while (a <= 10);
    alert("Do-while loop completed. Check console for numbers 0 to 10 with parity.");
}

function loopFor() {
    let a = 0;
    for (a; a <= 10; console.log(`Number: ${a++}`)) {}
    alert("For loop completed. Check console for numbers 0 to 10.");
}

function loopDivide() {
    let numb = 10000;
    let result = numb;
    let counter = 0;

    while (result >= 50) {
        result = result / 2;
        counter++;
    }

    console.log("Penultimate number > 50: " + result * 2);
    console.log("Number of iterations: " + counter);
    alert(`Divide loop completed. Penultimate number: ${result * 2}, Iterations: ${counter}. Check console.`);
}