package step1.lecture4;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
    }

    static boolean isArmstrongNumber(int num) {
        int noOfDigits = 0;
        
        int copy = num;
        
        while (copy > 0) {
            noOfDigits++;
            copy = copy / 10;
        }
        copy = num;
        
        int sum = 0;
        int i = 0;
        int currentDigit = 0;
        
        while(i < noOfDigits) {
        	i++;
        	currentDigit = copy % 10;
        	copy = copy / 10;
        	sum = (int) (sum + Math.pow(currentDigit, noOfDigits));
        }
        
        return sum == num;
    }
}
