import java.util.*;

public class AddressBook {
	private Map<String, BuddyInfo> addressBook;
	
	public AddressBook() {
		addressBook = new HashMap<String, BuddyInfo>(); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Address Book");
	}

	public Map<String, BuddyInfo> getAddressBook() {
		return addressBook;
	}

	public void setAddressBook(Map<String, BuddyInfo> addressBook) {
		this.addressBook = addressBook;
	}

}
