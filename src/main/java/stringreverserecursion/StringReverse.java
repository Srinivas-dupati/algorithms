package stringreverserecursion;

public class StringReverse {
int i=0;
    public String reverse(String name){

        if(name ==null || name.length() <= 1)
            return name;

        return reverse(name.substring(1)) + name.charAt(0);
    }

    public static void main(String[] args) {
        StringReverse stringReverse=new StringReverse();
       String res= stringReverse.reverse("ABCD");
        System.out.println(res);
    }
}
