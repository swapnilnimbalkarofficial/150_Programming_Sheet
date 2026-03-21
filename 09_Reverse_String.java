// class StringReverse{
//     public static void main(String args[]){
//         String rev="linpawS";
//         String str="";

//         for(int i=rev.length()-1; i>=0; i--){
//             str=str+rev.charAt(i);
//         }
//         System.out.println("Reverse: "+str);
//     }
// }


class StringReverse{
    public static void main(String args[]){
        String rev="linpawS";

        String result = new StringBuilder(rev).reverse().toString();

        System.out.println("Reverse: " + result);
    }
}