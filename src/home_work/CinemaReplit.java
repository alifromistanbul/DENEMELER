package home_work;

public class CinemaReplit {

    public static void main(String[] args) {

        String movieName = "Spider Man";
        String releaseDate = "12/17/2021";
        String genre = "Action/Adventure";
        int rottenTomatoesRating = 97 ;
        String rating = "PG-13";
        double duration = 2.5;
        boolean isSequel = true ;
        boolean isOnDvd = false;

        System.out.println("------ Welcome to the Cinema ------");
        System.out.println("Tonight we are streaming " + movieName + " which was released on " + releaseDate);
        System.out.println("This " + genre + " movie got a " + rottenTomatoesRating + " rating on Rotten Tomatoes");
        System.out.println("The rating is " + rating + " and it runs for " + duration + " hours");
        System.out.println("This is a seguel " + isSequel + " and is on dvd " + isOnDvd);



    }



}

/*

1
2
3
4
5
------ Welcome to the Cinema ------
Tonight we are streaming Spider-Man which was released on 12/17/2021.
This Action/Adventure movie got a 97 rating on Rotten Tomatoes.
The rating is PG-13 and it runs for 2.5 hours.
This is a sequel true and is on dvd false.



 */
