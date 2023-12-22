public class Medic extends Hero{
    public Medic() {
        super(200, 10, "Healing");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic uses " + superAbility);
    }
    private int healPoints;
    public double increaseExperience(){
        System.out.println("Медик повысил навык");
        return healPoints += (int) (healPoints * 0.1);
    }
}
