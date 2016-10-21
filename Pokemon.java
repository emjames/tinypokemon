import java.util.Random;

// main pokemon class
public class Pokemon {
    // total number of pokemons made
    public static int pokeCount = 0;
    // Pokemon name
    protected String name;
    // Pokemon health points
    protected Double hp;
    // Pokemon energy to attack
    // 1 energy = 10 atk power
    protected int energy = 5;
    // Pokemon abilities
    // an ability might be stronger but will need more energy
    protected Ability uniqueAbility;

    // default pokemon constructor
    public Pokemon(){
        name = Integer.toString(++pokeCount);
        hp = 100.0;
        uniqueAbility = new Ability();
        // System.out.println("A new pokemon has been created!");
    }

    // pokemon constructor
    public Pokemon(String name, Double hp, Ability ab) {
        this.name = name;
        this.hp = hp;
        uniqueAbility = ab;
        // System.out.println("A new pokemon has been created!");
    }


    // setters
    // name
    public void setName(String name){
        this.name = name;
    }
    // hp
    public void setHp(double hp) {
        this.hp = hp;
    }
    // energy
    public void setEnergy(int e){
        energy = e;
    }
    // ability
    public void setAbility(Ability ab){
        uniqueAbility = ab;
    }


    // getters
    public String getName(){
        return name;
    }

    public double getHp(){
        return hp;
    }

    public int getEnergy(){
        return energy;
    }

    public Ability getAbility(){
        return uniqueAbility;
    }


    // other methods
    // prints the pokemon's information
    public void printPokemon(){
        System.out.println("Pokemon created:");
        System.out.println("Name: " + name);
        System.out.println("Hp: " + hp);
        System.out.println("Energy: " + energy);
        System.out.println("Ability: " + uniqueAbility.getName());
        System.out.println("Ability attack power: " + uniqueAbility.getAtkDmg());

    }


    // deals damage to another pokemon
    public int attack(Pokemon poke){
        // create a random generator
        Random r = new Random();
        int energyUsed = 0;
        // if there's enough energy
        // randomly choose the amount of energy to use
        // otherwise no damage will be dealth because not enough energy
        if(energy > 1){
            // System.out.println("Energy before:" + energy);
            energyUsed = r.nextInt(energy) + 1;
        }
        else {
            System.out.println(name + " doesn't have enough energy!");
        }

        // multiply the amount of energy by 10
        int dealtDmg = energyUsed * 10;

        // substract energyUsed from the total energy
        // adds 1 energy per turn
        energy = energy - energyUsed + 1;
        // System.out.println("Pke energy:" + energy);

        // set the other poke's hp
        poke.setHp(poke.getHp() - dealtDmg);

        return dealtDmg;
    }



}
