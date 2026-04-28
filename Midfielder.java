// Subclass that represents a midfielder and extends the Player parent class.
public class Midfielder extends Player {
    private int vision;
    private int assists;

    public Midfielder(String playerName, int overallRating, String position, int vision, int assists) {

        // calls the attributes common to each player.
        super(playerName, overallRating, position);
        // initializes the midfielder specific attributes.
        this.vision = vision;
        this.assists = assists;
    }
    
    // Getter and Setter methods.
    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }


    // Method that increments the assists attribute of a midfielder by the number of assists made in a match.
    public void assistMade(int assisted) {
        if (assisted >= 1) {
            assists += assisted;
            System.out.println(getPlayerName() + " got " + assisted + " assists taking his tally to " + assists);
        }
    }
    
    // Pass method for when a player makes a dangerous pass.
    public void Pass() {
        System.out.println(getPlayerName() + " made an incisive pass ");
    }

    @Override
    public String getPosition() {
        return "Midfielder";
    }

    public String toString() {
        return super.toString() + "| Assists: " + assists;
    }
    
}
