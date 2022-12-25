package check;

import constants.Constants;

public class Main {
	
	private static String firstname = "富岡";
	private static String lastname = "将司";
	
	private static void printName ( String firstname  , String lastname ) {
		 System.out.println("printNameメソッド" + "→" + firstname + lastname);
		 
	}

	public static void main(String[] args) {
		

		printName(firstname,lastname);
		
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		
		pet.introduce();
		rp.introduce();
		
		
		
		}
	
}
	

	 