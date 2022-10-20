package src;

import arbeiter.BueroArbeiter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BueroArbeiterTest {

    BueroArbeiter bueroArbeiter;

    @BeforeEach
    public void setup() {
        bueroArbeiter = new BueroArbeiter(5120,"arnold", 5000);
    }

    @Test
    public void testID(){
        assertThrows(IllegalArgumentException.class, () -> {
            BueroArbeiter bueroArbeiter = new BueroArbeiter(1, "arnold", 5000);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            BueroArbeiter bueroArbeiter1 = new BueroArbeiter(6000, "gustav", 5000);
        });
    }

}
