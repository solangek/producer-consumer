package hac;

public class SimpsonsTest {

    public static void main(String[] args) {
        CookyJar jar = new CookyJar();
        Homer homer = new Homer("Homer");
        homer.setAttentionToJar(jar);

        Marge marge = new Marge();
        marge.setAttentionToJar(jar);

        marge.start();
        homer.start();
    }
}


