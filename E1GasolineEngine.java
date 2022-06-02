
class E1GasolineEngine implements Element {
	
	public void accept(Visitor v) {
		SingletonEngineStatus status = SingletonEngineStatus.createEngineStatus();
		v.visit(this);
	}

	public String getEngineState(){
		return SingletonEngineStatus.returnEngineStatus();
	}

	@Override
	public String toString(){
		return "Gasoline Engine";
	}
}
