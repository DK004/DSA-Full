public class Arrays{
    public static void main(String args[]){

        int [] arr = {5,1,2,66,33,7,89,8,89,80};

        // max element in Array

        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max Element in array : "+max);

        // min element
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Minimum Element in array : "+ min);


    }
}