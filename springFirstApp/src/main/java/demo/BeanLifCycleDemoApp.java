package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA
 * User:  malsalkini
 * Date:  09.05.2019
 * Time:  15:37
 */
public class BeanLifCycleDemoApp {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}
