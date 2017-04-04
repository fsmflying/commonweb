package com.fsmflying.mcommonweb04.custom;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.fsmflying.sys.dm.SysArea;
import com.fsmflying.sys.dm.SysCompany;
import com.fsmflying.sys.dm.SysConfig;
import com.fsmflying.sys.dm.SysCustomPage;
import com.fsmflying.sys.dm.SysDataAuth;
import com.fsmflying.sys.dm.SysDataAuthItem;
import com.fsmflying.sys.dm.SysDepartment;
import com.fsmflying.sys.dm.SysDictDir;
import com.fsmflying.sys.dm.SysDictItem;
import com.fsmflying.sys.dm.SysEmployee;
import com.fsmflying.sys.dm.SysFile;
import com.fsmflying.sys.dm.SysFuncPoint;
import com.fsmflying.sys.dm.SysIOTemplate;
import com.fsmflying.sys.dm.SysIOTemplateColumn;
import com.fsmflying.sys.dm.SysIOTemplateField;
import com.fsmflying.sys.dm.SysLog;
import com.fsmflying.sys.dm.SysMenu;
import com.fsmflying.sys.dm.SysRole;
import com.fsmflying.sys.dm.SysSequence;
import com.fsmflying.sys.dm.SysTab;
import com.fsmflying.sys.dm.SysUser;
import com.fsmflying.sys.dm.helper.UserRightSet;
import com.fsmflying.sys.service.ISystemManageService;
import com.fsmflying.util.TwoTuple;

public class SystemManageServiceImpl implements ISystemManageService {

	@Resource(name="sysadminSessionFactory")
	SessionFactory sessionFactory;
	
	@Override
	public boolean add(SysUser model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(SysUser model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteModelOfSysUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SysUser getModelOfSysUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysUser getModelOfSysUser(String username, boolean refreshCache) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		SysUser model = (SysUser)session.createQuery("from SysUser e where e.username=:username").setParameter("username", username).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysUser> getListOfSysUser() {
//		Session session = sessionFactory.openSession();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		
		
		List<SysUser> list = (List<SysUser>)session.createQuery("from SysUser e").list();
		//session.createQuery("").
		session.getTransaction().commit();
		
		//session.close();
		return list;
	}

	@Override
	public boolean add(SysRole model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(SysRole model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteModelOfSysRole(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SysRole getModelOfSysRole(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysRole> getListOfSysRole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(SysCompany model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(SysCompany model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteModelOfSysCompany(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SysCompany getModelOfSysCompany(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysCompany> getListOfSysCompany() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(SysDepartment model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(SysDepartment model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteModelOfSysDepartment(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SysDepartment getModelOfSysDepartment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysDepartment> getListOfSysDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(SysEmployee model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(SysEmployee model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteModelOfSysEmployee(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SysEmployee getModelOfSysEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysEmployee> getListOfSysEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(SysTab model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(SysTab model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteModelOfSysTab(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SysTab getModelOfSysTab(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysTab> getListOfSysTab() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(SysMenu model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(SysMenu model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteModelOfSysMenu(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SysMenu getModelOfSysMenu(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysMenu> getListOfSysMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(SysFuncPoint model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(SysFuncPoint model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteModelOfSysFuncPoint(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SysFuncPoint getModelOfSysFuncPoint(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysFuncPoint> getListOfSysFuncPoint() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(SysConfig model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(SysConfig model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteModelOfSysConfig(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SysConfig getModelOfSysConfig(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysConfig> getListOfSysConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(SysCustomPage model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(SysCustomPage model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteModelOfSysCustomPage(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SysCustomPage getModelOfSysCustomPage(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysCustomPage> getListOfSysCustomPage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(SysDataAuth model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(SysDataAuth model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteModelOfSysDataAuth(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SysDataAuth getModelOfSysDataAuth(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysDataAuth> getListOfSysDataAuth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(SysDataAuthItem model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(SysDataAuthItem model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteModelOfSysDataAuthItem(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SysDataAuthItem getModelOfSysDataAuthItem(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysDataAuthItem> getListOfSysDataAuthItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(SysDictDir model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(SysDictDir model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteModelOfSysDictDir(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SysDictDir getModelOfSysDictDir(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysDictDir> getListOfSysDictDir() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(SysDictItem model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(SysDictItem model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteModelOfSysDictItem(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SysDictItem getModelOfSysDictItem(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysDictItem> getListOfSysDictItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysDictItem> getListOfSysDictItem(String dirKeyCode) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public boolean add(SysFile model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(SysFile model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteModelOfSysFile(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SysFile getModelOfSysFile(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysFile> getListOfSysFile() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<SysRole> getUserRoles(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysTab> getUserTabs(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysMenu> getUserMenus(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysFuncPoint> getUserFuncPoints(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysDataAuth> getUserDataAuths(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysDataAuthItem> getUserDataAuthItems(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRightSet getUserRightSet(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysMenu> getTabMenus(int tabId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TwoTuple<Integer, Integer>> getTabMenuTuples() {
		// TODO Auto-generated method stub
		return null;
	}

}
