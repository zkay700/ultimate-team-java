// Subclass that represents a Goalkeeper and extends the player parent class.
public class Goalkeeper extends Player{
    private int diving;
    private int cleansheets;

    public Goalkeeper(String playerName, int overallRating, String position, int diving, int cleansheets) {
        // calls the attributes common to each player.
        super(playerName, overallRating, position);
        // initizalizes the goalkeeper specific attributes.
        this.diving = diving;
        this.cleansheets = cleansheets;
    }

    // Getter and Setter methods.
    public int getDiving() {
        return diving;
    }

    public void setDiving(int diving) {
        this.diving = diving;
    }

    public int getCleansheets() {
        return cleansheets;
    }

    public void setCleansheets(int cleansheets) {
        this.cleansheets = cleansheets;
    }
    
    // Method that increments the Cleansheets attribute if the goalkeeper does not concede a goal in the match.
    public void updateCleansheets(int goalsConceded) {
        if (goalsConceded == 0) {
            cleansheets++;
            System.out.println(getPlayerName() + " did not concede a single goal in the last match taking his cleansheets tally to " + cleansheets);
        }
    }

    @Override
    public String getPosition() {
        return "Goalkeeper";
    }

    @Override
    public String toString() {
        return super.toString() + " | Cleansheets: " + cleansheets;
    }

}
