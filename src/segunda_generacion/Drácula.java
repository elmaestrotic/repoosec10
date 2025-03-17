package segunda_generacion;

import primera_generacion.SerInmortal;
import primera_generacion.Vampiro;

public class Drácula extends Vampiro implements SerInmortal {
    private int estatura;

    public Drácula(int estatura, String nombre, int edad) {
        super(nombre, edad);//primero lo de la clase super
        this.estatura = estatura;//luego atributos propios
    }

    public void hipnotizar(){
        System.out.println("Venga q' no es pa' eso..");
    }


    @Override
    public void vivirParaSiempre() {
        System.out.println("Viviendo para siempre y cuando no le claven una estaca" +
                "\nni le dé el sol..");
    }
}
