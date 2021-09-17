public class Gorila extends Animal {   //Gorila
 public Gorila(double peso, double altura){
  this.peso =peso;
  this.altura= altura;
 }
 public  double getPesoAlims(){
  double totalPesoAlims=0;

  for (Alimento alimento:this.alimsIngeridos){
       totalPesoAlims += alimento.getGramos();
  }
  return  totalPesoAlims;
 }

}
