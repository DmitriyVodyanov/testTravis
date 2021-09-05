import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPrintTextScreen {

    private String text = "Hello, World!";

    PrintTextScreen printText;
    @Before
    public void setUp() {
        printText = new PrintTextScreen();
    }

    @Test
    public void printText() {
        Assert.assertEquals("Test 1 Hello world", "Hello, World!", printText.printText(text));
    }

}
