package org.example;

public class Main {

    private int movimentos;

    public int resolverTorreDeHanoi(int numDiscos) {
        movimentos = 0;
        moverDiscos(numDiscos, 'A', 'C', 'B');
        return movimentos;
    }

    private void moverDiscos(int n, char origem, char destino, char auxiliar) {
        if (n > 0) {
            moverDiscos(n - 1, origem, auxiliar, destino);
            System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
            movimentos++;
            moverDiscos(n - 1, auxiliar, destino, origem);
        }
    }
}
