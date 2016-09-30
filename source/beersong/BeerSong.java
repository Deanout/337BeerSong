/* @author Dean DeHart
 * Due 160930
 * Assignment #2 - Improve Java skills with an assignment you wouldn't
 * even see in a Java 1 class.
 */
package beersong;

/**
 *
 * @author Dean
 */
public class BeerSong {

    /**
     * Main method, point of entry when running the program.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    /**
     * Helper function prints the actual song when called.
     */
    public static void ninetyNineBottlesOfBeer() {
        for (int i = 99; i > 2; i--) {
            System.out.println(Integer.toString(i) + " bottles of beer on the wall, " + Integer.toString(i) + " bottles of beer");
            System.out.println("take one down, pass it around, " + Integer.toString(i - 1) + " bottles of beer on the wall.");
        }
        System.out.println("2 bottles of beer on the wall, 2 bottles of beer");
        System.out.println("take one down, pass it around, 1 bottle of beer on the wall.");
            
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer");
        System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
    }
}
