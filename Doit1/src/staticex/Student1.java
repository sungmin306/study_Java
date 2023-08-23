package staticex;

public class Student1 {
    public static int serialNum = 1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    public Student1() {
        serialNum++;
        studentID = serialNum; // serialNum은 static 변수여서 공유 되므로 값을 증가 시킨 후에 이 값을 static이 아닌 변수에 저장
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

}
