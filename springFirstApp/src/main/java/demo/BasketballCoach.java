package demo;

/**
 * Created by Intellij IDEA
 * User:  malsalkini
 * Date:  09.05.2019
 * Time:  13:59
 */
public class BasketballCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

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

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("inside setter method - setTeam");
        this.team = team;
    }
}
