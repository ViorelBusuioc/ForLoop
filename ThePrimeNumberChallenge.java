public class ThePrimeNumberChallenge {

    public static void main(String[] args) {

        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");

        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");


        primeViewer();

        int primeCounter = 0;
        for (int i = 10; i <= 50; i++) {

            if (isPrime(i)) {

                System.out.println("Number " + i + " is a prime number");
                primeCounter++;
                if (primeCounter == 3) {
                    System.out.println("First " + primeCounter + " prime numbers from the interval have been found - exiting loop");
                    break;
                }
            }
        }



    }

    public static boolean isPrime (int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primeViewer () {

        for (int number = 10; number <= 50; number++) {

            boolean numberCheck = isPrime(number);
            if (numberCheck) {

                int primeCounter = number;
                System.out.println(number + " is a prime");
            }
        }
    }
}
