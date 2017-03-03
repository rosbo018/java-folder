import java.util.NoSuchElementException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Some tests for Dictionary...
 *
 * @author Marcel Turcotte (turcotte@eecs.uottawa.ca)
 */
public class DictionaryTest {

    @Test()
    public void testGetX() {
        System.out.println("test: testGetX");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        Assert.assertEquals(new Integer(1), dict.get("X"));
    }

    @Test()
    public void testGetY() {
        System.out.println("test: testGetY");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        Assert.assertEquals(new Integer(2), dict.get("Y"));
    }

    @Test()
    public void testGetZ() {
        System.out.println("test: testGetZ");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        Assert.assertEquals(new Integer(3), dict.get("Z"));
    }

    @Test()
    public void testGetXX() {
        System.out.println("test: testGetXX");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.put("X", new Integer(4));
        Assert.assertEquals(new Integer(4), dict.get("X"));
    }

    @Test()
    public void testGetYY() {
        System.out.println("test: testGetYY");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.put("Y", new Integer(4));
        Assert.assertEquals(new Integer(4), dict.get("Y"));
    }

    @Test()
    public void testGetZZ() {
        System.out.println("test: testGetZZ");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.put("Z", new Integer(4));
        Assert.assertEquals(new Integer(4), dict.get("Z"));
    }

    @Test()
    public void testContainsEmpty() {
        System.out.println("test: testContainsEmpty");
        Dictionary dict = new Dictionary();
        Assert.assertFalse(dict.contains("X"));
    }

    @Test()
    public void testContainsNotFound() {
        System.out.println("test: testContainsNoFound");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        Assert.assertFalse(dict.contains("W"));
    }

    @Test()
    public void testContainsX() {
        System.out.println("test: testContainsX");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        Assert.assertTrue(dict.contains("X"));
    }

    @Test()
    public void testContainsY() {
        System.out.println("test: testContainsY");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        Assert.assertTrue(dict.contains("Y"));
    }

    @Test()
    public void testContainsZ() {
        System.out.println("test: testContainsZ");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        Assert.assertTrue(dict.contains("Z"));
    }

    @Test()
    public void testContainsXX() {
        System.out.println("test: testContainsXX");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.put("X", new Integer(4));
        Assert.assertTrue(dict.contains("X"));
    }

    @Test()
    public void testContainsYY() {
        System.out.println("test: testContainsYY");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.put("Y", new Integer(4));
        Assert.assertTrue(dict.contains("Y"));
    }

    @Test()
    public void testContainsZZ() {
        System.out.println("test: testContainsZZ");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.put("Z", new Integer(4));
        Assert.assertTrue(dict.contains("Z"));
    }

    @Test()
    public void testPutDyncamicArray() {
        System.out.println("test: testPutDyncamicArray");
        Dictionary dict = new Dictionary();
        for (int i = 0; i < 1000; i++) {
            dict.put("X" + i, new Integer(i));
        }
        for (int i = 0; i < 1000; i++) {
            Assert.assertEquals(new Integer(i), dict.get("X" + i));
        }
    }

    @Test()
    public void testReplaceX() {
        System.out.println("test: testReplaceX");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.replace("X", new Integer(4));
        Assert.assertEquals(new Integer(4), dict.get("X"));
    }

    @Test()
    public void testReplaceY() {
        System.out.println("test: testReplaceY");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.replace("Y", new Integer(4));
        Assert.assertEquals(new Integer(4), dict.get("Y"));
    }

    @Test()
    public void testReplaceZ() {
        System.out.println("test: testReplaceZ");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.replace("Z", new Integer(4));
        Assert.assertEquals(new Integer(4), dict.get("Z"));
    }

    @Test()
    public void testReplaceXX() {
        System.out.println("test: testReplaceXX");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.put("X", new Integer(4));
        dict.replace("X", new Integer(5));
        Assert.assertEquals(new Integer(5), dict.get("X"));
    }

    @Test()
    public void testReplaceYY() {
        System.out.println("test: testReplaceYY");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.put("Y", new Integer(4));
        dict.replace("Y", new Integer(5));
        Assert.assertEquals(new Integer(5), dict.get("Y"));
    }

    @Test()
    public void testReplaceZZ() {
        System.out.println("test: testReplaceZZ");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.put("Z", new Integer(4));
        dict.replace("Z", new Integer(5));
        Assert.assertEquals(new Integer(5), dict.get("Z"));
    }

    @Test()
    public void testRemoveX() {
        System.out.println("test: testRemoveX");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.remove("X");
        Assert.assertFalse(dict.contains("X"));
        Assert.assertEquals(new Integer(2), dict.get("Y"));
        Assert.assertEquals(new Integer(3), dict.get("Z"));
    }

    @Test()
    public void testRemoveY() {
        System.out.println("test: testRemoveY");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.remove("Y");
        Assert.assertFalse(dict.contains("Y"));
        Assert.assertEquals(new Integer(1), dict.get("X"));
        Assert.assertEquals(new Integer(3), dict.get("Z"));
    }

    @Test()
    public void testRemoveZ() {
        System.out.println("test: testRemoveZ");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.remove("Z");
        Assert.assertFalse(dict.contains("Z"));
        Assert.assertEquals(new Integer(1), dict.get("X"));
        Assert.assertEquals(new Integer(2), dict.get("Y"));
    }

    @Test()
    public void testRemoveXX() {
        System.out.println("test: testRemoveXX");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.put("X", new Integer(4));
        dict.remove("X");
        Assert.assertEquals(new Integer(1), dict.get("X"));
        Assert.assertEquals(new Integer(2), dict.get("Y"));
        Assert.assertEquals(new Integer(3), dict.get("Z"));
    }

    @Test()
    public void testRemoveYY() {
        System.out.println("test: testRemoveYY");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.put("Y", new Integer(4));
        dict.remove("Y");
        Assert.assertEquals(new Integer(1), dict.get("X"));
        Assert.assertEquals(new Integer(2), dict.get("Y"));
        Assert.assertEquals(new Integer(3), dict.get("Z"));
    }

    @Test()
    public void testRemoveZZ() {
        System.out.println("test: testRemoveZZ");
        Dictionary dict = new Dictionary();
        dict.put("X", new Integer(1));
        dict.put("Y", new Integer(2));
        dict.put("Z", new Integer(3));
        dict.put("Z", new Integer(4));
        dict.remove("Z");
        Assert.assertEquals(new Integer(1), dict.get("X"));
        Assert.assertEquals(new Integer(2), dict.get("Y"));
        Assert.assertEquals(new Integer(3), dict.get("Z"));
    }

    @Test()
    public void testGetStatic() {
        System.out.println("test: testStatic");
        Dictionary d1 = new Dictionary();
        Dictionary d2 = new Dictionary();
        d1.put("X", new Integer(1));
        Assert.assertFalse(d2.contains("X"));
    }

}