import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    League<FootballTeam> epl = new League<>("European Premiere League");
    League<CricketTeam> ipl = new League<>("Indian Premiere League");

    CricketTeam mi = new CricketTeam("Mumbai Indians");
    CricketTeam csk = new CricketTeam("Chennai Super Kings");
    CricketTeam kkr = new CricketTeam("Kolkata Knight Riders");

    FootballTeam liverpool = new FootballTeam("Liverpool");
    FootballTeam chelsea = new FootballTeam("Chelsea");
    FootballTeam arsenal = new FootballTeam("Arsenal");

    System.out.println("************************** Adding Teams to Leagues ***************************");
    System.out.println("European Premiere League: ");
    epl.addTeam(liverpool);
    epl.addTeam(chelsea);
    epl.addTeam(arsenal);
    System.out.println();
    System.out.println("Indian Premiere League: ");
    ipl.addTeam(mi);
    ipl.addTeam(csk);
    ipl.addTeam(kkr);
    System.out.println();
    System.out.println("-------------------------------------------------------------------------");
    System.out.println();

    System.out.println("************************** Team Details ***************************");
    System.out.println("Teams in the European Premier League: ");
    for(int i = 0; i < epl.getTeams().size(); i++) {
      System.out.println(epl.getTeams().get(i).getName());
    }
    System.out.println();

    System.out.println("Teams in the Indian Premier League: ");
    for(int i = 0; i < ipl.getTeams().size(); i++) {
      System.out.println(ipl.getTeams().get(i).getName());
    }
    System.out.println();
    System.out.println("-------------------------------------------------------------------------");
    System.out.println();

    System.out.println("************************** Cricket Match In Progress ***************************");
    ipl.play(mi, csk);
    ipl.play(mi, kkr);
    ipl.play(csk, kkr);
    ipl.play(csk, mi);
    ipl.play(kkr, mi);
    ipl.play(kkr, csk);
    System.out.println();
    System.out.println("-------------------------------------------------------------------------");
    System.out.println();

    System.out.println("************************** Football Match In Progress ***************************");
    epl.play(liverpool, chelsea);
    epl.play(liverpool, arsenal);
    epl.play(chelsea, arsenal);
    epl.play(chelsea, liverpool);
    epl.play(arsenal, liverpool);
    epl.play(arsenal, chelsea);
    System.out.println();
    System.out.println("-------------------------------------------------------------------------");
    System.out.println();

    System.out.println("************************** League Statistics ***************************");
    System.out.println();
    System.out.println(epl.getName() + ": ");
    for (int i = 0; i < epl.getTeams().size(); i++) {
      System.out.println("Team Name: " + epl.getTeams().get(i).getName() + "\n" +
          "Wins --> " + epl.getTeams().get(i).getWins() + "\n" +
          "Losses --> " + epl.getTeams().get(i).getLosses() + "\n" +
          "Ties -->" + epl.getTeams().get(i).getTies());
      System.out.println();
    }
    System.out.println();
    System.out.println(ipl.getName() + ": ");
    for (int i = 0; i < ipl.getTeams().size(); i++) {
      System.out.println("Team Name: " + ipl.getTeams().get(i).getName() + "\n" +
          "Wins --> " + ipl.getTeams().get(i).getWins() + "\n" +
          "Losses --> " + ipl.getTeams().get(i).getLosses() + "\n" +
          "Ties --> " + ipl.getTeams().get(i).getTies());
    }
    System.out.println("-------------------------------------------------------------------------");
    System.out.println();

    System.out.println("************************** League Ranking ***************************");
    epl.getTeams().sort(Collections.reverseOrder());
    ipl.getTeams().sort(Collections.reverseOrder());
    System.out.println("***** English Premiere League: *****");
    for (int i = 0; i < epl.getTeams().size(); i++) {
      System.out.println("Rank " + (i + 1) + ": " + epl.getTeams().get(i).getName());
    }
    System.out.println();
    System.out.println("***** Indian Premiere League: *****");
    for (int i = 0; i < ipl.getTeams().size(); i++) {
      System.out.println("Rank " + (i + 1) + ": " + ipl.getTeams().get(i).getName());
    }
  }
}
