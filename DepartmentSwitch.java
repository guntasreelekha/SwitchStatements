package Switches1;

public class DepartmentSwitch {
    public static void main(String args[]) {
        //String branch[] = {"cse", "ece", "eee"};
        int totalYears = 4;
        int year;
        String branch = "cse";
        switch (branch) {
            case "cse":
                System.out.println("Student is studying in " + branch + " Department");
                year = 3;
                for (totalYears = 1; totalYears <= 4; totalYears++) {
                    if (totalYears == year) {
                        System.out.println("student studying  year is " + year);
                        break;
                    }
                }
                break;
            case "ece":
                System.out.println("Student is studying in " + branch + " Department");
                year = 2;
                for (totalYears = 1; totalYears <= 4; totalYears++) {
                    if (totalYears == year) {
                        System.out.println("student studying  year is " + year);
                        break;
                    }
                }
                break;
            case "eee":
                System.out.println("Student is studying in " + branch + " Department");
                year = 1;
                for (totalYears = 1; totalYears <= 4; totalYears++) {
                    if (totalYears == year) {
                        System.out.println("student studying  year is " + year);
                        break;
                    }
                }
                break;
            default:
                System.out.println("The department name is not provided " + branch);
                break;
        }
    }
}
