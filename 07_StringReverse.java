// class StringReverse{
//     public static void main(String args[]){
//         String str= "Swapnil";
//         String rev="";

//         for(int i=str.length()-1; i>=0; i--){
//             rev=rev+str.charAt(i);
//         }
//         System.out.println("Reverse :"+rev);

//     }
// }

class StringReverse{
    public static void main(String args[]){
        String str= "Swapnil";

        StringBuilder sb= new StringBuilder(str);
        System.out.println("Reverse :"+sb.reverse());

    }
}