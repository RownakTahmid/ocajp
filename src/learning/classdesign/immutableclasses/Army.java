package learning.classdesign.immutableclasses;

/**
 * This is an immutable class where all the fields are final, and we don't have any setter
 * so once the object is initiated it can not be changed.
 */
public class Army {
    private final int cavalryArcher;
    private final int lightHorseman;
    public Army(int cavalryArcher, int lightHorseman){
        this.cavalryArcher = cavalryArcher;
        this.lightHorseman = lightHorseman;
    }
    public int getCavalryArcher(){
        return cavalryArcher;
    }
    public int getLightHorseman(){
        return lightHorseman;
    }
    public Army totalArmy(Army army){
        int archer = this.cavalryArcher + army.cavalryArcher;
        int horseman = this.lightHorseman + army.lightHorseman;
        return  new Army(archer,horseman);
    }
    public static Army addArmies(Army army1, Army army2){
/*        int archer = this.cavalryArcher + army.cavalryArcher;
        int horseman = this.lightHorseman + army.lightHorseman;*/
        return army1.totalArmy(army2);
    }
    public void printArmy(){
        System.out.println("Total Cavalry Archer = "+ cavalryArcher);
        System.out.println("Total Light Horseman = "+ lightHorseman);
    }

    public static void main(String[] args) {
        Army goldenHorde = new Army(25000,34000);
        Army whiteHorde = new Army(19000,27000);
        Army totalArmy = goldenHorde.totalArmy(whiteHorde);
        totalArmy.printArmy();
        System.out.println(System.identityHashCode(totalArmy));
        addArmies(goldenHorde,whiteHorde).printArmy();
        System.out.println(System.identityHashCode(addArmies(goldenHorde,whiteHorde)));



    }

}
