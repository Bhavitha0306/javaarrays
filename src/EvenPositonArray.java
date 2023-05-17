public class EvenPositonArray {
    public static void main(String[] args){
        //Inotialize array
        int[] arr = new int [] {1,2,3,4,5,6};
        System.out.println("Elements of given array present on even position:");
        //Loop through the array by increasing value of i by 2
        for(int i = 1;i<arr.length; i=i+2){
            System.out.println(arr[i]);
        }
    }
}
