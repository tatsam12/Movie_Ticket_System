import Model.Movie;
import Model.Seat;
import Model.Ticket;
import Model.User;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {


        ArrayList<Movie> moviesList = new ArrayList<Movie>();
        Movie M1 = new Movie(10, 5, "Romance", "Unknown1", "Tatsam", "12", 1599);
        moviesList.add(M1);
        Movie M2 = new Movie(12,7, "Drama", "Unknwon2", "Ram", "9:59", 8000);
        moviesList.add(M2);
        Movie M3 = new Movie(15,9, "Comedy", "Unknown3", "Ram's brother", "3:01", 2000);
        moviesList.add(M3);
        Movie M4 = new Movie(10,8, "Action", "Unknonwn4", "Ram's sister", "1:19", 5000);
        moviesList.add(M4);
        Movie M5 = new Movie(20,10,"AAdventure", "Unknwon 5", "Ram's Girlfriend", "12:29", 9989);
        moviesList.add(M5);

        ArrayList<User> users = new ArrayList<User>();
        User U1 = new User("Ram's Nepali Teacher", 30,3728394);
        users.add(U1);
        User U2 = new User("Ram's Math Teacher ", 32, 473843748);
        users.add(U2);

        ArrayList<Seat> seats = new ArrayList<>();
        Seat S1 = new Seat("A+", 10);
        seats.add(S1);
        Seat S2 = new Seat("D+", 9);
        seats.add(S2);

        Ticket T1 = new Ticket(seats,users,moviesList);

        M1.getInfo();

        T1.getUser();

        M4.getDirector();

    }
}