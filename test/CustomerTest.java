import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void testStatement() {
        
        Customer usuario = new Customer("Nickolas");
        
        Movie primeiro = new Movie("Hobbin Hood",2);
        Movie segundo = new Movie("O senhor dos anéis",1);
        
        Rental aluguel = new Rental(primeiro,5);
        Rental aluguel2 = new Rental(segundo,3);
        
        usuario.addRental(aluguel);
        usuario.addRental(aluguel2);
        
        String expResultado = "Rental Record for Nickolas\n\tHobbin Hood\t4.5\n\tO senhor dos anéis\t9.0\nAmount owed is 13.5\nYou earned 3 frequent renter points";
        String resultado = usuario.statement();
        
        assertEquals(expResultado, resultado);
    }
    
}
