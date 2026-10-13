class Bank_Account{
   private int  AC_NO;
   private  String H_Name;
   private double balance;
    void setAC_NO (int  AC_NO){
       this.AC_NO = AC_NO; 
    }
   void setH_Name(String H_Name){
    this.H_Name = H_Name;
   }
   void setbalance(double balance){
    if(balance>0){
    this.balance=balance; 
       
   }else{
    System.out.println("entered negative balance");
   }
}
    int getAC_NO() {
    return AC_NO;
   }
   String getH_Name() {
    return H_Name;
   }
   double getbalance() {
    return balance;
   }
   public class B_A{
    public static void main(String[]args){
        Bank_Account an = new Bank_Account();
        an.setAC_NO(123456);
        an.setH_Name("samyy");
        an.setbalance(10000);
    
        System.out.println(an.getAC_NO());
        System.out.println(an.getH_Name());
        System.out.println(an.getbalance ());
    }
   }
   }




