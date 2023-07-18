import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void main() {
        // Divisible par 3 et 5
        assertEquals("FizzBuzz", "15");
        // Divisible par 3
        assertEquals("Fizz", "18");
        // Divisible par 5
        assertEquals("Buzz", "25");

    }
}