package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA
 * User:  malsalkini
 * Date:  09.05.2019
 * Time:  17:08
 */
public class AnnotationDemoApp {


    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();

    }
}
