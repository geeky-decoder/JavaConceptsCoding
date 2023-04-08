

/*
 * As enum class objects are declared within the class itself so that's why default/public constructor is not possible to declare
 */
enum Laptop {
    HP(30000), DELL(40000), ASUS, LENOVO(60000), APPLE(100000); // enum class objects

    /*
     * enum class instance variable
     */
    private int price;

    /*
     * enum class constructor
     */
    private Laptop() {      // default constructor for setting values for those objects for which no values are passed/assigned
        price = 45000;
    }

    /*
     * enum class constructor
     */
    private Laptop(int price) {     // parameterized constructor for setting values for those objects for which values are passed/assigned
        this.price = price;
    }

    /*
     * getters and setters for enum class objects
     */
    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class PracticeEnumClass {
    public static void main(String[] args) {
        Laptop laptop = Laptop.APPLE;
        System.out.println(laptop + ":" + laptop.getPrice());  
        
        Laptop newLaptop = Laptop.HP;
        newLaptop.setPrice(55000);
        System.out.println(newLaptop + ":" + newLaptop.getPrice());
    }
}
