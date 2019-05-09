package demo;

import org.springframework.stereotype.Component;
/**
 * Created by Intellij IDEA
 * User:  malsalkini
 * Date:  09.05.2019
 * Time:  17:04
 */

@Component("thatSillyCoach")
public class Tenniscoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Tennis Workout";
    }
}
