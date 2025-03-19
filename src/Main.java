//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Delfin d = new Delfin();
        BallenaAzul b1 = new BallenaAzul(3);
        BallenaAzul b2 = new BallenaAzul(6);
        TriAtleta t = new TriAtleta(10);

        System.out.println("Delfin: " + d.nadar(100) + "s");
        System.out.println("BallenaMorada 1: " + b1.nadar(100) + "s");
        System.out.println("BallenaAzul 2: " + b2.nadar(100) + "s");
        System.out.println("TriAtleta: " + t.nadar(100) + "s");
    }

}

interface Ciclista {
    public float recorrer(float km, String terreno);
}

interface Nadador {
    public float nadar(float m);
}

interface Saltador {
    public float saltarAltura();
}

class Delfin implements Nadador {
    Random r = new Random();
    float velocidad = r.nextInt(40,71)/3.6f;
    public float nadar(float m) {
        return (m/velocidad);
    }
}

class BallenaAzul implements Nadador {
    int edad;
    public BallenaAzul (int e) {
        this.edad = e;
    }
    public float nadar(float m) {
        if (edad >= 7) return m/(10/3.6f);
        else return m/(13/3.6f);
    }
}

class TriAtleta implements Ciclista, Nadador, Saltador {
    float velocidad;
    Random r = new Random();
    public TriAtleta (float kmh) {
        this.velocidad = kmh;
    }
    public float nadar(float m) {
        return (m/(velocidad/3.6f));
    }
    public float recorrer(float km, String terreno) {
        return r.nextInt(100);
    }
    public float saltarAltura() {
        return r.nextInt(100);
    }
}