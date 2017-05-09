package com.my.app.tbl.service;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.my.app.common.dao.CommonSqlMapClient;
import com.my.app.tbl.vo.TblVo;

public class TblService {

	private static final TblService TBL_SERVICE = new TblService();

	private TblService() {

	}

	public static TblService getInstance() {
		return TBL_SERVICE;
	}

	public void updateTbl() throws SQLException {
		SqlMapClient sqlMapClient = CommonSqlMapClient.getSqlMapClient();

		try {
			sqlMapClient.startTransaction();

			TblVo tblVo = new TblVo();
			tblVo.setCode("000010");
			tblVo.setName("예제2");
			tblVo.setPrice(22000);
			tblVo.setRecv_dt("20170506");
			sqlMapClient.update("updateTbl", tblVo);

			tblVo.setCode("000020");
			tblVo.setName("예제3");
			tblVo.setPrice(25000);
			tblVo.setRecv_dt("20170507");
			sqlMapClient.update("updateTbl", tblVo);

			sqlMapClient.commitTransaction();
		} finally {
			sqlMapClient.endTransaction();
		}
	}

}
