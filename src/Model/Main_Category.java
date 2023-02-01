package Model;

public abstract class Main_Category {

    public int getSeat() {
        return Seat;
    }

    public void setSeat(int seat) {
        Seat = seat;
    }

    public int getSofa() {
        return Sofa;
    }

    public void setSofa(int sofa) {
        Sofa = sofa;
    }

    public Main_Category(int seat, int sofa) {
        Seat = seat;
        Sofa = sofa;
    }

    int Seat;
    int Sofa;

    public void getInformation() {
        System.out.println("Movie Information");
        System.out.println("Seat:" + this.getSeat());
        System.out.println("Sofa:" + this.getSofa());
    }

    public abstract void getInfo();
}
