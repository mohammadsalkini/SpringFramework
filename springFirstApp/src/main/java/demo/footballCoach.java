package demo;

/**
 * Created by Intellij IDEA
 * User:  malsalkini
 * Date:  09.05.2019
 * Time:  12:06
 */
public class footballCoach implements Coach{

    private FortuneService fortuneService;

    private footballCoach(FortuneService fortuneService) {

        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout () {
        return "footballWorkout";
    }

    @Override
    public String getDailyFortune() {
        return "through footballCoach class " + fortuneService.getFortune();
    }
}
