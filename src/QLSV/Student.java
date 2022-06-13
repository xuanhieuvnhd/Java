package QLSV;

public class Student {
    private String name;
    private int age;
    private String gender;
    private int id;
    private static int index = 0;

    public Student(String name, int age, String gender, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public Student(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        Student.index = index;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                '}';
    }
}
