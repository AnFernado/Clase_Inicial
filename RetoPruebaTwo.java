public class RetoPruebaTwo {
    private String nombre;
    private int indentificacion;
    private String email;
    private int edad;
    private String area;
    private boolean isjefe;
    private double salario;

    //constructor
    public RetoPruebaTwo(String nombre, int indentificacion, String email, int edad, String area, boolean isjefe) {
        this.nombre = nombre;
        this.indentificacion = indentificacion;
        this.email = email;
        this.edad = edad;
        this.area = area;
        this.isjefe = isjefe;

        if (area.equals("desarrollo")) {
            salario = 4500000;
            if(isjefe){
                salario +=2500000;
            }
        }
        else {
            salario =3500000;
            if(isjefe){
                salario +=3000000;
            }
        }

        double deduccion = salario*0.08;
        if (salario>= 3634104){
            deduccion += salario*0.01;
        }
        salario-=deduccion;
    }

    public void info(){
        System.out.println("[Usuario]:");
        System.out.println("Nombre: "+nombre);
        System.out.println("Identificacion: "+indentificacion);
        System.out.println("Email: "+email);
        System.out.println("Edad: "+edad);
        System.out.println("Area: "+area);
        System.out.println("Salario: "+salario);
    }
}





