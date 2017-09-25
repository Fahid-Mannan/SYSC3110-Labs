import java.util.*;

public class BuddyInfo {
	private String name;
	private String address;
	private long phoneNum;
	
	
	public BuddyInfo() {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		BuddyInfo buddy = new BuddyInfo();
		buddy.setName("Homer");
		System.out.println("Hello " + buddy.getName() + ".");
	}

}
