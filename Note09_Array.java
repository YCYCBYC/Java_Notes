public class Note09_Array {
    public static void main(String[] args) {

        //  Dynamic initialization, default 0 / 0.0 / false / "" / null
        int[] arr = new int[3];

        
        //  Static initialization
        int[] arrfix1 = new int[]{1,2,3};
        int[] arrfix2 = {4,5,6};
        System.out.println(arrfix1[0]);
        System.out.println(arrfix2[0]);
        System.out.println("--------");


        //  Array index from 0
        System.out.println(arr);  //  memory location of the array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("--------");


        //  Assignment
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        System.out.println(arr);  //  not change
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("--------");


        // multiple arrary to one array in memory
        int[] arr2 = arr;
        System.out.println(arr2);  //  arr2 has same location with arr
        for(int i=0; i<arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("--------");
        
        
    }
}
