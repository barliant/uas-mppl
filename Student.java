public class Student extends Person {
  public static void main (String[] args) {
    Student saya = new Student();

    saya.setName("anung");
    saya.setYearOfBirth(1973);

    System.out.println(saya.toString());
  }
}

