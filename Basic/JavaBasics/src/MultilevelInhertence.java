
class one {
public void print_geek()
{
    System.out.println("Geeks");
}
}

class two extends one {
    public void print_for() { System.out.println("for"); }
}

class MultilevelInhertence extends two {
    public void print_geek()
    {
        System.out.println("Scaler");
    }

    public static void main(String[] args) {

        MultilevelInhertence mi=new MultilevelInhertence();
        mi.print_geek();;
        mi.print_for();
        mi.print_geek();



    }
}
