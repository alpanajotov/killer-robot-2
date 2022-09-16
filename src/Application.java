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
            boolean isWallDetected = (objectId == OBJECT_WALL);
            boolean isChairDetected = (objectId == OBJECT_CHAIR);
            boolean isClear = (objectId == CLEAR);

            if (isWallDetected) {
                System.out.println("Go sideway");
            }
            if (isChairDetected) {
                System.out.println("Jump");
            }
            if (isClear) {
                System.out.println("Go forward");
            }
        }
    }

}
