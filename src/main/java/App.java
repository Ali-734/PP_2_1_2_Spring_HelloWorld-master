import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean.equals(bean1));
        Cat one =
                (Cat) applicationContext.getBean("cat");
        Cat two =
                (Cat) applicationContext.getBean("cat");
        System.out.println(one.getMessage());
        System.out.println(one.equals(two));
    }
}
