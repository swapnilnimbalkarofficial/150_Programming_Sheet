// class Palindrome{
//     public static void main(String args[]){
//         String str="madam";
//         String rev="";

//         for(int i=str.length()-1; i>=0; i--){
//             rev=rev+str.charAt(i);
//         }

//         if(str.equals(rev)){
//             System.out.println("Is Palindrome");
//         }
//         else{
//             System.out.println("Not a Palindrome");
//         }
//     }
// }


class Palindrome{
    public static void main(String args[]){
        String str= "swapnil";
        String rev= new StringBuilder(str).reverse().toString();
        
        if(str.equals(rev)){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }   
}