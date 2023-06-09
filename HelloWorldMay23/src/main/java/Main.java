import shapes.Circle;
import shapes.Shape;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("choose env (dev or test):");
        Scanner scanner = new Scanner(System.in);
        String env = scanner.nextLine();
        FileInputStream fis;

        if (1 > 0) {
            System.out.println("1 is greater than 0");
        }
        System.out.println("");

        Properties properties = new Properties();
        fis = switch (env) {
            case "test" -> new FileInputStream("src/resources/test-env.properties");
            case "dev" -> new FileInputStream("src/resources/dev-env.properties");
            default -> new FileInputStream("src/resources/test-env.properties");
        };

        properties.load(fis);

        // getting a url from a property file
        String url = properties.getProperty("application.url");

        // getting username from property file
        String username = properties.getProperty("test.username"); /* block comment */
        String password = properties.getProperty("test.password");


        System.out.println("Opening url: " + url);
        System.out.println("Using username: " + username);
        System.out.println("Using password: " + username);

        Circle circle = new Circle(123);

        //
        printShapeArea(circle,
                "sadkljghklsahgslkhvklsahdvsfklsjahvkl" +
                        "jsavhklsjavhklsavhlsjslkavhsl");

    }

    /**
     * Method prints the area of a shape
     * @param shape
     *
     */
    public static void printShapeArea(Shape shape, String str) {
        System.out.println(shape.getArea());
    }

    public static void printShapeArea(Circle circle) {

    }
}