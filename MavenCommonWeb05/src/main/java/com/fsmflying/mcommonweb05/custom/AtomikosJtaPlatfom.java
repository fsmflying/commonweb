package com.fsmflying.mcommonweb05.custom;

import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

import org.hibernate.engine.transaction.jta.platform.internal.AbstractJtaPlatform;

/**
 * @author doggy
 *         Created on 16-5-15.
 */
public class AtomikosJtaPlatfom extends AbstractJtaPlatform {

	private static final long serialVersionUID = 1L;
	
	private static UserTransaction ut;
    private static TransactionManager tm;
    @Override
    protected TransactionManager locateTransactionManager() {
        return tm;
    }

    @Override
    protected UserTransaction locateUserTransaction() {
        return ut;
    }

    public UserTransaction getUt() {
        return ut;
    }

    public void setUt(UserTransaction ut) {
        AtomikosJtaPlatfom.ut = ut;
    }

    public TransactionManager getTm() {
        return tm;
    }

    public void setTm(TransactionManager tm) {
        AtomikosJtaPlatfom.tm = tm;
    }
}
