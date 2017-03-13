package fsmflying;

import java.util.ArrayList;
import java.util.List;

//import org.ehcache.Cache;
//import org.ehcache.CacheManager;
//import org.ehcache.config.builders.CacheConfigurationBuilder;
//import org.ehcache.config.builders.CacheManagerBuilder;
//import org.ehcache.config.builders.ResourcePoolsBuilder;

public class CacheHelper {

//	private static CacheManager cacheManager;
//	public static final String CacheManagerBuilderName = "preConfigured";
	 
	private static List<String> keys = new ArrayList<String>();

	public static void ensureInit() {
//		if (cacheManager == null) {
//			cacheManager = CacheManagerBuilder.newCacheManagerBuilder().build();
//			cacheManager.init();
//		}
	}

	public static void put(String key, Object value) {
		ensureInit();
//		if(!keys.contains(key)) keys.add(key);
//		Cache<String, Object> myCache = cacheManager.createCache("<Object>" + key, CacheConfigurationBuilder
//				.newCacheConfigurationBuilder(String.class, Object.class, ResourcePoolsBuilder.heap(10)).build());
//		myCache.put(key, value);
	}

	public static Object get(String key) {
		ensureInit();
		
//		Cache<String, Object> myCache = cacheManager.createCache("<Object>" + key, CacheConfigurationBuilder
//				.newCacheConfigurationBuilder(String.class, Object.class, ResourcePoolsBuilder.heap(10)).build());
//		if(myCache==null) return null;
//		else return myCache.get(key);
		return null;
	}
	
	public static void remove(String key)
	{
		ensureInit();
//		if(keys.contains(key)) keys.remove(key);
//		cacheManager.removeCache("<Object>" + key);
		
	}
	
	public static void clear()
	{
		ensureInit();
//		for(String key:keys)
//		{
//			if(keys.contains(key)) keys.remove(key);
//			cacheManager.removeCache("<Object>" + key);
//		}
			
	}
}
