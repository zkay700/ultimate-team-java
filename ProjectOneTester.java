/* The program replicates the Ultimate Team game mode in the soccer game Fifa/EAFC where players can build and manage a team of players. The program includes different
   player types and an ultimate team managing system with methods for adding, selling and searching for players.

   Player Super Class: This contains the common attributes and methods such as playerNames,overallRating and position. It has the getPLayerName(), getPosition(), and 
   getRating() methods to retrieve these specific attributes. The getPosition() method will be overridded in each of the subclasses. It also overrides toString(),
   equals() and compareTo() methods.

   Each player position has its own subclasses with attributes that are mostly specific to those positions.

   Attacker class: It has the finishing and goals attributes. It contains the getFinishing(), setFinishing(), getGoals(), setGoals(), scoreGoals(): adds to a players tally 
   whenever a goal is scored, getPosition(), shoot(): action performed whenever a player shoots, dribble(): for whenever the player dribbles
   and an overridded toString method.

   Midfielder class: It has the attributes vision and assists. It contains the getAssist(), getVision(), assistMade(): that is appended whenever an assist is made, pass(),
   getPosition(): overridden, toString() methods.

   Defender class: The defender class has the tackles attributes. it contains getTackles(), setTackle(), successfulTackles(): that increments when successful tackle 
   is made, getPosition() and toString methods.

   Goalkeeper class: It has the diving and cleansheets attributes. It contains the getter and setter methods for diving and cleansheets. An updateCeansheets() method that increments when games without goalsConceded finish.
   A save() method for when a save is made, getPosition() and toString() method.

   UltimateTeam class: It has the attributes players thats stores the teams squad, wins and losses.It contains the addPlayer() method: adds player to squad, 
   sellPlayer(): removes specific player from team, addWins(), displayTeam(), searchPlayers() and toString() method.

 * 
 */

// Main Method
public class ProjectOneTester {
    public static void main(String[] args) {

        Attacker a = new Attacker("Ronaldo", 93, "Attacker", 95, 813);
        Attacker b = new Attacker("Messi", 92, "Attacker" , 90, 760);
        Attacker c = new Attacker("Neymar", 89, "Attacker", 87, 421);

        Midfielder d = new Midfielder("De Bruyne", 90, "Midfielder", 95, 370);
        Midfielder e = new Midfielder("Bellingham", 89, "Midfielder", 91, 170);
        Midfielder f = new Midfielder("Kroos", 91,"Midfielder", 94 , 411);
        
        Defender g = new Defender("Ramos", 90, "Defender", 500, 200);
        Defender h = new Defender("Pepe", 89, "Defender", 470, 300);
        Defender i = new Defender("Carvajal", 88, "Defender", 300, 176);
        Defender j = new Defender("Van Dijk", 87, "Defender", 377, 166);

        Goalkeeper k = new Goalkeeper("Ederson", 87, "Goalkeeper", 89, 140);

        System.out.println("Are they Equal?: " + a.getPlayerName() + " <=> " +  a.getPlayerName() + ": " + a.equals(a));
        System.out.println("Are they Equal?: " + a.getPlayerName() + " <=> " +  c.getPlayerName() + ": " + a.equals(c));

        System.out.println("Comparing on Rating: " + b.getPlayerName() + " <=> " + d.getPlayerName() + ": " + b.compareTo(d));
        System.out.println("Comparing on Rating: " + d.getPlayerName() + " <=> " + g.getPlayerName() + ": " + d.compareTo(g));

        System.out.println("Are the two Attackers Equal? " +  b.getPlayerName() + " <=> " + c.getPlayerName() + ": " + a.equals(c));

        

        System.out.println("\n");

        

        System.out.println(a.getPlayerName() + ": Finishing: " + a.getFinishing()); System.out.println(b.getPlayerName() + ": Finishing: " + b.getFinishing());
        System.out.println(c.getPlayerName() + ": Finishing: " + c.getFinishing());
        System.out.println(a.getPlayerName() + ": Goals: " + a.getGoals()); System.out.println(b.getPlayerName() + ": Goals: " + b.getGoals()); 
        System.out.println(c.getPlayerName() + ": Goals: " + c.getGoals() + "\n");

        a.scoreGoals(4); b.scoreGoals(2); c.scoreGoals(1);
        a.shoot(); b.shoot(); c.shoot(); System.out.println("\n");


        System.out.println(d.getPlayerName() + " : Vision: " + d.getVision()); System.out.println(e.getPlayerName() + " :Vision: " + e.getVision());
        System.out.println(f.getPlayerName() + " :Vision: " + f.getVision());
        System.out.println(d.getPlayerName() + ": Assists: " + d.getAssists()); System.out.println(e.getPlayerName() + ": Assists: " + e.getAssists()); 
        System.out.println(f.getPlayerName() + ": Assists: " + f.getAssists()); System.out.println("\n");

        d.Pass(); e.Pass(); f.Pass();
        d.assistMade(1); e.assistMade(3); f.assistMade(2); System.out.println("\n");
        

        
        System.out.println(g.getPlayerName() + ":Tackles: " + g.getTackles()); System.out.println(h.getPlayerName() + ": Tackles: " + h.getTackles()); System.out.println(i.getPlayerName() + ": Tackles " +  i.getTackles()); 
        System.out.println(j.getPlayerName() + ": Tackles: " + j.getTackles());
        System.out.println(g.getPlayerName() + " : Fouls: " + g.getFouls()); System.out.println(h.getPlayerName() + ": Fouls: " + h.getFouls()); 
        System.out.println(i.getPlayerName() + ": Fouls: " + i.getFouls()); System.out.println(j.getFouls()); System.out.println("\n");

        g.Tackle(); h.Tackle(); i.Tackle(); j.Tackle();

        g.successfulTackles(6, 1); 
        h.successfulTackles(3, 0);
        i.successfulTackles(2, 1);
        j.successfulTackles(5, 1);

       System.out.println("\n");

       System.out.println(k.getPlayerName() + ": Diving: " + k.getDiving()); System.out.println(k.getPlayerName() + ": Cleansheets: " + k.getCleansheets());
       k.updateCleansheets(0);
       System.out.println("\n");


       UltimateTeam team = new UltimateTeam(0, 0, 0);

       team.addPlayer(a); team.addPlayer(b); team.addPlayer(c); team.addPlayer(d); team.addPlayer(e); team.addPlayer(f); team.addPlayer(g);
       team.addPlayer(h); team.addPlayer(i); team.addPlayer(j); team.addPlayer(k);

       team.displayTeam();
       System.out.println("\n");
       
       System.out.println("Wins/Loss/Draws - In last Few Games: ");
       team.addWins(4, 2); team.addWins(2, 1); team.addWins(3, 3); team.addWins(1, 2);
       System.out.println("\n");
        

       team.sellPlayer(i);
    

       team.searchPlayers(i);
       team.searchPlayers(a);

       team.displayTeam();








        








    }

}
