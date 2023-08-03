public class Sum3And5Challenge {

    public static void main(String[] args) {

        int number = 0;
        int sumOfNumbers = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Number " + i + " is divisible by 3 and 5");
                number++;
                System.out.println("Total numbers found " + number);
                sumOfNumbers += i;
                System.out.println("Sum of all the numbers found is: " + sumOfNumbers);
            }

            if (number == 5) {
                break;
            }
        }
    }
}
