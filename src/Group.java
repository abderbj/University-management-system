import java.util.List;

class Group implements Joinable, Leavable {
    private String groupId;
    private List<Student> members;
    public void  addMember(Student student) {
        members.add(student);
    }

    @Override
    public void join(Student student) {
        members.add(student);
    }

    @Override
    public void leave(Student student) {
        members.remove(student);
    }
}