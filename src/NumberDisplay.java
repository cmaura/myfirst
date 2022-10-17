public class NumberDisplay {

    // το limit αναφέρεται στο όριο της κάθε ώρας
    private int limit;
    private int value;

    public NumberDisplay(int rollOverLimit) {

        limit = rollOverLimit;
        value = 0;

    }

    public void increment() {
        // κάνουμε την πράξη %limit για να μην ξεφεύγει από το όριο το value
        value = (value + 1) % limit;

    }

    public void setValue(int aValue) {
        if ((aValue >= 0) && (aValue < limit)) {
            value = aValue;
        } else {
            System.out.println("Τιμή εκτός ορίων");
        }
    }

    public int getValue() {

        return value;

    }

    // επιστρέφει το value σε αλφαριθμητικό
    public String getDisplayValue() {

        if (value < 10) {

            return "0" + value;

        } else {

            return "" + value;

        }

    }


}
