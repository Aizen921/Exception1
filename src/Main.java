// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(analizzaNum(5,15,4));

    }

    public static boolean analizzaNum(int numMinimo, int numMassimo, int numDaAnalizzare) {
        if (numDaAnalizzare >= numMinimo && numDaAnalizzare <= numMassimo) {
            return true;
        } else {
            throw new ArithmeticException("Error");
        }
    }
}