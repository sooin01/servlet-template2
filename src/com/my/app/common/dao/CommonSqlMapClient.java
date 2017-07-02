package com.my.app.common.dao;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class CommonSqlMapClient {

	private static SqlMapClient sqlmapClient;
	private static SqlMapClient sqlmapClient2;

	public static void init() throws IOException {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Reader reader1 = Resources.getResourceAsReader("SqlMapConfig.xml");
			sqlmapClient = SqlMapClientBuilder.buildSqlMapClient(reader1);

			Class.forName("org.postgresql.Driver");
			Reader reader2 = Resources.getResourceAsReader("SqlMapConfig2.xml");
			sqlmapClient2 = SqlMapClientBuilder.buildSqlMapClient(reader2);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static SqlMapClient getSqlMapClient() {
		return sqlmapClient;
	}
	
	public static SqlMapClient getSqlMapClient2() {
		return sqlmapClient2;
	}

}
