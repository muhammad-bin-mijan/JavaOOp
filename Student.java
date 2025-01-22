public class Student
{
  public String name;
  public int id;
  public Course[] courses=new Course[5];//multi-class
  public int course_count=0;
  
  public Student(String n,int i)
  {
    name=n;
    id=i;
    System.out.println("Student info updated");
  }
  public void addCourse(Course obj)
  {
    courses[course_count]=obj;
    course_count++;
    System.out.println(obj.code+" is added for "+name);
  }
  public void showDetails()
  {
    System.out.println("NAME :"+name);
    System.out.println("ID :"+id);
    System.out.println("Courses Taken by "+name);
    for(int i=0;i<course_count;i++)
    {
      System.out.println((i+1)+"."+courses[i].title+" ("+courses[i].code+") ");
      
    }
    
  }
}