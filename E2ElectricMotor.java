
class E2ElectricMotor implements Element {
	public void accept(Visitor v) {
		SingletonMotorStatus status = SingletonMotorStatus.createMotorStatus();
		v.visit(this);
	}

	public String getMotorState(){
		return SingletonMotorStatus.returnMotorStatus();
	}
	@Override
	public String toString(){
		return "Electric Motor";
	}
}
