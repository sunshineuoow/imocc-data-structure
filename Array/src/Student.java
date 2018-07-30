public class Student {

  private int score;
  private String name;

  public Student(String studentName, int studentScore) {
    score = studentScore;
    name = studentName;
  }

  @Override
  public String toString() {
    return String.format("Student(name: %s, score: %d)", name, score);
  }

  public static void main(String[] args) {
    Array<Student> arr = new Array<>();

    arr.addLast(new Student("Alice", 90));
    arr.addLast(new Student("Bob", 60));
    arr.addLast(new Student("Cat", 20));

    System.out.println(arr);
  }
}
