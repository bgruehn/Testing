import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

@Test

public void additionWhenTenPlusFiveThenReturn15() {
// GIVEN

int a = 10;
int b = 5;

//WHEN
int actual = a + b;
//THEN

int expected = 15;
assertEquals(expected, actual);

}
}
