package uk.co.britishgas.api.core.cache;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import uk.co.britishgas.api.core.cache.config.MemcachedClientConfiguration;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(MemcachedClientConfiguration.class)
public @interface EnableMemcachedClient {

}
