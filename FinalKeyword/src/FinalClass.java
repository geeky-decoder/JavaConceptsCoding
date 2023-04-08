
/*
 * final class restricts inhertitance as no class can extend the class declared as final
 */
final class Currency {
    private String currenyName;
    private String country;

    public Currency() {
        this.country = "India";
        this.currenyName = "Rupee";
    }

    public Currency(String currencyName, String country) {
        this.currenyName = currencyName;
        this.country = country;
    }

    public void showDetails() {
        System.out.println(currenyName + " is currency of " + country);
    }
}

/*
 * The type FinalClass cannot subclass the final class Currency
 */
// public class FinalClass extends Currency {}

public class FinalClass {
    public static void main(String[] args) {
        Currency currency1 = new Currency();
        Currency currency2 = new Currency("Dollar", "United States of America");

        currency1.showDetails();
        currency2.showDetails();
    }
}
