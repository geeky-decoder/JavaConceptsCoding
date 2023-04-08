
/*
 * Final method is declared with final keyword followed by datatype
 * Final method cannot be overriden, they are like once declared cannot be modified
 */
class Currency {
    private final String currencyName;
    private final double currencyValue;

    public Currency() {
        currencyName = "Paisa";
        currencyValue = (double) 1 / 100;
    }

    public Currency(String currencyName, double currencyValue) {
        this.currencyName = currencyName;
        this.currencyValue = currencyValue;
    }

    public final void showDetails() {
        System.out.println("Currency Name is " + currencyName + " and value is " + currencyValue);
    }
}

class ChildCurrency extends Currency {

    @Override
    public void showDetails() {
        System.out.println("This is the method overriding of final method");
    }
}

public class FinalMethod {
    public static void main(String[] args) {

        /*
         * error: showDetails() in ChildCurrency cannot override showDetails() in
         * Currency
         * public void showDetails() { ^
         * overridden method is final
         * 1 error
         */
        Currency currency1 = new Currency("Dollar", 80.0);
        Currency currency2 = new Currency("Rupee", (double) 1 / 80);

        ChildCurrency childCurrency = new ChildCurrency();
        childCurrency.showDetails();

        currency1.showDetails();
        currency2.showDetails();
    }
}
