import java.util.*;

public class AddressBook {
	private static Map<String, BuddyInfo> addressBook;
	
	public AddressBook() {
		addressBook = new HashMap<String, BuddyInfo>(); 
	}
	
	
	
	public static void insert(BuddyInfo buddy) {
		addressBook.put(buddy.getName(), buddy);
	}
	
	public static void remove(BuddyInfo buddy) {
		addressBook.remove(buddy.getName());
	}
	
	public Map<String, BuddyInfo> getAddressBook() {
		return addressBook;
	}

	public void setAddressBook(Map<String, BuddyInfo> addressBook) {
		this.addressBook = addressBook;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Address Book");
		BuddyInfo buddy = new BuddyInfo();
		buddy.setName("Fahid");
		
		insert(buddy);
		remove(buddy);
		
		System.out.println("Testing git pull...");
	}
	
}
