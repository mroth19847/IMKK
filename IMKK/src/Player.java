
import java.util.ArrayList;

public abstract class Player {
    
    protected int attack;
    protected int defense;
    protected int hp;
    protected String name;
    protected ArrayList<Item> items = new ArrayList<>();

    public Player(int attack, int defense, int hp, String name, ArrayList<Item> items) {
        this.items = items;
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        this.name = name;
    }

    
    public void fight(Player enemy){
        
    }
    
    public void addItem(){
        
    }
    
    public void removeItem(){
        
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    
    
    
}
