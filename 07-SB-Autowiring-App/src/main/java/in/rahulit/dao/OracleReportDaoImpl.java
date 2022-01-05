package in.rahulit.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracle")
@Primary
public class OracleReportDaoImpl implements ReportDao {

	@Override
	public String getReportData() {
		String msg = "getting report data from ORCL db....";
		return msg;
	}

}
