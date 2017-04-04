package com.fsmflying.mcommonweb04.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.fsmflying.sys.dao.SystemManageDao;
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
import com.fsmflying.util.TwoTuple;

public class SystemManageDaoImpl implements SystemManageDao {

	@Resource(name = "sysadminSessionFactory")
	SessionFactory sessionFactory;

	@Override
	public void setDataSource(DataSource dataSource) {
		Session session = getCurrentSession();
		session.getTransaction().commit();

	}

	public Session getCurrentSession() {
		Session session = this.sessionFactory.getCurrentSession();
		session.beginTransaction();
		return session;
	}

	@Override
	public boolean add(SysUser model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return true;
	}

	@Override
	public boolean save(SysUser model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return true;
	}

	@Override
	public boolean deleteModelOfSysUser(int id) {
		Session session = getCurrentSession();
		session.delete(new SysUser(id));
		session.getTransaction().commit();
		return true;
	}

	@Override
	public SysUser getModelOfSysUser(int id) {
		Session session = getCurrentSession();
		Query query = session.createQuery("from SysUser e where e.userId=:userId");
		query.setParameter("userId", id);
		SysUser model = (SysUser) query.uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public SysUser getModelOfSysUser(String username) {
		Session session = getCurrentSession();
		Query query = session.createQuery("from SysUser e where e.username=:username");
		query.setParameter("username", username);
		SysUser model = (SysUser) query.uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysUser> getListOfSysUser() {
		Session session = getCurrentSession();
		Query query = session.createQuery("from SysUser e");
		List<SysUser> list = (List<SysUser>) query.list();
		session.getTransaction().commit();
		return list;
	}

	@Override
	public boolean add(SysRole model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysRole model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysRole(int id) {
		Session session = getCurrentSession();
		session.delete(new SysRole(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysRole getModelOfSysRole(int id) {
		Session session = getCurrentSession();
		SysRole model = (SysRole) session.createQuery("from SysRole r where r.roleId=:roleId")
				.setParameter("roleId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysRole> getListOfSysRole() {
		Session session = getCurrentSession();
		List<SysRole> list = (List<SysRole>)session.createQuery("from SysRole r").list();
		session.getTransaction().commit();
		return list;
	}

	@Override
	public boolean add(SysCompany model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysCompany model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysCompany(int id) {
		Session session = getCurrentSession();
		session.delete(new SysCompany(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysCompany getModelOfSysCompany(int id) {
		Session session = getCurrentSession();
		SysCompany model = (SysCompany)session.createQuery("from SysCompany e where e.companyId=:companyId").setParameter("companyId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysCompany> getListOfSysCompany() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysDepartment model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysDepartment model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysDepartment(int id) {
		Session session = getCurrentSession();
		session.delete(new SysDepartment(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysDepartment getModelOfSysDepartment(int id) {
		Session session = getCurrentSession();
		SysDepartment model = (SysDepartment)session.createQuery("from SysDepartment e where e.deptId=:deptId").setParameter("deptId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysDepartment> getListOfSysDepartment() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysEmployee model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysEmployee model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysEmployee(int id) {
		Session session = getCurrentSession();
		session.delete(new SysEmployee(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysEmployee getModelOfSysEmployee(int id) {
		Session session = getCurrentSession();
		SysEmployee model = (SysEmployee)session.createQuery("from SysEmployee e where e.emplId=:emplId").setParameter("emplId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysEmployee> getListOfSysEmployee() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysTab model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysTab model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysTab(int id) {
		Session session = getCurrentSession();
		session.delete(new SysTab(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysTab getModelOfSysTab(int id) {
		Session session = getCurrentSession();
		SysTab model = (SysTab)session.createQuery("from SysTab e where e.tabId=:tabId").setParameter("tabId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysTab> getListOfSysTab() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysMenu model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysMenu model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysMenu(int id) {
		Session session = getCurrentSession();
		session.delete(new SysMenu(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysMenu getModelOfSysMenu(int id) {
		Session session = getCurrentSession();
		SysMenu model = (SysMenu)session.createQuery("from SysMenu e where e.menuId=:menuId").setParameter("menuId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysMenu> getListOfSysMenu() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysFuncPoint model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysFuncPoint model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysFuncPoint(int id) {
		Session session = getCurrentSession();
		session.delete(new SysFuncPoint(id));
		session.getTransaction().commit();
		return true;
	}

	@Override
	public SysFuncPoint getModelOfSysFuncPoint(int id) {
		Session session = getCurrentSession();
		SysFuncPoint model = (SysFuncPoint)session.createQuery("from SysFuncPoint e where e.funcPointId=:funcPointId").setParameter("funcPointId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysFuncPoint> getListOfSysFuncPoint() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysConfig model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysConfig model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysConfig(int id) {
		Session session = getCurrentSession();
		session.delete(new SysConfig(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysConfig getModelOfSysConfig(int id) {
		Session session = getCurrentSession();
		SysConfig model = (SysConfig)session.createQuery("from SysConfig e where e.configId=:configId").setParameter("configId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysConfig> getListOfSysConfig() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysCustomPage model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysCustomPage model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysCustomPage(int id) {
		Session session = getCurrentSession();
		session.delete(new SysCustomPage(id));
		session.getTransaction().commit();
		return true;
	}

	@Override
	public SysCustomPage getModelOfSysCustomPage(int id) {
		Session session = getCurrentSession();
		SysCustomPage model = (SysCustomPage)session.createQuery("from SysCustomPage e where e.customPageId=:customPageId").setParameter("customPageId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysCustomPage> getListOfSysCustomPage() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysDataAuth model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysDataAuth model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysDataAuth(int id) {
		Session session = getCurrentSession();
		session.delete(new SysDataAuth(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysDataAuth getModelOfSysDataAuth(int id) {
		Session session = getCurrentSession();
		SysDataAuth model = (SysDataAuth)session.createQuery("from SysDataAuth e where e.dataAuthId=:dataAuthId").setParameter("dataAuthId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysDataAuth> getListOfSysDataAuth() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysDataAuthItem model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysDataAuthItem model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysDataAuthItem(int id) {
		Session session = getCurrentSession();
		session.delete(new SysDataAuthItem(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysDataAuthItem getModelOfSysDataAuthItem(int id) {
		Session session = getCurrentSession();
		SysDataAuthItem model = (SysDataAuthItem)session.createQuery("from SysDataAuthItem e where e.dataAuthItemId=:dataAuthItemId").setParameter("dataAuthItemId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysDataAuthItem> getListOfSysDataAuthItem() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysDictDir model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysDictDir model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysDictDir(int id) {
		Session session = getCurrentSession();
		session.delete(new SysDictDir(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysDictDir getModelOfSysDictDir(int id) {
		Session session = getCurrentSession();
		SysDictDir model = (SysDictDir)session.createQuery("from SysDictDir e where e.dirId=:dirId").setParameter("dirId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysDictDir> getListOfSysDictDir() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysDictItem model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysDictItem model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysDictItem(int id) {
		Session session = getCurrentSession();
		session.delete(new SysDictItem(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysDictItem getModelOfSysDictItem(int id) {
		Session session = getCurrentSession();
		SysDictItem model = (SysDictItem)session.createQuery("from SysDictItem e where e.itemId=:itemId").setParameter("itemId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysDictItem> getListOfSysDictItem() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public List<SysDictItem> getListOfSysDictItem(String dirKeyCode) {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysSequence model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysSequence model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysSequence(String id) {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysSequence getModelOfSysSequence(String id) {
		Session session = getCurrentSession();
		SysSequence model = (SysSequence)session.createQuery("from SysSequence e where e.keyName=:keyName").setParameter("keyName", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysSequence> getListOfSysSequence() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysFile model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysFile model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysFile(int id) {
		Session session = getCurrentSession();
		session.delete(new SysFile(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysFile getModelOfSysFile(int id) {
		Session session = getCurrentSession();
		SysFile model = (SysFile)session.createQuery("from SysFile e where e.fileId=:fileId").setParameter("fileId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysFile> getListOfSysFile() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysIOTemplate model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysIOTemplate model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysIOTemplate(int id) {
		Session session = getCurrentSession();
		session.delete(new SysIOTemplate(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysIOTemplate getModelOfSysIOTemplate(int id) {
		Session session = getCurrentSession();
		SysIOTemplate model = (SysIOTemplate)session.createQuery("from SysIOTemplate e where e.templateId=:templateId").setParameter("templateId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysIOTemplate> getListOfSysIOTemplate() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysIOTemplateColumn model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysIOTemplateColumn model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysIOTemplateColumn(int id) {
		Session session = getCurrentSession();
		session.delete(new SysIOTemplateColumn(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysIOTemplateColumn getModelOfSysIOTemplateColumn(int id) {
		Session session = getCurrentSession();
		SysIOTemplateColumn model = (SysIOTemplateColumn)session.createQuery("from SysIOTemplateColumn e where e.columnId=:columnId").setParameter("columnId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysIOTemplateColumn> getListOfSysIOTemplateColumn() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysIOTemplateField model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysIOTemplateField model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysIOTemplateField(int id) {
		Session session = getCurrentSession();
		session.delete(new SysIOTemplateField(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysIOTemplateField getModelOfSysIOTemplateField(int id) {
		Session session = getCurrentSession();
		SysIOTemplateField model = (SysIOTemplateField)session.createQuery("from SysIOTemplateField e where e.fieldId=:fieldId").setParameter("fieldId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysIOTemplateField> getListOfSysIOTemplateField() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysLog model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysLog model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysLog(int id) {
		Session session = getCurrentSession();
		session.delete(new SysLog(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysLog getModelOfSysLog(int id) {
		Session session = getCurrentSession();
		SysLog model = (SysLog)session.createQuery("from SysLog e where e.logId=:logId").setParameter("logId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysLog> getListOfSysLog() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public boolean add(SysArea model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean save(SysArea model) {
		Session session = getCurrentSession();
		session.save(model);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteModelOfSysArea(int id) {
		Session session = getCurrentSession();
		session.delete(new SysArea(id));
		session.getTransaction().commit();
		return false;
	}

	@Override
	public SysArea getModelOfSysArea(int id) {
		Session session = getCurrentSession();
		SysArea model = (SysArea)session.createQuery("from SysArea e where e.areaId=:areaId").setParameter("areaId", id).uniqueResult();
		session.getTransaction().commit();
		return model;
	}

	@Override
	public List<SysArea> getListOfSysArea() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public List<SysRole> getUserRoles(int userId) {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public List<SysTab> getUserTabs(int userId) {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public List<SysMenu> getUserMenus(int userId) {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public List<SysFuncPoint> getUserFuncPoints(int userId) {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public List<SysDataAuth> getUserDataAuths(int userId) {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public List<SysDataAuthItem> getUserDataAuthItems(int userId) {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public UserRightSet getUserRightSet(int userId) {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

	@Override
	public List<SysMenu> getTabMenus(int tabId) {
		Session session = getCurrentSession();
		SysTab model = (SysTab)session.createQuery("from SysTab e where e.tabId=:tabId").setParameter("tabId", tabId).uniqueResult();
		List<SysMenu> list = new ArrayList<SysMenu>();
		for(SysMenu e:model.getMenus())
			list.add(e);
		session.getTransaction().commit();
		return list;
	}

	@Override
	public List<TwoTuple<Integer, Integer>> getTabMenuTuples() {
		Session session = getCurrentSession();
		session.getTransaction().commit();
		return null;
	}

}
