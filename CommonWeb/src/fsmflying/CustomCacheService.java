package fsmflying;

import com.fsmflying.spring.service.impl.CacheServiceImpl;

public class CustomCacheService extends CacheServiceImpl {
	@Override
	public void put(String key, Object data) {
		// TODO Auto-generated method stub
		//super.put(key, data);
		
//		CacheHelper.put(key, data);
	}
	
	@Override
	public Object get(String key) {
		// TODO Auto-generated method stub
//		return super.get(key);
//		return CacheHelper.get(key);
		return null;
	}
	
	public void remove(String key) {
		
//		CacheHelper.remove(key);
	}
	
	@Override
	public void clear() {
//		CacheHelper.clear();
	}
}
