import java.util.ArrayList;

public class AddressBook {

 private ArrayList<BuddyInfo> buddyInfo;
	
	public AddressBook(String name) {
		
		buddyInfo = new ArrayList<BuddyInfo>();
		
	}
	
	public void addBuddy(BuddyInfo info) {
		
		buddyInfo.add(info);
	}
	
	public void removeBuddy(int index) {
		
		buddyInfo.remove(index);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Address Book");
	}
}
