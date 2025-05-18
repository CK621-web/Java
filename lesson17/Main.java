package lesson17;

import java.util.Scanner;
import java.util.ArrayList

class Course {
    private String name;
    private int credits;
    private double grade;

    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public int getCredits() {
        return credits;
    }

    public String getName() {
        return name;
    }

    public String getLetterGrade() {
        if (grade >= 4.0) {

            return "A";
        } else if (grade >= 3.7) {
            return "A-";
        } else if (grade >= 3.3) {
            return "B+";
        } else if (grade >= 3.0) {
            return "B";
        } else if (grade >= 2.7) {
            return "B-";
        } else {
            return "C";
        }
    }

}

class Student {
    private String name;
    private int id;
    private ArrayList<Course> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        courses = new ArrayList<Course>();

    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public ArrayList getCourses() {
        return courses;
    }

    public double getGPA() {
        double total = 0.0;
        int count = 0;
        for (Course course : courses) {
            total += course.getGrade();
            count++;
        }
        return total / count;
    }

    public String getTranscript() {
        StringBuilder transcript = new StringBuilder();
        transcript.append("Name: ").append(name).append("\n");
        transcript.append("ID: ").append(id).append("\n");

        for (Course course : courses) {
            transcript.append("Course:")
                    .append(course.getName())
                    .append("(").append(course.getCredits()).append(" credits)\n")
                    .append("Grade: ")
                    .append(course.getGrade())
                    .append("(").append(course.getLetterGrade()).append(" credits)\n");

        }
        return transcript.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Course cs = new Course("computer science", 4);
        cs.setGrade(3.7);

        Student alice = new Student("Alice", 1234);
        alice.addCourse(cs);
        System.out.println(alice.getGPA());
        System.out.println(alice.getTranscript());

    }
}
