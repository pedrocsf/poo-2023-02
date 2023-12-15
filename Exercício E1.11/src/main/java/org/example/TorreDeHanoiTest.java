package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TorreDeHanoiTest {

    @Test
    public void testResolverTorreDeHanoiCom1Disco() {
        Main torreDeHanoi = new Main();
        int movimentos = torreDeHanoi.resolverTorreDeHanoi(1);
        assertEquals(1, movimentos);
    }

    @Test
    public void testResolverTorreDeHanoiCom3Discos() {
        Main torreDeHanoi = new Main();
        int movimentos = torreDeHanoi.resolverTorreDeHanoi(3);
        assertEquals(7, movimentos);
    }

    @Test
    public void testResolverTorreDeHanoiCom5Discos() {
        Main torreDeHanoi = new Main();
        int movimentos = torreDeHanoi.resolverTorreDeHanoi(5);
        assertEquals(31, movimentos);
    }
}

