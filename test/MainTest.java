import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.time.temporal.ValueRange;
import java.util.Random;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    Main main = new Main();

    @Test
    public void evenOddNumberIsTrue(){
        boolean res = main.evenOddNumber(8);
        assertTrue(res);
    }
    @Test
    public void evenOddNumberIsFalse(){
        boolean res = main.evenOddNumber(5);
        assertFalse(res);
    }
    @Test
    public void numIsLess(){
        boolean res = main.numberInInterval(23);
        assertFalse(res);
    }
    @Test
    public void numIsMore(){
        boolean res = main.numberInInterval(100);
        assertFalse(res);
    }
    @Test
    public void numIsInInterval(){
        boolean res = main.numberInInterval(40);
        assertTrue(res);
    }




}
