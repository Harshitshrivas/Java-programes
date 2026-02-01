public class Armstrong {

    static boolean isArmstrong(int num){
        int original = num;
        int count = 0;
        int sum =0;
        int temp = num;

        //count
        while(temp > 0){
            temp/=10;
            count++;
        }

        // sum of digit
        temp = num;
        while(temp > 0){
            int remainder = temp % 10;
            sum += Math.pow(remainder, count);
            temp/=10;
        }
        
        return  sum == original; 

    }
    public static void main(String[] args) {
        int num = 371;

        if(isArmstrong(num)){
            System.out.println(num + " Number is ArmStrong");
        }else{
            System.out.println("Number is Not");
        }
    }
}
