package geo1;
import geo.Figura;

public  class Quadrado extends Figura {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double novoValor) {
        lado = novoValor;
    }


    @Override
    public double AREA(){
        return lado*lado;
    }
    @Override
    public double PERIMETRO(){
        return lado*4;
    }   

}