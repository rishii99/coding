public class variable {
    int a=10; //instance variable
    static double b = 20.5; //static variable

    public static void main(String[] args) {
        
        boolean c=true; 
        variable v=new variable();
        System.out.println(v.a+" "
        +b+" "+c);
    }
}
