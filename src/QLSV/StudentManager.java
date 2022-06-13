package QLSV;

import java.util.Scanner;

public class StudentManager {
    Student[] studentArray = new Student[]{};

    public void addStudent(Scanner scanner) {
        Student student = creatStudent(scanner);
        Student[] newStudent = new Student[studentArray.length + 1];
        System.arraycopy(this.studentArray, 0, newStudent, 0, studentArray.length);
        newStudent[newStudent.length - 1] = student;
        this.studentArray = newStudent;
    }

    public Student creatStudent(Scanner scanner) {
        System.out.print("Nhap ten SinhVien: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Nhap tuoi SinhVien: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap gioi tinh Sinh Vien: ");
        String gender = scanner.nextLine();
        System.out.print("Nhap ID SinhVien: ");
        int id = scanner.nextInt();
        return new Student(name, age, gender, id);
    }

    public int checkId(int id) {
        for (int i = 0; i < this.studentArray.length; i++) {
            if (this.studentArray[i].getId() == id) {
                return i;
            }
        }
        System.out.print("ID: " + id);
        return -1;
    }

    public boolean updateEdit(int idEdit, Scanner scanner) {
        if (this.checkId(idEdit) != -1) {
            this.studentArray[this.checkId(idEdit)] = editStudent(this.studentArray[this.checkId(idEdit)], scanner);
            return true;
        }
        return false;
    }

    public Student editStudent(Student student, Scanner scanner) {
        System.out.print("Nhap ten SinhVien can thay doi: ");
        String name = scanner.nextLine();
        if (name.equals("")) {
            name = student.getName();
        }
        System.out.print("Nhap tuoi SinhVien can thay doi: ");
        int age;
        String ageS;
        ageS = scanner.nextLine();
        if (ageS.equals("")) {
            age = student.getAge();
        } else {
            age = Integer.parseInt(ageS);
        }
        System.out.print("Nhap gioi tinh can thay doi: ");
        String gender = scanner.nextLine();
        if (gender.equals("")) {
            gender = student.getGender();
        }
        return new Student(student.getId(), name, age, gender);
    }

    public boolean deleteStudent(int id) {
        if (this.checkId(id) != -1) {
            Student[] studentDelete = new Student[this.studentArray.length - 1];
            for (int i = 0; i < studentDelete.length; i++) {
                if (i < checkId(id)) {
                    studentDelete[i] = studentArray[i];
                } else {
                    studentDelete[i] = studentArray[i + 1];
                }
            }
            studentArray = studentDelete;
            return true;
        }
        return false;
    }

    public void display() {
        for (Student b : studentArray) {
            System.out.println(b);
        }
    }
}
