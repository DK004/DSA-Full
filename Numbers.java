public class Numbers {
    public static void main(String args[]){

    {
        int num1 = 12345;
        // count the digits
        int count = 0;
        while(num1>0){
            num1 /= 10;
            count++;
        }
        System.out.println("Count of digits is : "+ count);


        // reverse the number
        int num2 = 12345;
        int rev = 0;
        while(num2>0){
            rev = (rev*10) + (num2%10);
            num2 /= 10;
        }
        System.out.println("Reverse number is : "+rev);


        // Palindrome
        int original = 12321;
        int num3 = original;
        int rev2 = 0;
        while(num3>0){
            rev2 =(rev2*10) + (num3%10);
            num3 /= 10;
        }
        if(rev2 == original){
            System.out.println(original + " Number is Palindrome.");
        }else{
            System.out.println(original + " Number is not Palindrome.");
        }

    }

        // GCD of 2 numbers (Greatest Common divisor)
        // 12, 18 -> GCD is 6 (6*2,6*3)
        // Euclidean Algorithm -> GCD(a,b) -> (b, a%b) -> till b is not 0

        // LCM (Lowest common Multiplier) -> 12,18 -> 12,24,"36",48 / 18,"36",54
        // LCM(a,b) = (a*b)/gcd(a,b);
        {
            int num1 = 12;
            int num2 = 18;
            while(num2 > 0){
                int rem =num1 % num2;
                num1 = num2;
                num2 = rem;
            }
           System.out.println("GCD is: "+num1);

           int x =12;
           int y = 18;
           int gcd = num1;
           int lcm = (x*y)/gcd;
           System.out.println("LCM is : "+lcm);

        }
        



    }
}
