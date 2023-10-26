public class CalculadoraArea {
    public static void main(String[] args) {
        FormaGeometrica[] ARRAY = new FormaGeometrica[3];
        ARRAY[0] = new Retangulo(5, 5);
        ARRAY[1] = new Circulo(5);
        ARRAY[2] = new Triangulo(5, 5);

        double AREA_TOTAL = calcularAreaTotal(ARRAY);
        System.out.println("Área total: " + AREA_TOTAL);
    }

    public static double calcularAreaTotal(FormaGeometrica[] formas) {
        double AREA_TOTAL = 0;
        for (int i = 0; i < formas.length; i++) {
            AREA_TOTAL = AREA_TOTAL + formas[i].calcularArea();
        }
        return AREA_TOTAL;
    }
}
