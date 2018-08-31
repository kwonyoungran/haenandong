/*package kr.co.haenandong.test.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MySQLConnectionTest {
	
	private static final Logger logger = LoggerFactory.getLogger(MySQLConnectionTest.class);
	
	@Autowired
	BasicDataSource dataSource;
	
	@RequestMapping(value = "/mysqlConnectionTest.do")
	public String dbtest(Model model) {
		Connection conn = null;
		Statement st = null;
		
		try { 
			conn = dataSource.getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select now() as now;");
            
            while(rs.next()) {
                model.addAttribute("serverTime", rs.getString("now"));
            }
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { 
				if(st != null) st.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		logger.info("DBTest");
		
		return "home";
	}
}
*/