import org.junit.Test;
import org.springframework.beans.MyTestBeanCreate;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * @author 
 * @descrtption
 * @time 2021/12/25 18:14
 */
public class MyhelloTest {

    @Test
    public void testMyHello(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mytest.xml");
        MyTestBeanCreate doimyakon =null;
        Assert.hasText("doim yakon","doimyakon must not be null");
		doimyakon = applicationContext.getBean(MyTestBeanCreate.class);
		Assert.notNull(doimyakon,"doimyakon must not be null");

        Assert.notNull(doimyakon.getUserName(),"UserName must not be null");
        System.out.println(doimyakon);
    }
}