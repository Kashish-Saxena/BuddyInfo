public class BuddyInfo {

    private static String name;
    private static String address;
    private static int number;

    public BuddyInfo(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        name = "Homer";
        System.out.println("Hello "+name+"!");
    }
}
