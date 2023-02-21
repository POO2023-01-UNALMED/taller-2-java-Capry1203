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
        
        int anch = asientos.length;
        int contadorAsientos = 0;

        for (int i = 0 ; i < anch ; i++){
            if (asientos[i] == null ){
                contadorAsientos = contadorAsientos;
            } else{
                contAsientos++;
            }
        }
        return contadorAsientos;
    }

    String verificarIntegridad() {
//deficion de variables a usar

        int regAuto = registro;
        int regMotor = motor.registro;
        int cont = asientos.length;

        for ( int i = 0 ; i < cont ; i++ ){
            if (asientos[i] != null ){
                if (asientos[i].registro != regMotor){
                    return "Las piezas no son originales";
                }
            
                if (asientos[i].registro != regAuto){
                return "Las piezas no son originales";
                }
            }
        }
        
        return "Auto original";
    }

}