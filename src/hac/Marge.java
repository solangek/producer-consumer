package hac;

/**
 * This class represents the producer.
 */
public class Marge extends Thread {
    CookyJar jar;

    public Marge() {
        super();
    }

    /**
     * stores the jar
     * @param jar
     */
    public void setAttentionToJar(CookyJar jar) {
        this.jar = jar;
    }

    /**
     * Bakes a cookie
     * @param cookyNumber the number of the cookie
     */
    public void bake(int cookyNumber) {

        jar.putCooky("Marge", cookyNumber);
        try {
            sleep((int) Math.random() * 500);
        } catch (InterruptedException ie) {
        }
    }

    /**
     * thread run method to produce cookies
     */
    public void run() {
        for (int i = 1; i <= 10; i++)
            bake(i);
    }

}


