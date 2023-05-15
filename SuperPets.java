public class SuperPets {
    private int atk;
    private int hp;
    private boolean isDead;
    private boolean hasEffect;
    private String name;
    private int level;
   private int battleHP;

    public SuperPets(int atk, int hp, int level, String name, boolean isDead, boolean hasEffect){
        this.atk = atk;
        this.hp = hp;
        this.level = level;
        this.name= name;
        this.isDead = isDead;
        this.hasEffect = hasEffect;
    }

    public void changeHP(int x){
        this.hp -=x;
    }

    public void attack(SuperPets s){
        s.changeHP(this.atk);
    }

    public int getAtk(){
        return atk;
    }

    public int getHp(){
        return hp;
    }

    public void setAtkHP(int h, int y){
        atk = h;
        hp = y;
    }
    public void setBattleHP(){
        battleHP = hp;
    }

    public void reset(){
        hp = battleHP;
    }

    public String getName(){
        return name;
    }

    public int getLevel(){
        return level;
    }

}
