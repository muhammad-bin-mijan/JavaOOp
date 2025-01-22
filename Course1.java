public class Course1
{
  public String code;
  public String title;
  
  public Course1(String c, String t)
  {
    code=c;
    title=t;
  }
  public Course1(String c)//constructor overloading
  {
    code=c;
    title="Not setted yet";
  }
}