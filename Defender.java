// Subclass that represents a defender and extends the Player parent class.
public class Defender extends Player{
    private int tackles;
    private int fouls;

    public Defender(String playerName, int overallRating, String position,  int tackles, int fouls) {
        // calls the attributes common to each player.
        super(playerName, overallRating, position);
        // Initializes the defender specific attributes.
        this.tackles = tackles;
        this.fouls = fouls;
    }
    
    // Getter and Setter methods.
    public int getTackles() {
        return tackles;
    }

    public void setTackles(int tackles) {
        this.tackles = tackles;
    }

    public int getFouls() {
        return fouls;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }
    
    // Method that increments the tackles attribute when a successful tackle is made and the fouls attribute when the player commits a foul.
    public void successfulTackles(int tackleSuccessful, int foulsCommitted) {
        if (tackleSuccessful >= 1 && foulsCommitted == 0) {
            tackles += tackleSuccessful;
            System.out.println(getPlayerName() + " comitted " + foulsCommitted + " fouls and " + tackleSuccessful + " tackles were successful");
        }

        else {
            fouls += foulsCommitted;
            System.out.println(getPlayerName() + " committed " + foulsCommitted + " fouls and " + tackleSuccessful + " tackles were successful");
        }
    }
    
    // Tackle action for when a player makes a tackle.
    public void Tackle() {
        System.out.println(getPlayerName() + " made a tackle ");
    }

    @Override
    public String getPosition() {
        return "Defender";
    }

    @Override
    public String toString() {
        return super.toString() + " | Tackles: " + tackles + " | Fouls: " + fouls; 
    }


    
}
