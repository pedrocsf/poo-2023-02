package geo4;
import geo.Figura;

public class Círculo extends Figura{
    private double raio;

    public Círculo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double novoValor) {
        raio = novoValor;
    }

    @Override
    public double AREA(){
        return Math.PI*raio*raio;
    }

    @Override
    public double PERIMETRO(){
        return 2*Math.PI*raio;
    }

    @Override
    public String desenhar() {
        return "Desenhando a Figura Círculo";
    }
}