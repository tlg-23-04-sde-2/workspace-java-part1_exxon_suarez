package dont.wakeme;

/*
 * Class def to model workings of an alarm clock.
 * This is called a "business class" or "system class".
 * This class def does NOT have a main() method - most classes don't.
 *
 */
class AlarmClock {
    // class-level shared variables - these live in that common/shared area above the instance
    public static final int MIN_INTERVAL= 1;
    public static final int MAX_INTERVAL = 20;


    // **** properties or attributes ****** - called "instance variables" or "fields" in Java
    private int snoozeInterval = 5; // default value when client doesn't specify one.
    private int repeat = 1;



    // ****** constructors *****

    // constructor for AlarmClock for user to pass NO arguments
    public  AlarmClock() {
        // no-op
    }

    // constructor for AlarmClock so that they can set 1 parameter not mandatory 2 parameters like constructor below
    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);
    }

    // constructor method for AlarmClock but for 2 parameters
    public AlarmClock(int snoozeInterval, int repeat) {
        this(snoozeInterval);   //delegate to the CTOR above me for snoozeInterval
        setRepeat(repeat);      // handle repeat myself, by delegating to its setter
    }

    // accessor methods
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // this is implementing the business constrain that the snoozeInterval must be between 1 and 20
    public  void setSnoozeInterval(int snoozeInterval) {
        if(snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {  // valid
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snoozeInterval " + snoozeInterval + " must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL );
        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String toString() {
        return "AlarmClock: snoozeInterval=" + snoozeInterval;
    }

    // functions or "methods" - what do alarm clocks do?
    void snooze() {
        System.out.println("Snoozing " + snoozeInterval + " minutes");
    }
}