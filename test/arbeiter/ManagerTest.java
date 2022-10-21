package arbeiter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {

    Manager manager = new Manager(5001, "alfred", 4000, 2 );

    @Test
    public void testID() {
        assertThrows(IllegalArgumentException.class, () -> {
            Manager manager = new Manager(1, "arnold", 5000, 2000); //
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Manager manager = new Manager(6000, "gustav", 5000, 2000);
        });
        assertDoesNotThrow(() -> {
            Manager manager = new Manager(5023, "alfred", 5000, 2000);
        });
    }

    @Test
    public void testEinkommen() {
        assertEquals(12000, manager.einkommen(), 0); //festgehalt + bonuszahlung
    }

    @Test
    public void testBonus() {
        assertEquals(8000, manager.berechneBonus(), 0);
    }
}
