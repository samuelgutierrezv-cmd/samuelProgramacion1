public class Main {
    public static void main (String[] args){
        Empleado peon = new Empleado("richaerds", 1234);
        Empleado peon2 = new Administrador("alberto", 123321);
        Administrador peon1= new Administrador("alberto",1234556);
        System.out.println(peon.getName());
        peon.trabajar1(peon.getName());
        peon1.saludo();
        if(peon2 instanceof Administrador){
            ((Administrador)peon2).saludo();
        }else{
            System.out.println("no esta en esta clase");
        }
        peon1.loco(peon1.getName());
    }
}
