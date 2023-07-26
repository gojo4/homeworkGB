package OOP_homework5;

import java.util.Objects;
import java.util.UUID;

public class GroupStudent {
    private final UUID id = UUID.randomUUID();
    private String number;

    public GroupStudent(String number) {
        this.number = number;
    }

    public UUID getId() {
        return this.id;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            GroupStudent groupStudent = (GroupStudent) o;
            return this.id.equals(groupStudent.id);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id});
    }

    public String toString() {
        String var10000 = String.valueOf(this.id);
        return "[" + var10000 + "] " + this.number;
    }
}
