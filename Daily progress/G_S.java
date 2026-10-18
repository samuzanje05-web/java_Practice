package costroctor;
class Student{
    private String name;
    private int marks;
    void setname(String name){
        this.name=name;
    }
    void setmarks(int marks){
        if(marks>=0 && marks<=100){
            this.marks=marks;
        }
        else{
            System.out.println("invalid marks");
        }
    }
}
public class G_S {
    public static void main(String [] args){
        Student s1 = new Student();
        s1.setname("samyy");
        s1.setmarks(90);
    }
}
