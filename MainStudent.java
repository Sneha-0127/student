public class MainStudent {

    String name;
    int id;
    String course;
    int phn_no;
    String address;

    public MainStudent(String name,int id,String course,int phn_no,String address){
        this.name=name;
        this.id=id;
        this.course=course;
        this .phn_no=phn_no;
        this.address=address;
    }
        public void DisplayDetails(){

            System.out.println(" Student Name :"+name);
            System.out.println("Student ID :"+id);
            System.out.println("Student course :"+course);
            System.out.println("Student phn no :"+phn_no);
            System.out.println("Student address:"+address);

        }
        public static void main(String[] args){
            MainStudent ms=new MainStudent("stuti",023,"Computer Applications",12345,"belgavi");
            ms.DisplayDetails();
        }
    
}
