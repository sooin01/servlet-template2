package com.my.app.common.dao;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class CommonSqlMapClient {

	private static SqlMapClient sqlmapClient;

	public static void init() throws IOException {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		sqlmapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
	}

	public static SqlMapClient getSqlMapClient() {
		return sqlmapClient;
	}

}