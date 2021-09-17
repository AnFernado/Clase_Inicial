public class RetoPrueba {
    public static double calcularPorcentajeBono(int anios,float bono) {
        double porcentaje;
       if (anios>=10){
           porcentaje=0.3;
       }
       else if (anios>=5){
           porcentaje=0.2;
       }
       else if (anios>=3){
           porcentaje=0.1;
       }
       else{
           porcentaje=0.1;
       }
        return porcentaje*bono;

    }



}
