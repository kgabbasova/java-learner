import org.junit.Assert;
import org.junit.Test;

public class BracketsTests {
    @Test
    public void checkBackets1(){
        String phrase = "";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkBackets2(){
        String phrase = "()";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkBackets3(){
        String phrase = "()()";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkBackets4(){
        String phrase = "(())";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkBackets5(){
        String phrase = "({})";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkBackets6(){
        String phrase = "([)]";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(false, result);
    }

    @Test
    public void checkBackets7(){
        String phrase = "[()]";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkBackets8(){
        String phrase = "[]{}()<>";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkBackets9(){
        String phrase = "([]{}){<>}";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkBackets10(){
        String phrase = "()(";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(false, result);
    }
    @Test
    public void checkBackets11(){
        String phrase = "(";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(false, result);
    }

    @Test
    public void checkBackets12(){
        String phrase = ")";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(false, result);
    }

    @Test
    public void checkBackets13(){
        String phrase = "((())";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(false, result);
    }

    @Test
    public void checkBackets14(){
        String phrase = "(()))";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(false, result);
    }

    @Test
    public void checkBackets15(){
        String phrase = "(([[]][]))";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkBackets16(){
        String phrase = "aa(([[]][]))";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkBackets17(){
        String phrase = "(([[aa]][]))";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkBackets18(){
        String phrase = "(([[]aa][]))";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkBackets19(){
        String phrase = "(([[]][]))";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkBackets20(){
        String phrase = "(([[]][]))aa";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkBackets21(){
        String phrase = "fd((";
        boolean result = Brackets.checkBrackets(phrase);
        Assert.assertEquals(false, result);
    }
}
