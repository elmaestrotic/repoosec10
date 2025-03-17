package segunda_generacion;




import primera_generacion.SerVivo;

public interface Murcielago extends Mamifero, SerVivo {
    void volar();

    default void comerFrutas(){
        System.out.println("Vampiro comiendo frutas..");
    }



}
