
/*
 * final variable cannot be instantiated again bcoz it works as a constant.
 */
class Currency {
    private String currencyName;
    private final double currencyValue;

    public Currency() {
        this.currencyName = "";
        this.currencyValue = 0;
    }

    public Currency(String currencyName, int currencyValue) {
        this.currencyName = currencyName;
        this.currencyValue = currencyValue;
    }

    public void showDetails() {
        System.out.println("Currency Name is " + currencyName + " and value is " + currencyValue);
    }
}

public class FinalVariable {
    public static void main(String[] args) {

        /*  
         * currencyValue is assigned once for these object now we cannot alter or assign some other value
         * Every object has different instance of final variable
         */
        Currency currency1 = new Currency("Rupee", 1 / 80); 
        Currency currency2 = new Currency("Dollar", 80);

        currency1.showDetails();
        currency2.showDetails();

    }
}
