import java.util.Random;

public class SingletonBrakeStatus {

    private static SingletonBrakeStatus instance;
    private static String state;

    //private constructor for singleton pattern
    private SingletonBrakeStatus() {
        Random rand = new Random();
        int num = rand.nextInt(4) + 1;
        switch (num) {
            case 1:
            SingletonBrakeStatus.state = "weakElectric";
                break;
            case 2:
            SingletonBrakeStatus.state = "noElectric";

                break;
            case 3:
            SingletonBrakeStatus.state = "abnormalSpeedDecrease";

                break;
            case 4:
            SingletonBrakeStatus.state = "OK";
                break;
            default:
                break;
        }
    }

    public static SingletonBrakeStatus createBrakeStatus() {
        if (instance == null)
        instance = new SingletonBrakeStatus();
        return instance;
    }
    public static String returnBrakeStatus(){
        return state;
    }
}
