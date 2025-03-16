import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.Main.sum;

public class SumTest {


    @Test
    public void testSum() {
        boolean res = sum(5, 6);
        Assert.assertTrue(res, "Результат больше 0");


    }
}
