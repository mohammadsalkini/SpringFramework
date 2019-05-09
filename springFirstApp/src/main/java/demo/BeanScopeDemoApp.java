package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA
 * User:  malsalkini
 * Date:  09.05.2019
 * Time:  15:37
 */
public class BeanScopeDemoApp {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for theCoach: " + theCoach);

        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        context.close();


    }
}
