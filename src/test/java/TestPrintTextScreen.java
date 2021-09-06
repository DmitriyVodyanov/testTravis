import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPrintTextScreen {

    private String text = "Hello, World!";
    private String text1 = "test test test";
    private String text2 = "new test";

    PrintTextScreen printText;
    @Before
    public void setUp() {
        printText = new PrintTextScreen();
    }

    @Test
    public void printTextHello() {
        Assert.assertEquals("Test 1. Hello world", "Hello, World!", printText.printText(text));
    }

    @Test
    public void printTextTest() {
        Assert.assertEquals("Test 2. test", "test test test", printText.printText(text1));
    }

    @Test
    public void printTextNewTest() {
        Assert.assertEquals("Test 3. new test", "new test", printText.printText(text2));
    }



}
