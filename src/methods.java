public class methods {
    static void sum(int b,int c){
        int a;
        a=b+c;
        System.out.println(a);

    }
    //method overloading
    static void sum(double b,double c){
        double a;
        a=b+c;
        System.out.println(a);

    }

    void subtract(int b,int c){
        int a;
        a=b-c;
        System.out.println(a);

    }

    public static void main(String[] args) {
        sum(3,4);
        sum(3.7,9.1);
        //for non-static methods you need to create an object first
         methods obj =new  methods();
        obj.subtract(4,3);
    }
}
