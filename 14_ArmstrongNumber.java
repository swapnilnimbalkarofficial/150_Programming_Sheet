class ArmstrongNumber{
    public static void main(String args[]){
        int num= 153;
        int temp=num;
        int sum=0;
       
        while(temp>0){
            int a=temp%10;
            sum=sum+(a*a*a);
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong number");         
        }
    }
}