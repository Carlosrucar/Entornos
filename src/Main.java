import org.apache.commons.math3.random.RandomDataGenerator;

public class Main {
    public static void main(String[] args) {
        // Configura el generador de números aleatorios
        RandomDataGenerator randomDataGenerator = new RandomDataGenerato

        // Genera y muestra 10 números aleatorios entre 1 y 100
        System.out.println("10 números aleatorios entre 1 y 100:");
        for (int i = 0; i < 10; i++) {
            int randomNumber = randomDataGenerator.nextInt(1, 100);
            System.out.println(randomNumber);
        }
    }
}