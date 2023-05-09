package dont.wakeme;/*
 * Test-class to verify correct behavior of validation setter class
 */

class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1); //  should stick -> clock should have this value
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(20);
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(0);
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(21);
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

    }
}