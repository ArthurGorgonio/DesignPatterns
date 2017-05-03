/**
 * 
 */
package uniqueInstance;

/**
 * @author arthur
 *
 */
public class Singleton {
    private static Singleton control = null;
    public int x = 0;
    private Singleton(){
        
    }
    
    public static Singleton getInstance(){
        if(control == null){
            control = new Singleton();
            System.out.println("Creating instnce");
        }
        return control; 
    }
    
    public void plus(){
        System.out.println("Iteração " + x);
        x++;
    }
}
