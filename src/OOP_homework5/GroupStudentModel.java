package OOP_homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class GroupStudentModel {
    private List<GroupStudent> storage = new ArrayList();

    public GroupStudentModel() {
    }

    public void create(String number) {
        this.storage.add(new GroupStudent(number));
    }

    public List<GroupStudent> getAll() {
        return List.copyOf(this.storage);
    }

    public GroupStudent getById(UUID id) {
        return (GroupStudent) this.storage.stream().filter((it) -> {
            return Objects.equals(it.getId(), id);
        }).findFirst().orElse((GroupStudent) null);
    }
}
