package hac;

/**
 * Homer is a simple class that implements the consumer
 */
public class Homer extends Thread {
    CookyJar jar;
    private String name;
    Homer (String n)  {this.name = n; }

    /**
     * store the jar reference
     * @param jar the jar to set
     */
    public void setAttentionToJar(CookyJar jar) {
        this.jar = jar;
    }

    /**
     * Homer eats a cookie
     */
    public void eat() {
        jar.getCooky(name);
        try {
            sleep((int) Math.random() * 1000);
        } catch (InterruptedException ie) {
        }
    }

    /**
     * the thread runs in a loop to eat cookies
     */
    public void run() {
        for (int i = 1; i <= 10; i++)
            eat();
    }
}


