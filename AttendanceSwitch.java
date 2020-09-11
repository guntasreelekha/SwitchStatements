package Switches1;

public class AttendanceSwitch {
    public static void main(String args[]) {
        /*
         * Using switch case,calculate the percentage of attendance*/
        char cse = 'a';
        float totalStudents = 60;
        float presentStudentsA = 58, presentStudentsB = 45;
        float percentage;
        switch (cse) {
            case 'a':
                System.out.println("Total students in CSE A:" + totalStudents);
                percentage = (float) (presentStudentsA / totalStudents) * 100;
                System.out.println("Weekly attendance Percentage of students in CSE-A section :" + percentage);
                break;
            case 'b':
                System.out.println("Total students in CSE B:" + totalStudents);
                percentage = (float) (presentStudentsB / totalStudents) * 100;
                System.out.println("Weekly attendance Percentage of students in CSE-B section :" + percentage);
                break;
            default:
                System.out.println(cse + " section is not provided");
                break;
        }
    }
}
