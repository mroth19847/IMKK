public abstract class Item {
    
    protected int deltaAttack;
    protected int deltaDefense;

    public Item(int deltaAttack, int deltaDefense) {
        this.deltaAttack = deltaAttack;
        this.deltaDefense = deltaDefense;
    }

    public int getDeltaAttack() {
        return deltaAttack;
    }

    public int getDeltaDefense() {
        return deltaDefense;
    }

    
    
}
