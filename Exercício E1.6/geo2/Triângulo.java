package geo2;
import geo.Figura;

public class Triângulo extends Figura{
    private double base, lado1, lado2, altura;

    public Triângulo(double base, double lado1, double lado2, double altura) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double novoValor) {
        base = novoValor;
    }

    public double getLado1() {
        return lado1;
    }
    public void setLado1(double novoValor) {
        lado1 = novoValor;
    }

    public double getLado2() {
        return lado2;
    }
    public void setLado2(double novoValor) {
        lado2 = novoValor;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double novoValor) {
        altura = novoValor;
    }
    
    
    @Override
    public double AREA(){
        return (base*altura)/2;
    }

    @Override
    public double PERIMETRO(){
        return (lado1+lado2+base);
    }

    @Override
    public String desenhar() {
        return "Desenhando a Figura Triângulo";
    }
}