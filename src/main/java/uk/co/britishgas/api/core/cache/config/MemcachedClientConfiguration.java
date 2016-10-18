package uk.co.britishgas.api.core.cache.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.spy.memcached.AddrUtil;
import net.spy.memcached.MemcachedClient;

@Configuration
public class MemcachedClientConfiguration {

	@Value("${memcached.addresses:192.168.99.100:32770}")
	private String addressList;
	
	@Bean
	public MemcachedClient configureMemcachedClient() throws IOException {
    	return new MemcachedClient(AddrUtil.getAddresses(addressList));
    }
}
