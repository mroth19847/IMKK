package BL;

import java.io.Serializable;

public abstract class Item implements Serializable{
    
    protected int deltaAttack;
    protected int deltaDefense;
    protected String advantagedSpecies;
    protected int advantageAttack;
    protected int advantageDefense;

    public Item(int deltaAttack, int deltaDefense, String advantagedSpecies, int advantageAttack, int advantageDefense) {
        this.deltaAttack = deltaAttack;
        this.deltaDefense = deltaDefense;
        this.advantagedSpecies = advantagedSpecies;
        this.advantageAttack = advantageAttack;
        this.advantageDefense = advantageDefense;
    }

    public int getDeltaAttack() {
        return deltaAttack;
    }

    public int getDeltaDefense() {
        return deltaDefense;
    }

    public int getAdvantageAttack() {
        return advantageAttack;
    }

    public int getAdvantageDefense() {
        return advantageDefense;
    }

    public String getAdvantagedSpecies() {
        return advantagedSpecies;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    
    

    
    
}
