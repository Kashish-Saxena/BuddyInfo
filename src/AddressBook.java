import java.util.*;
public class AddressBook {

    private static BuddyInfo buddy;
    private static List<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    private void addBuddy(BuddyInfo b){
        if (b != null)
            buddies.add(b);
    }

    private BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < buddies.size())
            buddies.remove(index);
        return null;
    }

    public static void main(String[] args) {
        buddy = new BuddyInfo("Jack", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);

    }

}
