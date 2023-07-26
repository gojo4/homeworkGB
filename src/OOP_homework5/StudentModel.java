package OOP_homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class StudentModel {
    private List<Student> storage = new ArrayList();

    public StudentModel() {
    }

    public void create(GroupStudent groupStudent) {
        this.storage.add(new Student(groupStudent));
    }

    public List<Student> getAll() {
        return List.copyOf(this.storage);
    }

    public List<Student> getByCustomer(GroupStudent groupStudent) {
        return this.storage.stream().filter((it) -> {
            return Objects.equals(it.getCustomer(), groupStudent);
        }).toList();
    }
}
