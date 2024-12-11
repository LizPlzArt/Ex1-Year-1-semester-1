import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex1Test {

    /**
     * This JUnit class represents a very partial test class for Ex1.
     * Make sure you complete all the needed JUnits
     */
        //test passed
        @Test
        void computeNumberTest() {
            String s2 = "1011b2";
            int v = Ex1.number2Int(s2);
            assertEquals(v,11);

            String s10 = "1011bA";
            v = Ex1.number2Int(s10);
            s2 = Ex1.int2Number(v,2);
            int v2 = Ex1.number2Int(s2);
            assertEquals(v,v2);
            assertTrue(Ex1.equals(s10,s2));
        }

        //test passed
        @Test
        void isBasisNumberTest() {
            String[] good = {"1b2", "01b2", "123bA", "ABbG", "0bA"};
            for(int i=0;i<good.length;i=i+1) {
                boolean ok = Ex1.isNumber(good[i]);
                assertTrue(ok);
            }
            String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
            for(int i=0;i<not_good.length;i=i+1) {
                boolean not_ok = Ex1.isNumber(not_good[i]);
                assertFalse(not_ok);
            }
        }

        @Test
        void int2NumberTest() {
            int[] natNum = {12345, 666, 666};
            int[] base = {6,6,9};
            String[] ans = {"133053b6","3030b6","820b9"};

            for(int i=0;i<natNum.length;i=i+1)
            {
                String number = Ex1.int2Number(natNum[i],base[i]);
                assertEquals(number,ans[i]);
            }

        }

        //test passed
        @Test
        void maxIndexTest() {
            String[] arrStr = {"100111b2","12345b6","012b5","123bG","EFbG"};
            assertEquals(Ex1.maxIndex(arrStr),1);
        }

        // Add additional test functions - test as much as you can.

}
