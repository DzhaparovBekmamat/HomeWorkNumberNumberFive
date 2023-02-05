public class Hero {
    private int health;
    private int damage;
    private String super_ability;
    public Hero(int health, int damage, String super_ability) {
        this.health = health;
        this.damage = damage;
        this.super_ability = super_ability;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getSuper_ability() {
        return super_ability;
    }
    public void setSuper_ability(String super_ability) {
        this.super_ability = super_ability;
    }
}

