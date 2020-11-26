import java.io.*;
import java.util.*;
public class AddressBook {

    private List<BuddyInfo> buddies;

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

    public void save(String filename) throws IOException {
        File file = new File(filename);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for(BuddyInfo b: buddies){
            writer.write(b.toString());
            writer.newLine();
        }
        writer.close();
    }

    public static AddressBook importAddressBook(String filename) throws IOException {
        AddressBook book = new AddressBook();
        File file = new File(filename);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        while(line != null){
            BuddyInfo b = BuddyInfo.importBuddy(line);
            book.addBuddy(b);
            line = reader.readLine();
        }
        return book;
    }

    public static void main(String[] args) throws IOException {
        BuddyInfo buddy = new BuddyInfo("Jack", "Carleton", 613);
        BuddyInfo buddy2 = new BuddyInfo("Ron", "Ottawa", 647);
        BuddyInfo buddy3 = new BuddyInfo("Kashish", "Brampton", 416);
        BuddyInfo buddy4 = new BuddyInfo("Mary", "Toronto", 647);
        BuddyInfo buddy5 = new BuddyInfo("Kate", "Markham", 512);

        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.addBuddy(buddy2);
        addressBook.addBuddy(buddy3);
        addressBook.addBuddy(buddy4);
        addressBook.addBuddy(buddy5);

        addressBook.save("addressbook.txt");

        AddressBook book = importAddressBook("addressbook.txt");
        book.printAddressBook();

    }

}
