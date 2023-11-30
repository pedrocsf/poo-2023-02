import org.example.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestePessoa {

    @Test
    public void testImpostoMenosDe65SalarioBaixo() {
        Pessoa pessoa = new Pessoa("Joao", 30, 1500);
        assertEquals(150.0, pessoa.calculaImposto(), 0.001);
    }

    @Test
    public void testImpostoMenosDe65SalarioAlto() {
        Pessoa pessoa = new Pessoa("Maria", 40, 3000);
        assertEquals(450.0, pessoa.calculaImposto(), 0.001);
    }

    @Test
    public void testImpostoMaisDe65SalarioBaixo() {
        Pessoa pessoa = new Pessoa("José", 70, 1500);
        assertEquals(120.0, pessoa.calculaImposto(), 0.001);
    }

    @Test
    public void testImpostoMaisDe65SalarioAlto() {
        Pessoa pessoa = new Pessoa("Ana", 75, 3000);
        assertEquals(360.0, pessoa.calculaImposto(), 0.001);
    }

    @Test
    public void testImpostoMaisDe65TodasFaixasSalariais() {
        Pessoa pessoa1 = new Pessoa("Carlos", 68, 1500);
        Pessoa pessoa2 = new Pessoa("Marta", 70, 2500);
        Pessoa pessoa3 = new Pessoa("Pedro", 75, 3500);

        assertEquals(120.0, pessoa1.calculaImposto(), 0.001);
        assertEquals(200.0, pessoa2.calculaImposto(), 0.001);
        assertEquals(420.0, pessoa3.calculaImposto(), 0.001);
    }
}
