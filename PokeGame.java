// main controller for the Pokemon game
public class PokeGame {
    // flip to check if there is a winner
    private static boolean have_win = false;

    // track pokemon's turns
    private string game_turn = "";

    public static void main(String[] args) {
        System.out.println("\tGame is up\n");
        System.out.println("=====================");

        // create a normal pokemon
        Pokemon poke1 = new Pokemon();
        poke1.setName("Gyarados");
        poke1.setHp((short)170);

        // create a super pokemon
        SuperPokemon spoke1 = new SuperPokemon();
        spoke1.setName("Dragonite");
        spoke1.setHp((short)180);
        Ability sability = new Ability("Spit Fire", 30);
        spoke1.setSuperAbility(sability);

        // print the pokemon information
        System.out.println("Total number of Pokemon created: " + Pokemon.pokeCount + "\n\n");
        poke1.printPokemon();
        System.out.println("");
        spoke1.printPokemon();

        // fighting judge
        Lib g = new Lib();

        System.out.println(poke1.getName() + " VS " + spoke1.getName() + "!");
        System.out.println("\nLet's battle!");
        System.out.println("===============================");


        // let the normal pokemon go first
        game_turn = poke1.getName();

        // loop until one pokemon's hp is less than 0
        // while(poke1.getHp() > 2 && spoke1.getHp() > 2){
        while(!have_win){

            // check if poke is the winner
            // if NORMAL pokemon's hp > SUPER pokemon's hp AND SUPER pokemon's hp is <= 1
            if(poke1.getHp() > spoke1.getHp() && spoke1.getHp() <= 1){
                System.out.println(poke1.getName() + " is the winner!!");
                have_win = true;

            // check if spoke is the winner
            // if SUPERpokemon's hp > NORMAL pokemon's hp AND NORMAL pokemon's hp is <= 1
            } else if(spoke1.getHp() > poke1.getHp() && poke1.getHp() <= 1) {
                System.out.println(spoke1.getName() + " is the winner!!");
                have_win = true;
            // else play again
            } else {
                switch(game_turn){
                    case poke1.getName():
                        // the normal pokemon attacks the super pokemon
                        g.highlow(poke1, spoke1);
                        break;
                    case spoke1.getName():
                        // the super pokemon attacks the normal pokemon
                        g.highlow(spoke1, poke1);
                        break;
                }
            }
        }

        System.out.println("\n\n\tEnd Game!");
        System.out.println("=====================");
    }

}
