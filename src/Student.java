public class Student
{
    private String name;
    private float rating;
    private Student(){}

    public String getName()
    {
        return this.name;
    }

    public void setName(String name )
    {
        this.name = name;

    }
    private Student(String name, float rating)

    {
        this.name = name;
        this.rating = rating;
    }

   private  void printStudent()
    {
        System.out.println("Student " + name + " have rating:" + rating);
    }

}
