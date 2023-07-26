package OOP_homework5;

import java.util.List;
import java.util.UUID;

public class StudentPresenter {
    private GroupStudentModel groupStudentModel;
    private StudentModel studentModel;

    public StudentPresenter(GroupStudentModel groupStudentModel, StudentModel studentModel) {
        this.groupStudentModel = groupStudentModel;
        this.studentModel = studentModel;
    }

    public void create(String groupStudentId) {
        GroupStudent groupStudent = this.groupStudentModel.getById(UUID.fromString(groupStudentId));
        if (groupStudent != null) {
            this.studentModel.create(groupStudent);
        }

    }

    public List<Student> getAll() {
        return this.studentModel.getAll();
    }

    public List<Student> getByGroupStudent(String groupStudentId) {
        GroupStudent groupStudent = this.groupStudentModel.getById(UUID.fromString(groupStudentId));
        return groupStudent != null ? this.studentModel.getByCustomer(groupStudent) : List.of();
    }
}
