package test.ywu;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wuya
 * @description
 * @Date 2019/6/20
 */
public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.ywu.demo.spring");
	}

    @Test
    public void testPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ywu.demo.spring");
    }

}
