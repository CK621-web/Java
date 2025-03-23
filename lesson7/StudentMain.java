package lesson7;

class Student {
  String name;
  int StudentId;
  String AvgGrade;
  String favSubject;

  public Student(String name, int StudentId, String AvgGrade, String favSubject) {
    this.name = name;
    this.StudentId = StudentId;
    this.AvgGrade = AvgGrade;
    this.favSubject = favSubject;
  }

  public void display() {
    System.out.println(name + " | " + StudentId + " | " + AvgGrade + " | " + favSubject);
  }

  public class StudentMain {
    public static void main(String[] args) {
      Student messi = new Student("Messi", 10, "A", "PE");
      Student ronaldo = new Student("CR7", 7, "B", "PE");

      messi.display();
      ronaldo.display();

    }

  }

}
