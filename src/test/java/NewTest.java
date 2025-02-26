import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {

    public String a = "1";
    public String b = "1";
    @Test
    public void test1() {
        Assert.assertEquals(a, b, "Strings are not equals");
    }
    @Test
    public void test2() {
        Assert.assertNotEquals(a, b, "Strings are equals");
    }
}
