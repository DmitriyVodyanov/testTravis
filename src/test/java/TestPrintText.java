import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPrintText {

    private String text = "Hello, World!";

    PrintText printText;
    @Before
    public void setUp() {
        printText = new PrintText();
    }

    @Test
    public void printText() {
        Assert.assertEquals("Hello, World!", printText.printText(text));
    }

}
