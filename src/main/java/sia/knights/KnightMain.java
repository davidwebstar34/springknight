package sia.knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sia.knights.config.KnightConfig;

public class KnightMain {

  public static void main(String[] args) throws Exception {
//    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
    Knight knight = context.getBean(Knight.class);
    knight.embarkOnQuest();

  }

}
