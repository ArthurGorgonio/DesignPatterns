/**
 * 
 */
package clients;

import uniqueInstance.Singleton;

/**
 * @author arthur
 *
 */
public class SingletonClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Singleton o, k;
        
        o = Singleton.getInstance();
        o.plus();
        
        k = Singleton.getInstance();
        k.plus();
    }

}
