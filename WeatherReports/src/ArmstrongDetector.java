public class ArmstrongDetector {
    public static void main(String[] args){
        int original = 153;
        int temp = original;
        int sumOfCubes = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sumOfCubes += (digit * digit * digit);
            temp /= 10;
        }
        System.out.println("Number Evaluted : " + original);
        System.out.println("Sum of Cubes    : " + sumOfCubes);
        if (original == sumOfCubes) {
            System.out.println("Result          : ARMSTRONG NUMBER CONFIRMED!");
        } else {
            System.out.println("Result          : NOT AN ARMSTRONG NUMBER");
        }
    }
}
