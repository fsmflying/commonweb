package fsmflying.sys.service;

public interface SequenceService {

	/**
	 * ��"default"Ϊ��ֵ�����У�������һ�����кţ�û�д������򴴽�
	 * @return ��һ�����к�
	 */
	public int getNextIdByDefault();
	
	/**
	 * ��keyNameΪ��ֵ�����У�������һ�����кţ�û�д������򴴽�;�������к�֮�������Ϊ1;
	 * @param keyName ָ�������еļ�ֵ
	 * @return ��һ�����к�
	 */
	public int getNextId(String keyName);
	
	/**
	 * 
	 * @param keyName ָ�������еļ�ֵ
	 * @param increment �������к�֮�������
	 * @return ��һ�����к�
	 */
	public int getNextId(String keyName,int increment);
	/**
	 * ��keyNameΪ��ֵ�����У�����һ�����кţ�û�д������򴴽�;�������к�֮�������Ϊincrement;
	 * @param generateCount ���ɵ����к�����
	 * @param keyName ָ�������еļ�ֵ
	 * @param increment �������к�֮�������
	 * @return ���к�����
	 */
	public int[] getNextId(int generateCount,String keyName,int increment);
	
	/**
	 * ��keyNameΪ��ֵ�����У�����һ�����кţ�û�д������򴴽�;�������к�֮�������Ϊ1;
	 * @param generateCount ���ɵ����к�����
	 * @param keyName ָ�������еļ�ֵ
	 * @return ���к�����
	 */
	public int[] getNextId(int generateCount,String keyName);
	
	/**
	 * ��"default"Ϊ��ֵ�����У�����һ�����кţ�û�д������򴴽�;�������к�֮�������Ϊ1;
	 * @param generateCount ���ɵ����к�����
	 * @return
	 */
	public int[] getNextId(int generateCount);
	
	/**
	 * ��"default"Ϊ��ֵ�����У�����һ�����кţ�û�д������򴴽�;�������к�֮�������Ϊincrement;
	 * @param generateCount ���ɵ����к�����
	 * @param increment �������к�֮�������
	 * @return
	 */
	public int[] getNextId(int generateCount,int increment);
}
