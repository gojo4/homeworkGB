package OOP_homework5;

/**
 * Разработать свое MVP приложение со следующей моделью данных:
 * 1. Группа студентов (идентификатор, номер)
 * 2. Студент (идентификатор, имя, группа)
 * Реализовать стандартные операции:
 * - создание группы
 * - просмотр всех групп
 * - создание студента в группе
 * - просмотр всех студентов одной группы
 * <p>
 * 3*. Реализовать новую сущность Урок (идентификатор, группа, дата).
 * - создание урока для групп
 * - просмотр всех уроков у студента
 * <p>
 * lesson <-> studentGroup <- student
 */
public class Homework5 {
    public static void main(String[] args) {
        GroupStudentModel groupStudentModel = new GroupStudentModel();
        StudentModel studentModel = new StudentModel();
        groupStudentModel.create("TestCustomer");
        studentModel.create((GroupStudent) groupStudentModel.getAll().get(0));
        View view = new View();
        GroupStudentPresenter groupStudentPresenter = new GroupStudentPresenter(view, groupStudentModel);
        StudentPresenter studentPresenter = new StudentPresenter(groupStudentModel, studentModel);
        view.setStudentPresenter(studentPresenter);
        view.setGroupStudentPresenter(groupStudentPresenter);
        view.start();
    }
}
