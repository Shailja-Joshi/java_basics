public class arrays {
    public static void main(String[] args) {
        //3 ways to create an array
        int [] arr=new int[10];     //declaration+memory allocation
        arr[0] = 2;
        arr[4]=9;
        System.out.println(arr[4]);


        int [] gem;     //declaration
        gem=new int[3];      //and then memory allocation
        gem[0]=9;

        int [] marks={20,90,79};        //declaration+memory allocation+initialization
        System.out.println(marks[1]);
        marks[1]=45;        //values can be changed
        System.out.println(marks[1]);
        System.out.println("\n");

        //array can be of any data type
        String [] str=new String[3];
        str[0]="Hi there";
        str[1]="Hello there";
        str[2]="Hey there";
        System.out.println(str[1]);
        System.out.println("\n");

        //traversing using for loop
        for(int i=str.length-1;i>=0;i--)
        {
            System.out.println(str[i]);
        }
        System.out.println("\n");

        //Printing using for-each loop
       for(String itr:str){
           System.out.println(itr);
       }
    }
}
