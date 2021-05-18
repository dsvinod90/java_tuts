import java.util.ArrayList;

public class League<T extends Team> {
  private String name;
  private ArrayList<T> teams = new ArrayList<>();

  public League(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public ArrayList<T> getTeams() {
    return teams;
  }

  public void addTeam(T team) {
    if (teams.contains(team)) {
      System.out.println("Team is already present in the league");
    } else {
      teams.add(team);
      System.out.println(team.getName() + " added to " + name);
    }
  }

  public void play(T home, T away) {
    home.playMatch(home, away);
  }
}
