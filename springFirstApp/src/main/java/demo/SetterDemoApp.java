package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA
 * User:  malsalkini
 * Date:  09.05.2019
 * Time:  14:16
 */
public class SetterDemoApp {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BasketballCoach theCoach = context.getBean("myBasketballCoach", BasketballCoach.class);


        context.close();
    }
}
