package fsmflying.sys.service;

public interface SequenceService {

	/**
	 * 以"default"为键值的序列，生成下一个序列号，没有此序列则创建
	 * @return 下一个序列号
	 */
	public int getNextIdByDefault();
	
	/**
	 * 以keyName为键值的序列，生成下一个序列号，没有此序列则创建;相邻序列号之间的增量为1;
	 * @param keyName 指定的序列的键值
	 * @return 下一个序列号
	 */
	public int getNextId(String keyName);
	
	/**
	 * 
	 * @param keyName 指定的序列的键值
	 * @param increment 相邻序列号之间的增量
	 * @return 下一个序列号
	 */
	public int getNextId(String keyName,int increment);
	/**
	 * 以keyName为键值的序列，生成一组序列号，没有此序列则创建;相邻序列号之间的增量为increment;
	 * @param generateCount 生成的序列号数量
	 * @param keyName 指定的序列的键值
	 * @param increment 相邻序列号之间的增量
	 * @return 序列号数组
	 */
	public int[] getNextId(int generateCount,String keyName,int increment);
	
	/**
	 * 以keyName为键值的序列，生成一组序列号，没有此序列则创建;相邻序列号之间的增量为1;
	 * @param generateCount 生成的序列号数量
	 * @param keyName 指定的序列的键值
	 * @return 序列号数组
	 */
	public int[] getNextId(int generateCount,String keyName);
	
	/**
	 * 以"default"为键值的序列，生成一组序列号，没有此序列则创建;相邻序列号之间的增量为1;
	 * @param generateCount 生成的序列号数量
	 * @return
	 */
	public int[] getNextId(int generateCount);
	
	/**
	 * 以"default"为键值的序列，生成一组序列号，没有此序列则创建;相邻序列号之间的增量为increment;
	 * @param generateCount 生成的序列号数量
	 * @param increment 相邻序列号之间的增量
	 * @return
	 */
	public int[] getNextId(int generateCount,int increment);
}
