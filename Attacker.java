// subclass Attacker that represents the attackers in the squad and extends Player.
public class Attacker extends Player{
    private int finishing;
    private int goals;

    public Attacker(String playerName, int overallRating, String position, int finishing, int goals) {

        // calls the attributes from parent class to initialize the common attributes.
        super(playerName, overallRating, position);

        // initialization of attacker specific attributes.
        this.finishing = finishing;
        this.goals = goals;
    }
    
    // Getter and Setter methods.
    public int getFinishing() {
        return finishing;
    }

    public void setFinishing(int finishing) {
        this.finishing = finishing;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
    
    // Method that increments the goals attribute by the number of goals scored in a specific match.
    public void scoreGoals(int goalsScored) {
        if (goalsScored >= 1) {
            goals += goalsScored;
            System.out.println(getPlayerName() + " scored " + goalsScored + " taking his tally to " + goals);
        }
    }
    
    // shoot method for when a player takes a shot.
    public void shoot() {
        System.out.println(getPlayerName() + " took a shot");
    }
    
    // dribble method for when the attacker completes a dribble.
    public void dribble() {
        System.out.println(getPlayerName() + " completed a dribble");
    }
    
    @Override
    public String getPosition() {
        return "Attacker";
    }
    

    //Overriding Equals method.
    // Two Attacker objects are equal if they have the same number of goals and name.
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Attacker attacker = (Attacker) o;

        if (!super.equals(o)) {
            return false;
        }

        return this.goals == attacker.goals && this.getPlayerName().equals(attacker.getPlayerName());
    }

    @Override
    public String toString() {
        return super.toString() + " | Goals: " + goals;
    }




    
    
}
