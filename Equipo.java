import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private String paisEquipo;
    private static double sumaTiempos;
    private List<Ciclista> cliclistas = new ArrayList<>();
    public Equipo(String nombreEquipo, String paisEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.paisEquipo = paisEquipo;
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public String getPaisEquipo() {
        return paisEquipo;
    }
    public void setPaisEquipo(String paisEquipo) {
        this.paisEquipo = paisEquipo;
    }
    public static double getSumaTiempos() {
        return sumaTiempos;
    }
    public static void setSumaTiempos(double sumaTiempos) {
        Equipo.sumaTiempos = sumaTiempos;
    }
    protected void añadirCiclista(Ciclista ciclista){
        //agregar cada uno de los ciclistas
        cliclistas.add(ciclista);
    }
    protected void listarEquipo(){
        //Nombre del equipo
        //País del equipo
        //Integrantes del equipo
        //System.out.println(cliclistas.get(0).getNombre());
        System.out.println("Nombre del equipo: " + nombreEquipo  + "\n" + "País del equipo: " + paisEquipo + "\n"+ "y sus integrantes del equipo:" + cliclistas.get(0).getNombre());
    }
}
