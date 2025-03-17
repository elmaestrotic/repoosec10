package primera_generacion;

import segunda_generacion.Murcielago;

public class Vampiro implements Murcielago, SerInmortal{
    //atributos
    private String nombre;
    private int edad;

    @Override
    public void amamantar() {}

    @Override
    public void vivirParaSiempre() {
        System.out.println("Viviendo para siempre..");
    }


    private interface tratarDeAguantarSol {
        void aguantarSol();
    }

    final public void aguantarSol() {
        if(this.getClass()== Vampiro.class){
            System.out.println("No asará papi..");
        }else{
            System.out.println("Sólo los vampiros 1a generación pueden aguantar sol\n¡mera flor!");
        }
    }

    //métodos
    public Vampiro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void morder(){
        System.out.println("Vampiro mordiendo");
    }
    public void chuparSangre(){
        System.out.println("Vampiro chupando sangre..");
    }
    /*protected void aguantarSol(){
        System.out.println("Vampiro aguantando sol..");
    }*/

    @Override
    public void volar() {
        System.out.println("Vampiro volando como mUrcielago..");
    }

}
