package javax.inject;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.FIELD})
public @interface Inject {}


/* Location:              E:\apk\xiaoenai2\classes-dex2jar.jar!\javax\inject\Inject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */