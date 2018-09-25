import java.util.ArrayList;

public class AddressBook {

	private ArrayList<BuddyInfo> buddyInfo;

	public AddressBook() {

		buddyInfo = new ArrayList<BuddyInfo>();

	}

	public void addBuddy(BuddyInfo info) {
		if (info != null) {
			buddyInfo.add(info);
		}
	}

	public BuddyInfo removeBuddy(int index) {
		if (index >= 0 && index < this.buddyInfo.size()) {
			return this.buddyInfo.remove(index);
		}
		return null;
	}

	public static void main(String[] args) {

		System.out.println("Address Book");
		BuddyInfo buddy = new BuddyInfo("Chris", "Sesame Street", 23456789);
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
	}
}
