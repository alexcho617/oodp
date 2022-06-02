
class V1SCCheck implements Visitor {

	/**
	 * Use Observer Pattern
	 * Generate Log HTML File
	 * Check the state of element and look it up on the log.
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

	public String message() {
		return "System/Component Checking on ";
	}

	public String systemMessageEngine(String engineState) {
		switch (engineState) {
			case "oil":
				return "Engine Oil To Be Checked on Gasoline Engine";

			case "irregularPower":
				return "Irregular Engine Power with Gasoline Engine";

			case "reducedPower":
				return "Engine Power Reduced with Gasoline Engine";

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
				return "Engine Oil To Be Checked on Gasoline Engine";

			case "irregularMotorPower":
				return "Irregular Engine Power with Gasoline Engine";

			case "vibratingMotor":
				return "Engine Power Reduced with Gasoline Engine";

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
				return "Weak Generative Electricity with Regenerative Brake System";

			case "noElectric":
				return "No Electricity Generated with Regenerative Brake System";

			case "abnormalSpeedDecrease":
				return "Abnormal Speed Decrease with Regenerative Brake System";

			case "OK":
				return "Normal Regen. Brake Working with Regenerative Brake System";

			default:
				break;
		}
		return null;
	}


}