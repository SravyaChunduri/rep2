package numbers;

import java.util.Scanner;

public class UDO {
	public String name;
	public int age;
	public UDO(){
		System.out.println("Enter name: ");
		Scanner in = new Scanner(System.in);
		name = in.nextLine();
		System.out.println("Enter age: ");
		age= in.nextInt();
	}

}
