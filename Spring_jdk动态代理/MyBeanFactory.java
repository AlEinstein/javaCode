package j2ee_study_Spring.jdk;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;
/**
 * 工厂类
 * @author striner
 *
 */
public class MyBeanFactory {

	public static UserService creatservice() {
		//目标类
		final UserService userService = new UseServiceImpl();
		//切面类
		final MyAspect myAspect = new MyAspect();
		/**代理类   将目标类和切面类结合  --->  切面
		 * 参数1: loader 类加载器
		 * 			一般情况: 当前类.class.getClassLoader()
		 * 					  目标类实例.getClass().get...
		 * 参数2: interfaces 代理类实现的所有接口
		 * 		方式1: 目标类.getClass().getInterfaces() 注意:只能获得自己的接口,不能获得父类接口
		 * 		方式2: new Class[] {UserService.class}
		 * 参数3: InvocationHandler 处理类,接口,必须进行实现类,一般采用匿名内部类
		 * 	提供invoke()方法
		 * 
		 */
		UserService proxService = (UserService) Proxy.newProxyInstance(
				MyBeanFactory.class.getClassLoader(), 
				userService.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

						//前执行
						myAspect.before();
						
						//执行目标类
						Object obj = method.invoke(userService, args);
						
						//后执行
						myAspect.after();
						
						return obj;
					}
				});
			
		
		return proxService;
	}
}
