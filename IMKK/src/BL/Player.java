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
    protected int xp;
    protected int level;

    public Player(int attack, int defense, int hp, String name) {
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        this.name = name;
        this.xp = 0;
        this.level = 1;
    }

    public Player fight(Player enemy) throws Exception {
        if (this.dead || enemy.dead) {
            throw new Exception("Dead players are not allowed to fight!");
        }
        int en = enemy.getAttack() - defense;
        int me = attack - enemy.getDefense();
        if (me > en) {
            this.addXP(25);
            enemy.addXP(15);
            enemy.die(me-en);
            return this;
        } else if (me < en) {
            this.addXP(15);
            enemy.addXP(25);
            this.die(en-me);
            return enemy;
        } else {
            Random rdm = new Random();
            int r = rdm.nextInt(2);
            if (r == 1) {
                this.addXP(25);
                enemy.addXP(15);
                enemy.die(1);
                return this;
            } else {
                this.addXP(15);
                enemy.addXP(25);
                this.die(1);
                return enemy;
            }
        }
    }

    public int getItemCount() {
        return items.size();
    }

    public void addItem(Item i) {
        attack += i.getDeltaAttack();
        defense += i.getDeltaDefense();
        if (this.getClass().getSimpleName().equals(i.getAdvantagedSpecies())) {
            attack += i.getAdvantageAttack();
            defense += i.getAdvantageDefense();
        }
        items.add(i);
    }

    public void die(int diff) {
        if(diff >= 100) hp -= 5;
        else if(diff >= 75) hp -= 4;
        else if(diff >= 50) hp -= 3;
        else if(diff >= 25) hp -= 2;
        else hp -= 1;
        if (hp <= 0) {
            dead = true;
        }
    }

    public void removeItem(Item i) {
        attack -= i.getDeltaAttack();
        defense -= i.getDeltaDefense();
        if (this.getClass().getSimpleName().equals(i.getAdvantagedSpecies())) {
            attack -= i.getAdvantageAttack();
            defense -= i.getAdvantageDefense();
        }
        items.remove(i);
    }

    public void addXP(int experience) {
        xp += experience;
        if (xp >= 50) {
            level++;
            attack += 10;
            defense += 10;
            xp -= 50;
        }
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
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
