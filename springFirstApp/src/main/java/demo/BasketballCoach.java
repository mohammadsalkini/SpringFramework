package demo;

/**
 * Created by Intellij IDEA
 * User:  malsalkini
 * Date:  09.05.2019
 * Time:  13:59
 */
public class BasketballCoach implements Coach {

    private FortuneService fortuneService;

    public BasketballCoach() {

        System.out.println("inside Basketball class");
    }

    @Override
    public String getDailyWorkout() {
        return "Basketball Workout";
    }

    @Override
    public String getDailyFortune() {
        return "Through Basketball class " + fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }
}
