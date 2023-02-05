public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setHealth(700);
        boss1.setDamage(70);
        boss1.setTypeOfProtection("Love");
        System.out.println(boss1.getHealth() + " " + boss1.getDamage() + " " + boss1.getTypeOfProtection());

        Hero[] heroes = createHeroes();
        for (int i=0; i<heroes.length; i++) {
            System.out.println(createHeroes()[i].getHealth()+ " " +createHeroes()[i].getDamage()+ " " +createHeroes()[i].getSuper_ability());
        }
        }
    public static Hero [] createHeroes () {
        Hero batman = new Hero(300, 35, "Fire");
        Hero superman = new Hero(270, 30, "Ground");
        Hero aquaman = new Hero(250, 28, "Water");
        Hero [] heroes = {batman, superman, aquaman};
        return heroes;
    }
}
