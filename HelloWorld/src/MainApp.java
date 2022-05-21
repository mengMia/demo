import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        ApplicationContext context = new FileSystemXmlApplicationContext
                ("E:\\Learning\\ComputerScience\\Java\\SpringDemo\\HelloWorld\\src\\Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
    }
}
