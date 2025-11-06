// StudentManagementSystem/Main.java

class Student {
    // Attributes (Encapsulation)
    private String name;
    private int age;
    private String course;

    // Constructor
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("-------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Student objects
        Student s1 = new Student("Steve", 20, "Computer Science");
        Student s2 = new Student("Frank", 21, "Information Technology");

        // Displaying details
        System.out.println("Student Details:\n");
        s1.displayDetails();
        s2.displayDetails();
    }
}
