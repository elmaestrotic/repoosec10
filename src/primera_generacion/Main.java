package primera_generacion;

import segunda_generacion.Drácula;

public class Main {
    public static void main(String[] args) {
        SerInmortal inmortal=new Drácula(188,"Juan",600);
        inmortal.vivirParaSiempre();//como Drácula
        inmortal = new Vampiro("Cornelius",1200);
        inmortal.vivirParaSiempre();//como Vampiro
        Drácula dracula = new Drácula(185, "Vladimir", 200);
        dracula.hipnotizar();//poder propio de Drácula
        dracula.morder();//método heredado de Vampiro
        dracula.chuparSangre();//método heredado de Vampiro
        dracula.aguantarSol();//método heredado de Vampiro
        dracula.volar();//método heredado de la interfaz Murcielago
        dracula.comerFrutas();//método heredado de la interfaz Murcielago
        dracula.nacer();//método de ser Vivo heredado a través de la interf Murcielago

        Vampiro oto= new Vampiro("Otto",1000);
        oto.aguantarSol();
    }
}
