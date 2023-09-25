public class Main {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Jumbo", "Bélgica");
        Velocista velocista1 = new Velocista(1234, "Peter Sagan", 50, 70);
        Escalador escalador1 = new Escalador(5678, "Nairo Quintana", 20, 15);
        Contrarelojista contrarelojista1 = new Contrarelojista(1357, "Esteban Chavez", 120);
        
        // Agregar los ciclistas al equipo
        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador1);
        equipo1.añadirCiclista(contrarelojista1);
        
        // Imprimir información del equipo y sus ciclistas
        //System.out.println("Información del equipo...");
        //System.out.println("Nombre del equipo: " + equipo1.getNombreEquipo());
        //System.out.println("País del equipo: " + equipo1.getPaisEquipo());
        //System.out.println("Integrantes del equipo: " + velocista1.getNombre() + escalador1.getNombre() + contrarelojista1.getNombre());
        equipo1.listarEquipo();
    }
}
