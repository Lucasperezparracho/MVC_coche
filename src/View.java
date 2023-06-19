public class View {
    boolean muestraVelocidad(String matricula, Integer v){
        System.out.println("El coche " + matricula + " tiene una velocidad de: " + v + "km/h");
        return true;
    }
    void muestraCoche(Coche aux, String matricula){
        if(aux==null){
            System.out.println("No existe el coche con la matrícula: " + matricula);
        }
        else{
            System.out.println("El " + aux.modelo + " con la matrícula: " + aux.matricula + " tiene una velocidad de: " + aux.velocidad +"km/h");
        }
    }
    void muestraExceso(String matricula, Integer v){
        System.out.println("Alerta el coche: " + matricula + " tiene una velocidad excedida ha superado los 120km/h, tiene velocidad de: " + v + "km/h");
    }
}