package tutorial43;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot(7);
		robot.start();
		
		// call inner class from robot;
		// need to call the robot instance defined
		// above for new Brain class
		// will only work if the Brain inner class is declared
		// as public
		// Robot.Brain brain = robot.new Brain();
		//
		// brain.think();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}

}
