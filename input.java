import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(n);
        long sum = sumOfDigits(n);
        System.out.print(sum);
    }

    public static long sumOfDigits(int n) {
        long sum = 0;
        do {
            sum += n % 10;
            n /= 10;
        } while (n > 0);
        return sum;
    }
}