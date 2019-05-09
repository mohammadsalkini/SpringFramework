package demo;

/**
 * Created by Intellij IDEA
 * User:  malsalkini
 * Date:  09.05.2019
 * Time:  12:12
 */
public class TrackCoach implements Coach {


    private  FortuneService fortuneService;

    public TrackCoach (FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "demo.TrackCoach Workout";
    }

    @Override
    public String getDailyFortune() {
        return "through Track class " + fortuneService.getFortune();
    }


    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }
}
