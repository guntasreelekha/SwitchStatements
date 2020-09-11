package Switches1;

public class PrintSubjects {
    public static void main(String args[]) {
        //  CSE,ECE,Mech
        String branch = "cse";
        int year = 2;

        switch (year) {
            case 1:
                System.out.println("English, Maths, Drawing");
                break;
            case 2:
                switch (branch) {
                    case "cse":
                        System.out.println("Data structures, Java, Computer Organization");
                        break;
                    case "ece":
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case "mech":
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch (branch) {
                    case "cse":
                        System.out.println("Operating System, RDBMS");
                        break;
                    case "ece":
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case "mech":
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            default:
                System.out.println("The year is not in 1,2,3");
                break;
        }
    }
}
