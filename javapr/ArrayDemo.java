public class ArrayDemo {//array-collection of value with fixed size
    public static void main(String[] args) {
        int arr[] = new int[10];
        int a[][] = new int[3][3];
        int []b = new int[20];
        int d[][] = new int[3][];
        d[0] = new int[4];
        d[1] = new int[5];
        d[2] = new int[10];
        // for(int i = 0; i<d.length;i++){
        //     for(int j = 0 ; j<d[i].length; j++){
        //         System.out.println(d[i][j]+" ");
        //     }
        // }
        for(int e[] : d){
            for(int i : e){
                System.out.println(i+" ");
            }
        }
        //traversing
        int t[] = new int[10];//if int is a keyword and new keyword is used with class so how is this correct.
        for(int i = 0;i<t.length;i++){//length property is used with class so how it is correct.
            System.out.println(t[i]);
        }
        //enhancing for loop
        for(int i : t){
            System.out.println(i);
        }
    }
}
