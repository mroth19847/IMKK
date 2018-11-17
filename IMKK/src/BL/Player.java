package BL;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public abstract class Player implements Serializable {

    protected int attack;
    protected int defense;
    protected int hp;
    protected String name;
    protected ArrayList<Item> items = new ArrayList<>();
    protected boolean dead;

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
    public Player fight(Player enemy) throws Exception{
        if(this.dead || enemy.dead) throw new Exception("Dead players are not allowed to fight!");
        int en = enemy.getAttack() - defense;
        int me = attack - enemy.getDefense();
        if (me > en) {
            enemy.die();
            return this;
        } else if (me < en) {
            this.die();
            return enemy;
        } else {
            Random rdm = new Random();
            int r = rdm.nextInt(2);
            if (r == 1) {
                enemy.die();
                return this;
            } else {
                this.die();
                return enemy;
            }
        }
    }

    public void addItem(Item i) {
        attack += i.getDeltaAttack();
        defense += i.getDeltaDefense();
        if (i instanceof Sword && this instanceof Knight) {
            attack += 5;
            defense += 5;
        } else if (i instanceof Axe && this instanceof Orc) {
            attack += 10;
        }
        items.add(i);
    }

    public void die() {
        hp--;
        if(hp == 0) dead = true;
    }

    public void removeItem(Item i) {
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
