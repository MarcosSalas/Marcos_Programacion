boton_agregar.addEventListener("click",(element)=>{
let contenido=input_agregar.value;
/* let lista= document.querySelector("#lista_primeros")
let nodoLi=document.createElement("li");
nodoLi.innerText = contenido;
nodoLi.classList.add ("list-group-item");
nodoLi.setAttribute("class","list-group-item");
nodoLi.setAttribute("id","valor");
lista.appendChild(nodoLi); */

//modificar el htlm
let lista= document.querySelector("#lista_primeros");
lista.innerHTML=`${lista.innerHTML} <li class=`list-group-item`>${contenido}<li>`;
});

input_agregar.addEventListener("keydown",(event) => {
    //sacar la tecla pulsada por consola
    //console.log(event.key);
    //console.log(input_agregar.value);
    contador++;
    spanPulsaciones.innerText = contador;

});
