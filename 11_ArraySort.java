// import java.util.Arrays;
// class ArraySort{
//     public static void main(String args[]){
//         int arr[]={3,1,9,2,6,4};

//         Arrays.sort(arr);

//         System.out.println(Arrays.toString(arr));
//     }
// }

class ArraySort {
    public static void main(String args[]){
        int arr[]={3,1,9,2,6,4};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int num: arr){
            System.out.println(num+" ");
        }
    }
}