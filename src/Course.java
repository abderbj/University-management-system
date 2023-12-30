import java.util.List;
import java.util.Scanner;

class Course implements Joinable, Leavable{
    private String courseCode;
    private String courseName;
    private List<Student> students;
    private Subject subject;
    private static List<Course> courses;

    public Course(String courseCode, String courseName, List<Student> students, Subject subject) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.students = students;
        this.subject = subject;
    }

    @Override
    public void join(Student student) {
        students.add(student);
    }

    @Override
    public void leave(Student student) {
        students.remove(student);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public static List<Course> getCourses() {
        return courses;
    }

    public static void setCourses(List<Course> courses) {
        Course.courses = courses;
    }
}