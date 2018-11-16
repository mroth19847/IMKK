
import java.util.ArrayList;
import java.util.Random;

public abstract class Player {
    
    protected int attack;
    protected int defense;
    protected int hp;
    protected String name;
    protected ArrayList<Item> items = new ArrayList<>();

    public Player(int attack, int defense, int hp, String name) {
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        this.name = name;
    }

    /*
    P1 150 / 120
    P2 125 / 130
    
    d1 = 25
    d2 = 5
    */
    public void fight(Player enemy){
        int d1 = enemy.getAttack() - defense;
        int d2 = attack - enemy.getDefense();
        if(d1 > d2) enemy.die();
        else if (d1 < d2) this.die();
        else{
            Random rdm = new Random();
            int r = rdm.nextInt(2);
            if(r==1) enemy.die();
            else this.die();
        }
    }
    
    public void addItem(Item i){
        attack += i.getDeltaAttack();
        defense += i.getDeltaDefense();
        if(i instanceof Sword && this instanceof Human){
            attack += 5;
            defense += 5;
        } else if(i instanceof Axe && this instanceof Orc){
            attack += 10;
        }
        items.add(i);
    }
    
    public void die(){
        hp--;
    }
    
    public void removeItem(Item i){
        attack -= i.getDeltaAttack();
        defense -= i.getDeltaDefense();
        items.remove(i);
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
