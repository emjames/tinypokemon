// superpokemon contains one extra ability over the normal pokemon
public class SuperPokemon extends Pokemon {
    private Ability superAbility;

    // default constructor
    public SuperPokemon(){
        superAbility = new Ability("Super Attack", 20);
        // the pokemon class also calls its println because it is called by SuperPokemon
        // System.out.println("A new super pokemon has been created!");
    }

    // pokemon constructor
    public SuperPokemon(String name, Double hp, Ability ab, Ability sab) {
        // super.name = name;
        // super.hp = hp;
        // super.uniqueAbility = ab;
        super(name, hp, ab);
        superAbility = sab;
        // System.out.println("A new pokemon has been created!");
    }

    // setters
    public void setSuperAbility(Ability sab){
        superAbility = sab;
    }

    // getters
    public Ability getSuperAbility(){
        return superAbility;
    }


    // other methods
    // extends Pokemon's print to show the extra ability
    public void printPokemon(){
        super.printPokemon();
        System.out.println("Super Ability: " + superAbility.getName());
        System.out.println("Super Ability: " + superAbility.getAtkDmg());
        // System.out.println("Print from super poke");
    }

}
