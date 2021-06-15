package configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import dao.mdao;
import dao.mdaoimp;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages ="controller")
public class Expconfig  {
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}@Bean
	public DataSource getdatasource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver"); 
		dataSource.setUrl("jdbc:mysql://localhost:3306/friend");
		dataSource.setUsername("root");
		dataSource.setPassword("ramakrishna");
		return dataSource;
		}
	@Bean
	public mdao getdao(){
		//mdao m=new mdaoimp(getdatasource());
		//return m;
		return new mdaoimp(getdatasource());
	}
}
