package net.flix;

class MovieClient {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Titanic"); // instantiate a new instance of Movie (movie1)
        movie1.setReleaseYear(1997);
        movie1.setRevenue(10_000_000_000.0); // toString() automatically called.
        movie1.setRating(Rating.PG13);
        movie1.setGenre(Genre.SCI_FI);
        System.out.println(movie1);


        System.out.println(movie1);

        Movie movie2 = new Movie("Mario", 2023, 5_000_000_000.00, Rating.PG13, Genre.SCI_FI);
        System.out.println(movie2);

        Movie movie3 = new Movie("white rose", Genre.ROMANCE);
        System.out.println(movie3);
    }
}