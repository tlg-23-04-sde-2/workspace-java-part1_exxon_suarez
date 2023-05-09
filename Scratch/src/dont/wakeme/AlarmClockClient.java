package dont.wakeme;/*
 * This is a client main-class i.e., a class def with the main() method.
 * It will create a few instances of AlarmClock and give them a basic test-drive
 */

class AlarmClockClient {
    // starting point or "entry point" for every standalone Java app
    public static void main(String[] args) {
        //create an instance of AlarmClock (an AlarmClock object) and set ints properties
        AlarmClock clock1 = new AlarmClock(7,5);


        // create a 2nd instance of AlarmClock and set its properties also
        AlarmClock clock2 = new AlarmClock(10);

        // create a 3rd AlarmClock object, BUT don't set its properties
        AlarmClock clock3 = new AlarmClock();
        clock3.setSnoozeInterval(AlarmClock.MAX_INTERVAL);

        // make them snooze
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);

    }
}