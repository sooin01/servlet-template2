package com.my.app.tbl.controller;

import java.sql.SQLException;

import com.my.app.tbl.service.TblService;

public class TblController {

	private static final TblController TBL_CONTROLLER = new TblController();

	private TblController() {

	}

	public static TblController getInstance() {
		return TBL_CONTROLLER;
	}

	public void updateTbl() throws SQLException {
		TblService.getInstance().updateTbl();
	}

}
