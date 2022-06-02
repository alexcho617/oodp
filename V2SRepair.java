
class V2SRepair implements Visitor {

	/**
	 * Use Singleton pattern
	 * keep results of V1 CHecker
	 */
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
		return "=== Self Repairing on ";
	}

	public String systemMessageEngine(String engineState) {
		switch (engineState) {
			case "oil":
				return "Exchange oil for Gasoline Engine";

			case "irregularPower":
				return "Self clean the spark plug of Gasoline Engine";

			case "reducedPower":
				return "Supply more power from extra battery pack for Gasoline Engine";

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
				return "Exchanging Motor Battery Pack for Electric Motor";

			case "irregularMotorPower":
				return "Apply oil to motor brush contact of Electric Motor";

			case "vibratingMotor":
				return "Turn Tightly Motor Mounting Bolt of Electric Motor";

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
				return "Use an extra generator system for Regenerative Brake System";

			case "noElectric":
				return "Apply Oil to Brake Generator Contact Point of Regenerative Brake System";

			case "abnormalSpeedDecrease":
				return "Monitoring Brake and Generator Gear of Regenerative Brake System";

			case "OK":
				return null;

			default:
				break;
		}
		return null;
	}
}