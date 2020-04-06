package fibonic;

public class Main {
    public static void main(String[] args) {
        Fibonic fibonic=new Fibonic();
       int[] fSeries= fibonic.fibonicSeries(9);
        for (int number:fSeries) {
            System.out.println("number "+number);
        }

    }
}
