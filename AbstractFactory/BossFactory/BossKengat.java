package AbstractFactory.BossFactory;

import AbstractFactory.Kengat;

public class BossKengat implements Kengat {

    @Override
    public void pueKengat() {
        System.out.println("Puit bossin kengät");

    }
    @Override
    public String toString() {
        return("Bossin Kengät");
    }
}
