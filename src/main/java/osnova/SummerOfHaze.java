package osnova;

public class SummerOfHaze {

   private  String color;
   private int strong;

    public static void main(String args[]){

        public void setColor(String name){
            this.color=name;
        }
        public String getColor(){
            return name;
        }

        SummerOfHaze car = new SummerOfHaze("Petia",2);

        public SummerOfHaze(String name,int strong){
            this.color = name;
            this.strong = strong;
        }

        System.out.println(summer(3,4));
        //System.out.println(summer(3.3,4.3));
        help();

    }

//    SummerOfHaze(int c,int b){
//        this.c=c;
//
//    }
    static void help(){
        System.out.println("hi");
    }

    public static  int summer(int a,int b){
        int c =  a+b;
        return c;
    }


    public  double summer(double a, double b){
        double c = a+b;
        return c;
    }

}
