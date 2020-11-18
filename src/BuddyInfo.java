import java.util.Scanner;

public class BuddyInfo {

    private static String name;
    private static String address;
    private static int number;

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
        return this.getName()+"#"+this.getAddress()+"#"+this.getNumber();
    }

    public static BuddyInfo importBuddy(String buddy){
        Scanner s = new Scanner(buddy).useDelimiter("#");
        name = s.next();
        address = s.next();
        number = s.nextInt();
        s.close();
        return new BuddyInfo(name, address, number);
    }

    public static void printBuddy (BuddyInfo b){
        System.out.println(name +"\n"+ address+ "\n" + number);
    }
    public static void main(String[] args) {
        printBuddy(importBuddy("Ron#Carleton#613"));
    }
}
