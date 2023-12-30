public class Array {
    public static void main(String[] args) {
        //Q:store a roll number
        int a=19;

        //Q. store string
        String b="Shreya";

        //Q. store 5 roll numbers
        int rno1=23;
        int rno2=45;
        int rno3=89;

        //syntax
        //datatype[] variable_name=new datatype[size];
        //store 5 roll numbers:

        int[] rnos=new int[5];
        //or else directly

        int[] rnos2={23,24,26,29,10};

         int[] ros;//declaration of array. ros is getting defined in stack memory.
        ros=new int[5]; //initialisation: actually here object is being created in the heap memory.
        System.out.println(ros[1]);

        //String array
        String[] arr=new String[5];
        System.out.println(arr[0]);

        //String being assigned a null value
        String g=null;
        System.out.println(g);
    }
}
