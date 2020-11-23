
class KillarneyRacingTrack extends RacingTrack{

    @Override
    public String getName() {
        return "Killarney";
    }
}
public abstract class RacingTrack {
    public  void welcome(){
        System.out.println("Welcome to the"+ getName()+ "racing track");
    }
    public abstract String getName();

    public static void main(String[] args) {
        RacingTrack killarney = new KillarneyRacingTrack();
        killarney.welcome();
    }
}
