package Tema6_Herencia.LlamadasHerencia;

public class LlamadaNacional extends  Llamada{
        private int franja;


        public LlamadaNacional (){}


        public LlamadaNacional(int nroOrigen,int nroDestino,int duracion, int franja){
            super(nroOrigen,nroDestino,duracion);
            // tambien calcula el coste aunque acà no esté
            this.franja=franja;
            calcular_coste();// hay que ponerlo 2 veces porque hasta la franja tiene un valor, pasado
        }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("franja "+ franja);

    }

    @Override
        public void calcular_coste() {
            switch (franja) {
                case 1:this.coste=this.duracion*0.20;
                break;
                case 2:this.coste=this.duracion*0.25;
                break;
                case 3:this.coste=this.duracion*0.30;
                break;
            }


            this.coste=this.duracion*15; // esto lo traigo de la base

        }
}
