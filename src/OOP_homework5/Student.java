package OOP_homework5;
import java.util.Objects;
import java.util.UUID;
public class Student {
    private static int counter = 1;
    private final UUID id = UUID.randomUUID();
    private String number;
    private GroupStudent groupStudent;

    public Student(GroupStudent groupStudent) {
        int var10001 = counter++;
        this.number = "#" + var10001;
        this.groupStudent = groupStudent;
    }

    public GroupStudent getCustomer() {
        return this.groupStudent;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Student student = (Student)o;
            return this.id.equals(student.id);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id});
    }

    public String toString() {
        String var10000 = String.valueOf(this.id);
        return "[" + var10000 + "] (" + this.number + ") Owner = {" + String.valueOf(this.groupStudent) + "}";
    }
}
