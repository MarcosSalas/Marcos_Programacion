// console.log("Ejemplo de variable");
// let --> ámbito global y de método
// var --> ámbito global --> No se Utiliza
// const --> constantes

const DNI = "123456x"; //string
let nombre = "Borja";//string
let nombreObj = new String ("Elemento");//string
let apellido;//null -->undefined- exite pero no se la ha asignado un valor 
let edad = 37; //number
let carnet = true;  //boolean
let fecha = new Date(); //Date --> objet
 
apellido = "Martin";//string

//comprobación de tipos
console.log( typeof nombre);
console.log( typeof nombreObj);
console.log( typeof apellido);
console.log( typeof edad);
console.log( typeof carnet);
console.log( typeof fecha);
console.log( typeof apellido);


console.log(isNaN (nombre));
console.log(!isNaN (nombre));
console.log(isNaN (edad));
console.log(!isNaN (edad));

//salida por consola
// Mi nombre es XXX ZZZ y tengo CC



console.log("Mi nombre es "+ nombre +""+apellido+  "y tengo" + edad );
//mas utilizado
console.log(`Mi nombre es ${nombre} ${apellido} y tengo ${edad}`);
