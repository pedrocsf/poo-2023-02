package geo3;
import geo1.Quadrado;

public class Retangulo extends Quadrado{
    private double altura2;

    public Retangulo(double lado, double altura2) {
        super(lado);
        this.altura2 = altura2;
    }

    public double getAltura2() {
        return altura2;
    }
    public void setAltura2(double novoValor) {
        altura2 = novoValor;
    }

    @Override
    public double AREA(){
        return super.getLado()*altura2;
    }
    @Override
    public double PERIMETRO(){
        return 2*(super.getLado())+(altura2*2);
    }

}
