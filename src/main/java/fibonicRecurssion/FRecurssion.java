package fibonicRecurssion;

public class FRecurssion {
int number1=0;
    public int fibonicRecurssion(int number){

        if( number<=1)

            return number;

        return fibonicRecurssion(number -1) + fibonicRecurssion(number - 2);
    }

}
