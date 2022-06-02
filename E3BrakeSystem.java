
class E3BrakeSystem implements Element {
	public void accept(Visitor v) {
		SingletonBrakeStatus status = SingletonBrakeStatus.createBrakeStatus();
		v.visit(this);
	}

	public String getMotorState(){
		return SingletonBrakeStatus.returnBrakeStatus();
	}
	@Override
	public String toString(){
		return "Break System";
	}
}
