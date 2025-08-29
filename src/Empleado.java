public class Empleado{
    private String nombre ;
    private Integer id;

    public Empleado(String nombre, Integer id){
        this.nombre =  nombre;
        this.id = id;
    }
    public void setName( String remplazo ){
        this.nombre = remplazo;
    }
    public String  getName(){
        return this.nombre;
    }
    public void trabajar1(String nombre){
        System.out.println(nombre +"  trabaja");
    }
}
