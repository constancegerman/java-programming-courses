package advancedjava.exceptions;

public class Exceptions {
    public static void main(String[] args) {
        int a = 1;
        try {
            int b = 7 / a;
            String str = "12kjdfl";
            int i = Integer.parseInt(str);
        } catch (ArithmeticException e) {
            System.out.println("Division by 0 is prohibited.");
        } catch (Exception e) {

        } finally {
            System.out.println("We are in the block Finally");
        }
//        } catch (NumberFormatException ex) {
//            System.out.println("Conversion error.");
//        }
        System.out.println("Hi");
    }
}
