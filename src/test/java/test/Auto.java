package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos (){
        
        int anch = asientos.lenght;
        int contAsientos = 0;

        for (int i = 0 ; i < anch ; i++){
            if (asientos[i] == null ){
                contAsientos = contAsientos;
            } else{
                contAsientos++;
            }
        }
    }

    String verificarIntegridad() {
        
    }

}