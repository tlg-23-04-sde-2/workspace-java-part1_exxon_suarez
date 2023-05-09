package net.flix;

enum Genre {
    // these are the 8 named Genre objects
    // each of these calls the ctor below, passing a display string
    ROMANCE("Romance"),
    SCI_FI("Sci-fi"),
    COMEDY("Comedy"),
    HORROR("HORROR"),
    DOCUMENTARY("Documentary"),
    ACTION("Action"),
    THRILLER("Thriller"),
    DRAMA("Drama");      // if we are going to add more functionality to this we need to add semicolon to last enum

    // everything below here is a regular class definition stuff, i.e., fields,ctors, methods
    private final String display;

    // constructor - cannot be public (implicitly private), only called from inside(8times above)
    Genre(String display){
        this.display = display;     // because we have no setter we manually set the this.display to display
    }

    // Accessor methods - here, we provide "read-only" access to the display property (only have getter NO setter)
    public String display() {                   // can leave as getDisplay() when first generated
        return display;
    }

    // toString we need to override so that when we retirieve any genre this format will apply and not the default ALL CAPS format for enums
    public String toString() {
        return display;
    }
}