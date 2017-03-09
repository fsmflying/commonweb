package fsmflying.demo.dao.impl;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public abstract class JdbcTemplateDaoBase {
	
	protected JdbcTemplate jdbcTemplate;
	
	@Resource
	public void setDataSource(DataSource dataSource)
	{
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
}
