package j2ee_study_Spring.jdk;
/**
 * 切面类
 * @author striner
 *
 */

public class MyAspect {
	public void before() {
		System.out.println("方法前执行");
	}

	public void after() {
		System.out.println("方法后执行");
	}
}
