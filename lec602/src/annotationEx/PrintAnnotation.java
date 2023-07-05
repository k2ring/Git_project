package annotationEx;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션
@Target({ElementType.METHOD /*, ElementType.FIELD*/ })
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
// 엘리먼트
	
	String value() default "-";
	int number() default 15;
	
}
