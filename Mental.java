public class Mental extends Player implements Superpowerable {

    int attackType;

    @Override
    public void applySuperAttack() {
        System.out.println("Kinetic attack");
    }
}