package xin.carryzheng;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import xin.carryzheng.bean.Person;

/**
 * SpringBoot单元测试;
 *
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 *
 * @author zhengxin
 * @date 2018-09-21 17:59:51
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloSpringBootApplicationTest {

    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext ioc;

    @Test
    public void TestImportResource(){
        System.out.println(ioc.containsBean("helloService"));
    }

    @Test
    public void testConfigurationProperties(){
        System.out.println(person);
    }
}
