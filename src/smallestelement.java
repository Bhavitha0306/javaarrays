public class smallestelement {
    public static void main(String[] args){
        int[] arr={5,6,7,4,21,33,3};
    int min=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]<min) {
            min=arr[i];
        }
        }
    System.out.println("the smallest element in the array is:"+min);
    }
}
