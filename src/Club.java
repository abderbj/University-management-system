import java.util.List;

public class Club implements Leavable, Joinable{
    private String clubId;
    private String clubName;
    private List<Person> members;

    @Override
    public void join(Student student) {
        members.add(student);
    }

    @Override
    public void leave(Student student) {
        members.remove(student);
    }
}
