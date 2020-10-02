public class BuddyInfo {

    private static String name;
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

    public static void main(String[] args) {
        name = "Homer";
        System.out.println("Hello "+name+"!");
    }
}
