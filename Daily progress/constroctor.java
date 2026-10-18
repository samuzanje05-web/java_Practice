package costroctor;
class  calculator{
    int add(int a, int b){
        return a + b;
    }
    double add(double a, double b){
        return a + b;
    } 
    public class constroctor{
        public static void main(String []args){
            calculator c1= new calculator();
            System.out.println(c1.add(10,20));
            System.out.println(c1.add(10.5,20.5));
        }
    }
}