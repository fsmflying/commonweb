package fsmflying.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import fsmflying.sys.dao.SequenceDao;
import fsmflying.sys.service.SequenceService;

public class SequenceServiceImpl implements SequenceService{

	@Autowired
	SequenceDao sequenceDao;
	
	@Override
	public int getNextIdByDefault() {
		return sequenceDao.getNextIdByDefault();
	}

	@Override
	public int getNextId(String keyName) {
		return sequenceDao.getNextId(keyName);
	}

	@Override
	public int getNextId(String keyName, int increment) {
		return sequenceDao.getNextId(keyName, increment);
	}

	@Override
	public int[] getNextId(int generateCount, String keyName, int increment) {
		return sequenceDao.getNextId(generateCount, keyName, increment);
	}

	@Override
	public int[] getNextId(int generateCount, String keyName) {
		return sequenceDao.getNextId(generateCount, keyName);
	}

	@Override
	public int[] getNextId(int generateCount) {
		return sequenceDao.getNextId(generateCount);
	}

	@Override
	public int[] getNextId(int generateCount, int increment) {
		return sequenceDao.getNextId(generateCount,increment);
	}

}
