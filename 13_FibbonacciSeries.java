class FibbonacciSeries{
    public static void main(String args[]){
        int n=10;
        int a=0, b=1;

        int count=0;
        while (count< n){

            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            count++;

        }     
        System.out.println(count);


    }
}