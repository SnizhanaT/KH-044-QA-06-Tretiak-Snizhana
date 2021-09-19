import java.util.ArrayList;

public class UniversityGroup {
    private String groupName;
    private int startYear;
    private int endYear;
    private ArrayList<String> studentList = new ArrayList<>();
    String student;

    public String getGroupName() {
        return groupName;
    }
    public int getStartYear() {
        return startYear;
    }
    public int getEndYear() {
        return endYear;
    }
    public ArrayList<String> getStudentList() {
        return studentList;
    }
    public void setStudentList(ArrayList<String> studentList) {
        this.studentList = studentList;
    }

    public UniversityGroup(String groupName, int startYear, int endYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = endYear;
    }
    public UniversityGroup(String groupName, int startYear, int endYear, ArrayList<String> studentList) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = endYear;
        this.studentList = studentList;
    }

    public void addStudent(String student){
        studentList.add(student);
    }
    public void removeStudent(String student){
        System.out.println("The student is removed: " + studentList.remove(student));
    }

    public void getDescription(){
        System.out.println("Group Info");
        System.out.println("Group name is: " + getGroupName());
        System.out.println("Group start year is: " + getStartYear());
        System.out.println("Group end year is: " + getEndYear());
        System.out.println("Group student list is: " + getStudentList());
    }

}
