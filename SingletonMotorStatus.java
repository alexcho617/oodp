import java.util.Random;

public class SingletonMotorStatus {

    private static SingletonMotorStatus instance;
    private static String state;

    //private constructor for singleton pattern
    private SingletonMotorStatus() {
        Random rand = new Random();
        int num = rand.nextInt(4) + 1;
        switch (num) {
            case 1:
            SingletonMotorStatus.state = "reducedMotorPower";
                break;
            case 2:
            SingletonMotorStatus.state = "irregularMotorPower";

                break;
            case 3:
            SingletonMotorStatus.state = "vibratingMotor";

                break;
            case 4:
            SingletonMotorStatus.state = "OK";
                break;
            default:
                break;
        }
    }

    public static SingletonMotorStatus createMotorStatus() {
        if (instance == null)
        instance = new SingletonMotorStatus();
        return instance;
    }
    public static String returnMotorStatus(){
        return state;
    }
}
