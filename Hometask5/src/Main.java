import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UniversityGroup UniversityGroup1 = new UniversityGroup("KH-44-01", 2020, 2025);
        UniversityGroup1.getStudentList();
        UniversityGroup1.addStudent("Catswill");
        UniversityGroup1.addStudent("Meowkin");
        UniversityGroup1.addStudent("Bryskin");
        UniversityGroup1.addStudent("Purrwell");
        UniversityGroup1.addStudent("Fluffy");
        UniversityGroup1.getDescription();
        System.out.println("Remove student:");
        Scanner scanner = new Scanner(System.in);
        String toberemoved = scanner.next();
        UniversityGroup1.removeStudent(toberemoved);
        UniversityGroup1.getDescription();

        UniversityGroup UniversityGroup2 = new UniversityGroup("KV-45-02", 2021, 2026,"");
    }
}