package Model;

public class Movie extends Category {
    String name;
    String director;


    public Movie(int seat, int sofa, String genre, String name, String director, String showTime, int price) {
        super(seat, sofa, genre);
        this.name = name;
        this.director = director;
        this.movieTime = showTime;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getShowTime() {
        return movieTime;
    }

    public void setShowTime(String showTime) {
        this.movieTime = showTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    String movieTime;
    int price;

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Name:" + this.getName());
        System.out.println("Director: " + this.getDirector());
        System.out.println("movieTime: "+ this.getShowTime());
        System.out.println("Price: " + this.getPrice());
        System.out.println("         ");
    }


    public void getMovies(String movieTime) {
        if (this.movieTime.equals(movieTime)) {
            System.out.println("Movie:" + this.getName());
        }
        else{
            System.out.println("No movie for now");
        }
    }
}


