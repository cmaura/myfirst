public class ClockDisplay
{

    // αυτή η κλάση έχει ως πεδία δύο αντικείμενα της κλάσης NumberDisplay, ένα για τις ώρες και ένα για τα λεπτά
    private NumberDisplay hours;
    private NumberDisplay minutes;

    public ClockDisplay() {

        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
    }

    public ClockDisplay(int hour, int minute) {
        // κλήση του κατασκευαστή που είναι υλοποιημένος χωρίς παραμέτρους
        // αυτή η γραμμή πρέπει να είναι η πρώτη γραμμή στον κατασκευαστή
        this();
        setTime(hour, minute);

    }

    // αυτή η μέθοδος αλλάζει τα values της ώρας και των λεπτών
    public void setTime(int hour, int minute) {

        hours.setValue(hour);
        minutes.setValue(minute);

    }

    // αυτή η μέθοδος αυξάνει τα λεπτά κατα ένα καλώντας την increment
    // αν τα λεπτα έχουν φτάσει στο μηδέν καλεί την increment και για τις ώρες
    public void timeTick() {
        minutes.increment();
        if (minutes.getValue() == 0) {

            hours.increment();

        }

    }

    // αυτή η μέθοδος επιστρέφει την ώρα χωρισμένη με :
    public String getDisplayTime() {

        return hours.getDisplayValue() + ":" +

                minutes.getDisplayValue();

    }

}
