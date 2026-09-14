public class DivisorInspector {
    public static void main(String[] args){
        int n = 28;
        int divisorCount = 0;

        System.out.print(" Divisor of " + n + ": ");
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.print(i +" ");
                divisorCount++;
            }
        }
        System.out.println();
        System.out.println("Total Divisors: " + divisorCount);
        System.out.println("Is Prime? " + (divisorCount == 2 ? "YES" : "NO"));
    }
}
