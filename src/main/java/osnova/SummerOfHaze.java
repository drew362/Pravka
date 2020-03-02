package osnova;

public class SummerOfHaze {


    public static void main(String args[]){
        SummerOfHaze Haze = new SummerOfHaze();
        System.out.println( Haze.summer(3,4));
        //System.out.println(summer(3.3,4.3));
        help();
    }

    static void help(){
        System.out.println("hi");
    }

    public  int summer(int a,int b){
        int c =  a+b;
        return c;
    }


    public  double summer(double a, double b){
        double c = a+b;
        return c;
    }

}
