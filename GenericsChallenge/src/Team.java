public abstract class Team implements Comparable<Team> {
  private String name;
  private int wins = 0;
  private int losses = 0;
  private int ties = 0;

  public Team(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getWins() {
    return wins;
  }

  public int getLosses() {
    return losses;
  }

  public int getTies() {
    return ties;
  }

  public void win() {
    wins++;
  }

  public void lose() {
    losses++;
  }

  public void tie() {
    ties++;
  }

  public void playMatch(Team home, Team away) {
    System.out.println("***** " + home.getName() + " VS " + away.getName() + " *****");
    for (int i = 0; i < 5; i++) {
      double homeTeamOutcome = Math.random() * 5;
      double awayTeamOutcome = Math.random() * 5;
      if (homeTeamOutcome > awayTeamOutcome) {
        home.win();
        away.lose();
        System.out.println("Match " + (i + 1) + ": " + home.getName() + " won!");
      } else if (homeTeamOutcome < awayTeamOutcome) {
        home.lose();
        away.win();
        System.out.println("Match " + (i + 1) + ": " + away.getName() + " won!");
      } else {
        home.tie();
        away.tie();
        System.out.println("Match " + (i + 1) + ": " + "TIE");
      }
    }
    System.out.println();
  }

  @Override
  public int compareTo(Team team) {
    return Integer.compare(this.wins, team.getWins());
  }
}
