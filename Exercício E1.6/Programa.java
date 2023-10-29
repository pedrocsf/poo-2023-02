import geo.Figura;
import geo1.Quadrado;
import geo2.Triângulo;
import geo3.Retangulo;
import geo4.Círculo;

public class Programa{
    public static void main(String[] args) {
        Quadrado quadrado_obj = new Quadrado(5);
        Triângulo triângulo_obj = new Triângulo(3,4,5,6);
        Retangulo retângulo_obj = new Retangulo(5,9);
        Círculo círculo_obj = new Círculo(5);
        
        Figura[] listaDeFiguras = {quadrado_obj, triângulo_obj, retângulo_obj, círculo_obj};

        for (Figura figura : listaDeFiguras) {
            System.out.println(figura.desenhar());
            System.out.println("Área da figura: " + figura.AREA());
            System.out.println("Perímetro da figura: " + figura.PERIMETRO());
            System.out.println("");
        }
    }   
}