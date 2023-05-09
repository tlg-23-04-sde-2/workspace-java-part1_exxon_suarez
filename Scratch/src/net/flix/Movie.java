package net.flix;

class Movie {
    // fields or instance variables
    private String title;
    private Integer releaseYear;        // using the "Integer" "class" as a type so that the default is nothing provided is "null" not 0
    private Double revenue;             // using the "Double" class as a type instead of "double" for the "null" default value instead of 0
    private Rating rating;
    private Genre genre;

    // 1 argument constructor (only need title as parameters)
    public Movie(String title) {
        setTitle(title);
    }
    // 2 argument constructor (only need title and genre as parameters)
    public Movie(String title, Genre genre) {
        this(title);    // delegating title retrieval to the CTOR above
        setGenre(genre);
    }


    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
         //delegate to setters for any validation/conversion they might be doing
        this(title, genre);                 // constructor (CTOR) above handles title and genre
        setReleaseYear(releaseYear);    //delegate tp its setter for any validation/conversion
        setRevenue(revenue);
        setRating(rating);
    }
    // business methods - pause(), play(), stop(), fastForward()

    // accessor (get/set) methods - these provide "controlled access" to the objects fields

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        // the ++ operator is calling the toString to concatinate strings with objects and methods ( so we need to make sure to edit our toStrings in the methods we call )
//        return "Movie: title=" + getTitle() + " releaseYear=" + getReleaseYear() + ", revenue=" + getRevenue() + " rating:" + getRating() + " genre:" + getGenre();
        //using the format option %s flags on the getRevenue output so that it prints the revenue with 0's and more readable
        return String.format(" Movie: title: %s, release year = %s, revenue= %,.2f, rating= %s, genre= %s ", getTitle(), getReleaseYear(), getRevenue(), getRating(),getGenre());
    }
}