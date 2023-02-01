package Model;

public class Category extends Main_Category {
    public Category(int seat, int sofa, String genre) {
        super(seat, sofa);
        Genre = genre;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    String Genre;

    @Override
    public void getInfo(){
        super.getInformation();
        System.out.println("Genre:" + this.getGenre());
    }

}
