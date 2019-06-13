public class Magical extends Player implements Superpowerable{

    int attackType;

    @Override
    public void applySuperAttack() {
        System.out.println("Magic attack");
    }
}
