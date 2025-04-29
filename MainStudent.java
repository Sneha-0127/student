package Student;

public class MainStudent {

    String name;
    int id;
    String course;

    public MainStudent(String name,int id,String course){
        this.name=name;
        this.id=id;
        this.course=course;
    }
        public void DisplayDetails(){

            System.out.println(" Student Name :"+name);
            System.out.println("Student ID :"+id);
            System.out.println("Student course :"+course);
        }
        public static void main(String[] args){
            MainStudent ms=new MainStudent("stuti",023,"Computer Applications");
            ms.DisplayDetails();
        }
    
}
