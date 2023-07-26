package OOP_homework5;

import java.util.List;
import java.util.UUID;

public class GroupStudentPresenter {
    private View view;
    private GroupStudentModel model;

    public GroupStudentPresenter(View view, GroupStudentModel model) {
        this.view = view;
        this.model = model;
    }

    public void create(String customerName) {
        this.model.create(customerName);
    }

    public void getAll() {
        List<GroupStudent> all = this.model.getAll();
        this.view.printAllGroupStudents(all);
    }
}
