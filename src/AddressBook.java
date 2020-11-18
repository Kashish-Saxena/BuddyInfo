import java.util.*;
public class AddressBook {

    private static List<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    // Adds a buddy object into the list
    private void addBuddy(BuddyInfo b){
        if (b != null)
            buddies.add(b);
    }
    // Removes a buddy object from the list
    private BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < buddies.size())
            buddies.remove(index);
        return null;
    }

    public void printAddressBook(){
        for(BuddyInfo b: buddies){
            System.out.println(b.toString());
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Jack", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

}
