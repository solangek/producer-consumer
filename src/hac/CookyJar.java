package hac;

/**
 * A class that represents a cooky jar.
 * This is the object that the producer and consumer use to communicate.
 */
public class CookyJar {

    private int contents;  // cookie number for output trace
    private boolean available = false; // conly one cookie ine JAR!

    /**
     * Get the cookie from the jar.
     * @param who a string that represents the name of the consumer
     */
    public synchronized void getCooky(String who) {
        while (available == false) {
            try {
                System.out.println("... " + who + " is waiting in getCooky");
                wait();
            } catch (InterruptedException e) { }

//            if (available == false)
//                System.out.println(who + " got notified in getCooky...but available is FALSE :-(((");
//            else
//                System.out.println(who + " got notified in getCooky...and available is TRUE  :-)))");
        }
        System.out.println(who + " gained getCooky access after wait");
        available = false;
        notifyAll();
        System.out.println( "---" + who + " ate cooky " + contents);
    }

    /**
     * Put a cookie into the jar.
     * @param who a string that represents the name of the producer
     * @param value the cookie number
     */
    public synchronized void putCooky(String who, int value) {
        while (available == true) {
            try {
                System.out.println("... " + who + " is waiting in putCooky...");
                wait();
            } catch (InterruptedException e) { }

//            if (available == false)
//                System.out.println(who + " got notified in putCooky ...but available is FALSE :-(((");
//            else
//                System.out.println(who + " got notified in putCooky...and available is TRUE  :-)))");
        }
        System.out.println(who + " gained putCooky access after wait");
        contents = value;
        available = true;
	    System.out.println("+++ " + who + " put cooky " + contents + " in the jar");
        notifyAll();
    }


}

