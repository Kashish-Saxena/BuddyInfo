import java.util.Scanner;

public class BuddyInfo {

    private String name;
    private String address;
    private int number;

    public BuddyInfo(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public int getNumber()
    {
        return number;
    }

    public String toString(){
        return name+"#"+address+"#"+number;
    }

    public static BuddyInfo importBuddy(String buddy){
        Scanner s = new Scanner(buddy).useDelimiter("#");
        String name = s.next();
        String address = s.next();
        int number = s.nextInt();
        s.close();
        return new BuddyInfo(name, address, number);
    }

    // Just for testing
    public static void printBuddy (BuddyInfo b){
        System.out.println(b.name +"#"+ b.address+ "#" + b.number);
    }

    public static void main(String[] args) {
        printBuddy(importBuddy("Ron#Carleton#613"));
    }
}
