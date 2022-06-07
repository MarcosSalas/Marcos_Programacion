//aritmeticos
let numero1= 6;
let numero2 = 10;

let suma = numero1 + numero2;
suma+=10;
let resta = numero1 - numero2;
resta-=10;
let multiplicacion = numero1 * numero2;
multiplicacion*=2;
let división = numero1 * numero2;
división/=2;


console.log(suma);
console.log(`La suma de los numero es ${suma}`);
console.log(`La multiplicacion de los numero es ${multiplicacion}`);
console.log(`La resta de los numero es ${resta}`);
console.log(`La división de los numero es ${división}`);
console.log(`La módulo de los numero es ${numero1 % numero2}`);

console.log(`El tipo del resto es ${typeof (numero1 % numero2)}`);

//operadores comparacion

numero1= 11;
numero2 = 10;

let mayorQue = numero1>numero2;
console.log(mayorQue);
let mayorIgual = numero1>=numero2;
console.log(mayorIgual);
let menorQue = numero1<numero2;
console.log(menorQue);
let menorIgual = numero1<=numero2;
console.log(menorIgual);
let diferente = numero1!=numero2;
console.log(diferente);
console.log("igual");
numero1=4;
numero2="4";
let igual = numero1===numero2;//con 3 = compueba valor y tipo ,con 2 = solo comprueba valor
console.log(igual);


//alert(`Bienvenido ${nombre}`);
//let confirmacion = confirm("¿Seguro que quieres continuar?");
//console.log(confirmacion);
//let introduccion =prompt("Introduce un dato a trabajar","parametro por defecto");
//console.log(introduccion);

/*Realiza un script que te pida el nombre y apellido
una vez intro se pediran dos nros a operar (c/u en prompt)
una vez intro los datos se pregunrará si se quiere realizar la operacion
en el caso de decir que si aparecera un mensaje con todas las operaciones y sus resultados
*/

let nomIntro =prompt("Introduce el nombre","Tu nombre..");
let apellIntro =prompt("Introduce el Apellido","Tu apellido..");
let nro1 =prompt(`${nomIntro} ${apellIntro} Introduce nro1 a operar`);
let nro2 =prompt(`${nomIntro} ${apellIntro} Introduce nro2 a operar`);
let confirmacionF=confirm("¿Quieres realizar la operacion?");

if (confirmacionF/*no se pone true por la redundancia*/) {
 suma = Number ( nro1) + Number (nro2);
 resta = nro1 - nro2;
 multiplicacion = nro1 * nro2;
 división = nro1 * nro2;
 alert(`El resultado de las operaciones entre ${nro1}y ${nro2} es :
 \nMultiplicacion
 \nDivision
 \nResta
 \nSuma 
 `);

    
}else{
   alert(`hasta la próxima`);
}





