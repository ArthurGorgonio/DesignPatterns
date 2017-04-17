package singleton;

public class Singleton2 {
    private static int count = 0;
    private int numero;
    private static Singleton2 control = null;
    
    public static Singleton2 getInstance(){
        if(control == null){
            control = new Singleton2();
            System.out.println("Creating instnce");
        }
        return control; 
    }
    
    
    private Singleton2 () {
        numero = ++count;
    }
    public String teste() {
        return "Incremental " + numero;
    }
}