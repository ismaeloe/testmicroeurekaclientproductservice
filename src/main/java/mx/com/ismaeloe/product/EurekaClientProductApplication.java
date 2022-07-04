package mx.com.ismaeloe.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/* Error:
 * 2022-06-27 16:47:41 -ERROR Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is org.springframework.orm.jpa.JpaSystemException: HHH000143: Bytecode enhancement failed because no public, protected or package-private default constructor was found for entity: mx.com.ismaeloe.product.entity.Category. Private constructors don't work with runtime proxies!; nested exception is org.hibernate.HibernateException: HHH000143: Bytecode enhancement failed because no public, protected or package-private default constructor was found for entity: mx.com.ismaeloe.product.entity.Category. Private constructors don't work with runtime proxies!] with root cause
java.lang.NoSuchMethodException: mx.com.ismaeloe.product.entity.Category$HibernateProxy$xGoIWoq6.<init>()
	at java.base/java.lang.Class.getConstructor0(Class.java:3508) ~[na:na]
   Cause: Loobok not working
   Solution: Create default Constructor to Product and Category
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientProductApplication.class, args);
	}

}
