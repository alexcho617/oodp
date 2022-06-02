
class V3SCRecovery implements Visitor {


	public void visit(E1GasolineEngine engine) {
		System.out.println("=E " + message() + engine.toString());
		System.out.println(systemMessageEngine(engine.getEngineState()));
	}

	public void visit(E2ElectricMotor motor) {
		System.out.println("=M " + message() + motor.toString());
		System.out.println(systemMessageMotor(motor.getMotorState()));

	}

	public void visit(E3BrakeSystem brake) {
		System.out.println("=B " + message() + brake.toString());
		System.out.println(systemMessageBrake(brake.getMotorState()));

	}

	public String message(){
		return "= Software Control and Recovery for ";
	}
	public String systemMessageEngine(String engineState) {
		switch (engineState) {
			case "oil":
				return "Increase the control sowftware level of oil supply for Gasoline Engine";

			case "irregularPower":
				return "Software Resetting for Gasoline Engine";

			case "reducedPower":
				return "Increase minimum power level for Gasoline Engine";

			case "OK":
			return "Engine Running OK";

			default:
				break;
		}
		return null;
	}

	public String systemMessageMotor(String motorState) {
		switch (motorState) {
			case "reducedMotorPower":
				return "Increase Motor Battery Pack Power Monitoring Loop for Electric Motor";

			case "irregularMotorPower":
				return "Generating a Motor Power Monitoring Module from the Abstract Factory";

			case "vibratingMotor":
				return "TInitiate Monitoring SW for Motor Vibration of Electric Motor";

			case "OK":
				return "Normal Motor Power";

			default:
				break;
		}
		return null;
	}

	public String systemMessageBrake(String brakeState) {
		switch (brakeState) {
			case "weakElectric":
				return "Initiate the monitoring SW for Weak Electricity Problem of Regenerative Brake";

			case "noElectric":
				return "Initiate the monitoring SW for No Electricity Proglem from Regenerative Brake";

			case "abnormalSpeedDecrease":
				return "Initiate Speed monitoring SW for Regenerative Brake System";

			case "OK":
				return null;

			default:
				break;
		}
		return null;
	}

}