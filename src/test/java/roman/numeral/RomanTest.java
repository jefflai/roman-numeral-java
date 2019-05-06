package roman.numeral;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RomanTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"I", 1},
                {"V", 5},
                {"X", 10},
                {"L", 50},
                {"C", 100},
                {"D", 500},
                {"M", 1000},
                {"XXXIX", 39},
                {"CCXLVI", 246},
                {"MMCDXXI", 2421},
                {"CLX", 160},
                {"CCVII", 207},
                {"MLXVI", 1066},
                {"MDCCLXXVI", 1776},
                {"MCMLIV", 1954},
                {"MCMXC", 1990},
                {"MMXIV", 2014}
        });
    }

    private String romanNumeral;
    private int integer;

    public RomanTest(String romanNumeral, int integer) {
        this.romanNumeral = romanNumeral;
        this.integer = integer;
    }

    @Test
    public void toInt() {
        assertEquals(integer, Roman.toInt(romanNumeral));
    }

    @Test
    public void toNumeral() {
        assertEquals(romanNumeral, Roman.toNumeral(integer));
    }

}
