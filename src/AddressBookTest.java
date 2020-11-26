import java.io.IOException;

import static org.junit.Assert.*;

public class AddressBookTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testCreateAddressBookFile() throws IOException {
        BuddyInfo buddy = new BuddyInfo("Jack", "Carleton", 613);
        BuddyInfo buddy2 = new BuddyInfo("Ron", "Ottawa", 647);

        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.addBuddy(buddy2);

        addressBook.save("addressbook.txt");

        AddressBook book = AddressBook.importAddressBook("addressBook.txt");

        assertEquals(addressBook.toString(), book.toString());
    }
}