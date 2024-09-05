
public class CalcularMedia {
  private double nota1= 55;
  private double nota2= 68;

  public void calcular() {
    if(nota1<3){
      double media = (nota1+nota2)/2;
      System.err.println(media);
    }
  }
  public CalcularMedia() {
    this.calcular();
  }
  
}