import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        final int OBJECT_WALL = 1;
        final int OBJECT_CHAIR = 2;
        final int CLEAR = 3;

        while (true) {
            System.out.println("Какво има на пътя ми?");
            System.out.println("1. Стена");
            System.out.println("2. Стол");
            System.out.println("3. Чисто е");

            int objectId = inputScanner.nextInt();

            switch (objectId) {
                case 1:
                    System.out.println("Go sideway");
                    break;
                case 2:
                    System.out.println("Jump");
                    break;
                case 3:
                    System.out.println("Go forward");
                    break;
                default:
                    System.out.println("*** Repeat ***");
            }
        }
    }

}
