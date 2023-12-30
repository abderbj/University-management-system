import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private int credits;
    public void joinGroup(Group group) {
        group.join(this);
    }
    public void joinCourse(Course course) {
        course.join(this);
    }
    public void joinClub(Club club) {
        club.join(this);
    }
    public void leaveGroup(Group group) {
        group.leave(this);
    }
    public void leaveCourse(Course course) {
        course.leave(this);
    }
    public void leaveClub(Club club) {
        club.leave(this);
    }
}
