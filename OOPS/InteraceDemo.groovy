package OOPS

class InterfaceDemo implements InterfaceCar {
	String name
		@Override
	public Object startEngine() {
		println "Starting Engine for $name"
	}

	@Override
	public Object stopEngine() {
		println "Stopping Engine for $name"
	}
	
	static void main(args) {
		InterfaceDemo carname = new InterfaceDemo()
		carname.name = "Suzuki"
		carname.startEngine()
		carname.stopEngine()
			}
}
