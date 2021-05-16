package check;

import constants.Constants;

public class Check {

	private static String firstName = "関屋";
	private static String lastName = "諒";

	public Check() {
	}
	public static void main(String[] args) {

		System.out.println("printNameメソッド → "+ printName(firstName,lastName));
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		robotpet.introduce();
	}

	private static String printName(String first_Name,String last_Name) {
		return first_Name+last_Name;
	}
}
