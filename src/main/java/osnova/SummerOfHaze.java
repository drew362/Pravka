package osnova;

public class SummerOfHaze {
    String name;
    int strong;

    SummerOfHaze(){
        this.name = name;
        this.strong = strong;
    }
    public static void main(String []args){
        SummerOfHaze as = new SummerOfHaze("g",5);
    //    Constr aze = new Constr("petia",3);
  //      Book book1 = new Book(300,"Unnow");

//        public void setColor(String name){
//            this.color=name;
//        }
//        public String getColor(){
//            return name;
//        }

        System.out.println(summer(3,4));
        //System.out.println(summer(3.3,4.3));
        help();
    }

    public class Constr {


        public Constr(String name,int strong){
            this.name = name;
            this.strong = strong;
        }


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
