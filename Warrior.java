public class Warrior extends Player implements Superpowerable {

    int attackType;

    @Override
    public void applySuperAttack() {
        System.out.println("Warrior fights");
    }
}