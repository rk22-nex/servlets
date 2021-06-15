package dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import model.Model;

public class mdaoimp implements mdao {
	private JdbcTemplate jd;
	public mdaoimp(DataSource datasource) {
		this.jd = new JdbcTemplate(datasource);
	}

	@Override
	public int save(Model m) {
		// TODO Auto-generated method stub
		return jd.update("INSERT INTO friend(Rollno,Name,Residency)VALUES(?,?,?)",m.getRollno(),m.getName(),m.getResidency());
	}
	

}
