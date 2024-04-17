import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class evenNumberTest {

    @Test
    public void testIfNumberIsEven() {
        //Given
        int number = 4;
        //When
        boolean actual = number % 2 == 0;
        //Then
        boolean expected = true;
        assertEquals(expected, actual);
    }
}
