package hello_spring;
 
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringCoreApp {
  public static void main(String[]args) {
	  BeanFactory factory=new 
			  FileSystemXmlApplicationContext("C:\\Spring workspace\\Spring\\hello_Spring\\new.xml");
  naresh n=(naresh)factory.getBean("nre");
  System.out.println(n);
  naresh n2=(naresh)factory.getBean("nre2");
  System.out.println(n2);
  }
}
