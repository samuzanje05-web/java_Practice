class Student{
    int m1;
    
    void show(Student other){
    if(this.m1 > other.m1){
        System.out.println("the first sudent has");
    }else if(other.m1>this.m1){
        System.out.println("second student has");
    }
    else{
        System.out.println("bash are equal");
    }
}
}
public class studentother {
    public static void main(String[]args){
        Student s1= new Student();
        Student s2= new Student();
        s1.m1 = 85;
        s2.m1 = 90;

        s1.show(s2);
    }
}
