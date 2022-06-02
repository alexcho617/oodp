import java.util.Random;

public class SingletonEngineStatus {

    private static SingletonEngineStatus instance;
    private static String state;

    //private constructor for singleton pattern
    private SingletonEngineStatus() {
        Random rand = new Random();
        int num = rand.nextInt(4) + 1;
        switch (num) {
            case 1:
            SingletonEngineStatus.state = "oil";
                break;
            case 2:
            SingletonEngineStatus.state = "irregularPower";

                break;
            case 3:
            SingletonEngineStatus.state = "reducedPower";

                break;
            case 4:
            SingletonEngineStatus.state = "OK";
                break;
            default:
                break;
        }
    }

    public static SingletonEngineStatus createEngineStatus() {
        if (instance == null)
        instance = new SingletonEngineStatus();
        return instance;
    }
    public static String returnEngineStatus(){
        return state;
    }
}
