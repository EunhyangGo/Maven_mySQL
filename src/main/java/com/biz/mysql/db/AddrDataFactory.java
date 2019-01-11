package com.biz.mysql.db;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.datasource.pooled.PooledDataSource;

/*
 * 팩토리 클래스는 프로젝트 전체에서 사용할 어떤 정보, 도구를 만들어서
 * 배포하는 클래스를 말한다.
 * 
 * Java에서 JDBC를 사용해서 데이터 연결, 작업을 할 수 있는데
 * Factory를 사용해서 DB에 작업 연결 작업을 수행하면
 * 다양한 방법으로 DB에 연결할 수 있다
 */
public class AddrDataFactory implements DataSourceFactory{

	Properties props;
	/*
	 * Factory에서 사용할 원재료와 같은 어떤 값을
	 * 받아와서 사용할 수 있도록 하는 methoed
	 */
	
	public void setProperties(Properties props) {
		// TODO Auto-generated method stub
		this.props = props; 
		// 클래스에서 보통 생성자를 많이 썼는데 여기서는 생성자를 쓰지 않고 set에서 초기화
		
	}

	// 공장과 같은 메서드
	
	/*
	 * DB와 연결하는 Connection을 생성하는 methoed
	 * Connection = DataSOurce
	 */
	 public DataSource getDataSource() {
	 /*
	  * PooledDataSource 클래스는
	  * 미리 DB와 연결 가능한 몇개의 통로를 만들어 두고,
	  * 자바에 여러 method(CRUD)들에서 DB연결을 요청하면
	  * 작업 정도(작업량), 소요시간 등을 자라 관리하여 적절하게
	  * 연결을 분해해주는 DataSource 클래스
	  * 
	  */
		// TODO Auto-generated method stub
		PooledDataSource ds = new PooledDataSource();
		
		/*
		 * DataSource가 DB에 연결하기 위한 profile 설정하는 부분
		 * 		 
		 * */
		
		// ds에 setdriver,url,username,setpassword 저장
		ds.setDriver(props.getProperty("DRIVER"));
		ds.setUrl(props.getProperty("URL"));
		ds.setUsername(props.getProperty("USER"));
		ds.setPassword(props.getProperty("PASSWORD"));
		
		
		return ds;
	}

}
