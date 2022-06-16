package QLSV;

import java.util.Scanner;

public class StudentManager {
    Student[] studentArray = new Student[]{};

    public void addStudent() {
        Student student = creatStudent();
        boolean flag = true;
        for (int i = 0; i < this.studentArray.length; i++) {
            if (this.studentArray[i].getId() == student.getId()) {
                flag = false;
            }
        }
        if (flag == true) {
            Student[] newStudent = new Student[studentArray.length + 1];
            System.arraycopy(this.studentArray, 0, newStudent, 0, studentArray.length);
            newStudent[newStudent.length - 1] = student;
            this.studentArray = newStudent;
            System.out.println("Them SinhVien thanh cong !");
        } else {
            System.out.println("Ma so SinhVien da ton tai !");
            System.out.println("Vui long nhap lai: ");
        }
    }

    public Student creatStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten SinhVien: ");
        String name = scanner.next();
        System.out.print("Nhap tuoi SinhVien: ");
        int age = scanner.nextInt();
        System.out.print("Nhap gioi tinh SinhVien: ");
        String gender = scanner.next();
        System.out.print("Nhap ma so SinhVien: ");
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

    public void editStudentById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ID can thay doi: ");
        int editId = scanner.nextInt();
        boolean checkEdit = updateEdit(editId, scanner);
        if (checkEdit) {
            System.out.println("Thay doi thanh cong !");
        } else {
            System.out.println(" Khong ton tai !");
        }
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

    public void displayStudentAll() {
        for (Student student : studentArray) {
            System.out.println(student);
        }
    }

    public boolean displayOne(int id) {
        if (this.checkId(id) != -1) {
            System.out.println(studentArray[this.checkId(id)]);
            return true;
        }
        return false;
    }

    public void deleteStudentById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ID can xoa: ");
        int deleteId = scanner.nextInt();
        scanner.nextLine();
        boolean checkDelete = deleteStudent(deleteId);
        if (checkDelete) {
            System.out.println("Xoa thanh cong !");
        } else {
            System.out.println(" Khong ton tai !");
        }
    }

    public void displayStudentById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ID SinhVien muon hien thi: ");
        int displayID = scanner.nextInt();
        if (!displayOne(displayID)) {
            System.out.println(" Khong ton tai !");
        }
    }

    public void searchStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ID SinhVien muon tim: ");
        int search = scanner.nextInt();
        for (int i = 0; i < this.studentArray.length; i++) {
            if (!displayOne(search)) {
                System.out.println(" Khong ton tai !");
            }
        }
    }
}
