import java.util.concurrent.TimeUnit;;

public class Main {

    public static Element[] elementList = { new E1GasolineEngine(),
            new E2ElectricMotor(), new E3BrakeSystem() };

    public static void main(String[] args) {

        V1SCCheck vCheck = new V1SCCheck();
        V2SRepair vRepair = new V2SRepair();
        V3SCRecovery vRecovery = new V3SCRecovery();

        // MAIN TASK
        // First Visitor
        for (int i = 0; i < elementList.length; i++) {
            elementList[i].accept(vCheck);
        }
        System.out.println("---------------------");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Second Visitor
        for (int i = 0; i < elementList.length; i++) {
            elementList[i].accept(vRepair);
        }
        System.out.println("---------------------");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Third Visitor
        for (int i = 0; i < elementList.length; i++) {
            elementList[i].accept(vRecovery);

        }

    }
}