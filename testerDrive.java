public class testerDrive
{
  public static void main(String[] args)
  {
    Student s1= new Student("Bob",11);
    Course c1= new Course("CSE 111","Programming II");
    s1.addCourse(c1);
    s1.showDetails();
  }
}