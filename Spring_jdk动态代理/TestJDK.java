package j2ee_study_Spring.jdk;

import org.junit.Test;

/**
 * 测试类
 * @author striner
 *
 */
public class TestJDK {
	@Test
	public void test() {
		UserService userService = MyBeanFactory.creatservice();
		userService.adduser();
		userService.deleteuser();;
		userService.updateuser();;
	}
}
