
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrialTest {

    @Test
    public static void myFirstTest() {
        System.out.println("Hi! I am your first test!");
    }

    @Test
    public static void mySecondTest() {
        System.out.println("Second!");
    }

    @Test
    public static void failingTest() {
        System.out.println("I am a failing test that doesn't fail! YAY!");
    }

    @Test
    public static void newTest() {
        System.out.println("I am useless");
    }

}
