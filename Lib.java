// lib machine that has the ability to have two pokemons face eachother
public class Lib {
    private Pokemon winner;

    public void highlow(Pokemon poke, SuperPokemon spoke){
        // poke will attack spoke first
        System.out.println(poke.getName() + " attacks " + spoke.getName());
        // poke.attack() returns the damageDealt
        System.out.println("Deals " + poke.attack(spoke) + " damage!");
        System.out.println(spoke.getName() + " has " + spoke.getHp() + "HP left!\n");

        // // super pokemon's turn to attack
        // System.out.println(spoke.getName() + " attacks " + poke.getName());
        // // poke.attack() returns the damageDealt
        // System.out.println("Deals " + spoke.attack(poke) + " damage!");
        // System.out.println(poke.getName() + " has " + poke.getHp() + "HP left!\n");

        // this ends one turn
    }

    public void highlow(SuperPokemon spoke, Pokemon poke){
        // poke will attack spoke first
        System.out.println(spoke.getName() + " attacks " + poke.getName());
        // poke.attack() returns the damageDealt
        System.out.println("Deals " + spoke.attack(poke) + " damage!");
        System.out.println(poke.getName() + " has " + poke.getHp() + "HP left!\n");
    }
}
