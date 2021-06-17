package syntax.space;

public class NameMonth {
    public static void main(String[] args) {
        int numberOfMonth = 2;
//        if (numberOfMonth == 1) {
//            System.out.println("January");
//        } else if (numberOfMonth == 2) {
//            System.out.println("February");
//        } else if (numberOfMonth == 3) {
//            System.out.println("March");
//        } else if (numberOfMonth == 4) {
//            System.out.println("April");
//        } else if (numberOfMonth == 5) {
//            System.out.printf("May");
//        } else if (numberOfMonth == 6) {
//            System.out.printf("June");
//        } else if (numberOfMonth == 7) {
//            System.out.printf("July");
//        } else if (numberOfMonth == 8) {
//            System.out.printf("August");
//        } else if (numberOfMonth == 9) {
//            System.out.printf("September");
//        } else if (numberOfMonth == 10) {
//            System.out.printf("October");
//        } else if (numberOfMonth == 11) {
//            System.out.printf("November");
//        } else if (numberOfMonth == 12) {
//            System.out.printf("December");
//        } else {
//            System.out.println("Such month doesn't exist.");
//        }

        switch (numberOfMonth) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Such month doesn't exist.");
                break;
        }
    }
}
