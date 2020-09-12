package Switches1;

public class StringSwitch {
    public static void main(String args[]) {
        String str = "two";
        switch (str) {
            case "one":
                System.out.println("the number one");
                break;
            case "two":
                System.out.println("the number two");
                break;
            case "three":
                System.out.println("the number three");
                break;
            default:
                System.out.println("no match");
                break;
        }
    }
}
