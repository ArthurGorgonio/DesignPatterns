/**
 * 
 */
package creation.clients;

import singleton.Singleton2;

/**
 * @author arthur
 *
 */
public class SingletonClient2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++){
            Singleton2 sin = Singleton2.getInstance();
            System.out.println(sin);
        }

    }

}
