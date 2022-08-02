import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(n);
        int sum = sumOfDigits(n);
        System.out.print(sum);
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        do {
            sum += n % 10;
            n /= 10;
        } while (n > 0);
        return sum;
    }
}