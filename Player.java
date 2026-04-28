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

 // This is the Abstract Parent class that implements the Comparable<Player> interface.

public abstract class Player implements Comparable<Player> {
    // Instance variables that are common to all the players.
    private String playerName;
    private int overallRating;
    private String position;
    
    // Contructor to initialize the players attributes.
    public Player(String playerName, int overallRating, String position) {
        this.playerName = playerName;
        this.overallRating = overallRating;
        this.position = position;
              
    }

    // setter and getter methods

    public String getPlayerName() {
        return playerName;
    }


    public void setName(String name) {
        this.playerName = name;
    }

    public int getRating() {
        return overallRating;
    }
    
    public void setRating(int overallRating) {
        this.overallRating = overallRating;
    }
    
    // Abstract method to get the players position and must be implemented by the subclasses.
    public abstract String getPosition();

    @Override
    public String toString() {
        return playerName + " | " + position + " | " + overallRating;
    }
     
    // Two player objects are considered equal if they have the same overall rating, name and position.
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Player p = (Player) o;
        return overallRating == p.overallRating && playerName.equals(p.playerName) && position.equals(p.position);
    }
    
    // compares this player to another player based on their overall rating.
    // return 1 if this has a higher rating, -1 if this player has a lower rating and 0  if they have the same rating.
    @Override
    public int compareTo(Player other) {
        return Integer.compare(this.overallRating, other.overallRating);
    }




    
}
