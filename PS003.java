class Bowler {
    String name;
    int wickets;
    int matches;
    int balls_bowled;
    int runs_conceded;

    Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.balls_bowled = 0;
        this.runs_conceded = 0;
    }

    Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    void computeBowlingAverage() {
        if (wickets <= 0 || runs_conceded < 0 || balls_bowled < 0 || matches < 0) {
            System.out.println("Error");
        } else {
            double bowling_avg = (double) runs_conceded / wickets;
            System.out.println("Name: " + name);
            System.out.println("bowling_avg=" + bowling_avg);
        }
    }

    void showStatistics() {
        if (wickets < 0 || runs_conceded < 0 || balls_bowled < 0 || matches < 0) {
            System.out.println("Error");
        } else if ((runs_conceded > 0 || balls_bowled > 0) && matches == 0) {
            System.out.println("Error");
        } else {
            System.out.println("Name=" + name);
            System.out.println("wickets=" + wickets);
            System.out.println("matches=" + matches);
            System.out.println("balls_bowled=" + balls_bowled);
            System.out.println("runs_conceded=" + runs_conceded);
        }
    }

    void computeStrikeRate() {
        if (wickets < 0 || runs_conceded < 0 || balls_bowled < 0 || matches < 0) {
            System.out.println("Error");
        } else if ((runs_conceded > 0 || balls_bowled > 0) && matches == 0) {
            System.out.println("Error");
        } else {
            double strike_rate = (double) runs_conceded / balls_bowled;
            System.out.println("Name: " + name);
            System.out.println("Strike_rate=" + strike_rate);
        }
    }
}

public class Testing {
    public static void main(String[] args) {
        // Create object of Bowler class
        Bowler bowler = new Bowler("Sachin", 10, 5, 750, 463);

        // Call the methods of Bowler class
        bowler.computeBowlingAverage();
        bowler.showStatistics();
        bowler.computeStrikeRate();
    }
}