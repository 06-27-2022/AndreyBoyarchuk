public class sumNumbers {

    int sumnums( int []arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;

    }
    public static void main(String[] args) {
    int [] arr1={3, 4, 332, 4, 3, 222, 402, 8392, 83, 2, 1, 244, 5, 4, 33, 842, 0, 0, 0, 2, 3, 4, 0, 8871, 3, 1, 7, 9, 900, 1, 19, 23, 98, 89, 733, 437, 87, 98};
    //int[][][][] arr = {{{{3, 4, 332, 4, 3, 222, 402, 8392, 83, 2, 1, 244, 5, 4, 33, 842, 0, 0, 0, 2, 3, 4, 0, 8871, 3, 1, 7, 9, 900, 1, 19, 23, 98, 89, 733, 437, 87, 98},{},{3, 2, 3},{1}}}};
    int [] arr2={};
    int [] arr3={3, 2, 3};
    int [] arr4={1};
    sumNumbers asum= new sumNumbers();
    System.out.println("sum is:"+asum.sumnums(arr1));
    System.out.println("sum is:"+asum.sumnums(arr2));
    System.out.println("sum is:"+asum.sumnums(arr3));
    System.out.println("sum is:"+asum.sumnums(arr4));
}}
