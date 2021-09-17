import java.util.TreeSet;

public class Reto4 { //Usuario
    private TreeSet<String> telefonos= new TreeSet<>();
    public void addTelefono(String telefono) {
        telefonos.add(telefono);
    }
    public  void mostrarTelefonos(){
        System.out.println(this.telefonos);


    }
}
