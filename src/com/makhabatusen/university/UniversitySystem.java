package com.makhabatusen.university;

import java.util.ArrayList;
import java.util.Scanner;

public class UniversitySystem {

    private final ArrayList<Student> studentArray = new ArrayList<>();
    final Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        implementTheCommand(chooseCommand());

    }

    private String chooseCommand() {
        StringBuilder commandsOption = new StringBuilder("\nPlease choose the command: ");
        Command[] commands = Command.values();
        for (Command command : commands) {
            commandsOption.append("\n").append(command);
        }
        System.out.println(commandsOption);
        return scanner.next().trim();

    }

    private void implementTheCommand(String commandString) {
        if (commandString.equalsIgnoreCase(Command.CREATE.name())) {
            getStudentInfo();
        } else if (commandString.equalsIgnoreCase(Command.SHOW.name())) {
            System.out.println("Please type Student's name:");
            showStudentInfo(scanner.next().trim());
        } else if (commandString.equalsIgnoreCase(Command.EXIT.name()))
            exitProgram();
    }

    private void getStudentInfo() {
        Student student = new Student();

        System.out.println("Please type Student's name:");
        student.setStudentName(scanner.next());

        System.out.println("Please type Student's age:");
        student.setStudentAge(scanner.nextInt());

        System.out.println("Please type Student's grade:");
        student.setStudentGrade(scanner.nextDouble());

        student.setComment(student.getStudentGrade());

        studentArray.add(student);
    }

    private void showStudentInfo(String studentName) {
        for (Student student : studentArray) {
            if (student.getStudentName().equalsIgnoreCase(studentName))
                System.out.printf("\n%s is %d years old. %s\n", student.getStudentName(), student.getStudentAge(), student.getComment());
        }
    }

    private void exitProgram() {
        System.exit(0);
    }
}
