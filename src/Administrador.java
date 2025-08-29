public class Administrador extends Empleado{
    public Administrador(String nombre, Integer id) {
        super(nombre, id);
    }
    public void loco(String nombre){
        System.out.println(nombre + "  el trabaja como una perra ");
    }
    public void saludo() {
        System.out.println("hola");
    }
}
