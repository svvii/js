package tu.paquete;

import org.junit.jupiter.api.Test; // Cambia a JUnit 5
import static org.junit.jupiter.api.Assertions.assertEquals; // Cambia a JUnit 5

public class SumaTest {

    @Test
    public void testSumaNumerosEnteros() {
        assertEquals(5.0, Suma.sumar(2, 3));
    }

    @Test
    public void testSumaNumerosDecimales() {
        assertEquals(6.0, Suma.sumar(2.5, 3.5));
    }

    @Test
    public void testSumaMixta() {
        assertEquals(5.5, Suma.sumar(2, 3.5));
    }

    @Test
    public void testSumaConTexto() {
        assertEquals("Error", Suma.sumar(2, "texto"));
    }

    @Test
    public void testSumaConTextoAlInicio() {
        assertEquals("Error", Suma.sumar("texto", 3));
    }

    @Test
    public void testSumaConDosTextos() {
        assertEquals("Error", Suma.sumar("texto", "texto"));
    }
}
