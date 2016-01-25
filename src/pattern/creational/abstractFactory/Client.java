package pattern.creational.abstractFactory;

import java.util.Scanner;

/* 추상 팩토리 패턴
 * 관련성 있는 여러 종류의 객체를 일관된 방식으로 생성하는 경우
 */
public class Client {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("업체 : ");
		String vendorName=sc.nextLine();
		
		VendorID vendorID;
		if(vendorName.equalsIgnoreCase("LG"))
			vendorID=VendorID.LG;
		else //if(vendorName.equalsIgnoreCase("HYUNDAI"))
			vendorID=VendorID.HYUNDAI;
		
		ElevatorFactory factory=ElevatorFactoryFactory.getFactory(vendorID);
		
		Door door=factory.createDoor();
		Motor motor=factory.createMotor();
		motor.setDoor(door);
		
		door.open();
		motor.move(Direction.UP);
	}
}
