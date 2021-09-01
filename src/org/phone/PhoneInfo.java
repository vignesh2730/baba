package org.phone;

public class PhoneInfo {
	public void phoneName() {
		System.out.println("Nokia");
		
	}
public void osName() {
	System.out.println("anroid");
}

public void storage() {
	System.out.println("16 gp");

}

public static void main(String[]args) {
	PhoneInfo o =new PhoneInfo();
	o.phoneName();
	o.osName();
	o.storage();
}
}
