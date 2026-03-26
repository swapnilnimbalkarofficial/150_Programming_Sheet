// class PrimeBetween{
//     public static void main(String args[]){
//         for(int num=2; num<=30; num++){
//             int count=0;

//             for(int i=1; i<=num; i++){
//                 if(num % i== 0){
//                     count++;
//                 }
//             }
//             if(count == 2){
//             System.out.println(num);
//         }

//         }


//     }
// }

class PrimeRange{
    public static void main(String args[]){
        for (int num = 2; num <= 30; num++) {

        boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.print(num + " ");
        }
    }
}
