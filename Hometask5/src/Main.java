import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UniversityGroup UniversityGroup1 = new UniversityGroup("KH-44-01", 2020);
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

        ArrayList<String> List = new ArrayList<String>();
        List.add("Gavkin");
        List.add("Sirko");
        List.add("Pesyk");
        List.add("Druzhkovskyi");
        List.add("Mumuev");
        UniversityGroup UniversityGroup2 = new UniversityGroup("KV-45-02", 2021, List);
        UniversityGroup2.getStudentList();
        UniversityGroup2.getDescription();
        System.out.println("Remove student:");
        Scanner scanner2 = new Scanner(System.in);
        String toberemoved2 = scanner.next();
        UniversityGroup2.removeStudent(toberemoved2);
        UniversityGroup2.getDescription();
    }
}