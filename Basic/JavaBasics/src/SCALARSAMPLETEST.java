import java.util.Arrays;

public class SCALARSAMPLETEST {

    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;

        if(a && (b=true)){
            System.out.println("condition is true = ");
        }
        else {
            System.out.println("condition is false = ");
        }
    }
}
