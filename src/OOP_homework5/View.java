package OOP_homework5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class View {
    private GroupStudentPresenter groupStudentPresenter;
    private StudentPresenter studentPresenter;
    private final Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public void setGroupStudentPresenter(GroupStudentPresenter groupStudentPresenter) {
        this.groupStudentPresenter = groupStudentPresenter;
    }

    public void setStudentPresenter(StudentPresenter studentPresenter) {
        this.studentPresenter = studentPresenter;
    }

    public void start() {
        while(true) {
            System.out.println("Список доступных команд:\n1. customer create {name}\n2. customer list\n3. order create {customerId}\n4. order list\n5. order {customerId}\n6. exit\n");
            String command = this.scanner.nextLine();
            if ("exit".equals(command)) {
                return;
            }

            String[] commandArray = command.split(" ");
            String commandName = commandArray[0];
            String[] args = (String[])Arrays.copyOfRange(commandArray, 1, commandArray.length);
            if ("groupStudent".equals(commandName)) {
                this.handleCustomerCommand(args);
            } else if ("student".equals(commandName)) {
                this.handleOrderCommand(args);
            }
        }
    }

    public void printAllGroupStudents(List<GroupStudent> groupStudents) {
        System.out.println(groupStudents);
    }

    private void handleCustomerCommand(String[] args) {
        if (args.length == 2) {
            String groupStudentNumber = args[1];
            this.groupStudentPresenter.create(groupStudentNumber);
        } else if (args.length == 1 && "list".equals(args[0])) {
            this.groupStudentPresenter.getAll();
        } else {
            System.err.println("Неизвестная команда");
        }

    }

    private void handleOrderCommand(String[] args) {
        String groupStudentId;
        if (args.length == 1) {
            if ("list".equals(args[0])) {
                System.out.println(this.studentPresenter.getAll());
            } else {
                groupStudentId = args[0];
                System.out.println(this.studentPresenter.getByGroupStudent(groupStudentId));
            }
        } else if (args.length == 2 && "create".equals(args[0])) {
            groupStudentId = args[1];
            this.studentPresenter.create(groupStudentId);
        } else {
            System.err.println("Неизвестная команда");
        }

    }
}
