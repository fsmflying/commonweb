package fsmflying.sys.dao;

import javax.sql.DataSource;

public interface LongSequenceDao {
	public void setDataSource(DataSource ds);
	/**
	 * ��"default"Ϊ��ֵ�����У�������һ�����кţ�û�д������򴴽�
	 * @return ��һ�����к�
	 */
	public long getNextIdByDefault();
	
	/**
	 * ��keyNameΪ��ֵ�����У�������һ�����кţ�û�д������򴴽�;�������к�֮�������Ϊ1;
	 * @param keyName ָ�������еļ�ֵ
	 * @return ��һ�����к�
	 */
	public long getNextId(String keyName);
	
	/**
	 * 
	 * @param keyName ָ�������еļ�ֵ
	 * @param increment �������к�֮�������
	 * @return ��һ�����к�
	 */
	public long getNextId(String keyName,long increment);
	/**
	 * ��keyNameΪ��ֵ�����У�����һ�����кţ�û�д������򴴽�;�������к�֮�������Ϊincrement;
	 * @param generateCount ���ɵ����к�����
	 * @param keyName ָ�������еļ�ֵ
	 * @param increment �������к�֮�������
	 * @return ���к�����
	 */
	public long[] getNextId(long generateCount,String keyName,long increment);
	
	/**
	 * ��keyNameΪ��ֵ�����У�����һ�����кţ�û�д������򴴽�;�������к�֮�������Ϊ1;
	 * @param generateCount ���ɵ����к�����
	 * @param keyName ָ�������еļ�ֵ
	 * @return ���к�����
	 */
	public long[] getNextId(long generateCount,String keyName);
	
	/**
	 * ��"default"Ϊ��ֵ�����У�����һ�����кţ�û�д������򴴽�;�������к�֮�������Ϊ1;
	 * @param generateCount ���ɵ����к�����
	 * @return
	 */
	public long[] getNextId(long generateCount);
	
	/**
	 * ��"default"Ϊ��ֵ�����У�����һ�����кţ�û�д������򴴽�;�������к�֮�������Ϊincrement;
	 * @param generateCount ���ɵ����к�����
	 * @param increment �������к�֮�������
	 * @return
	 */
	public long[] getNextId(long generateCount,long increment);
	
}
