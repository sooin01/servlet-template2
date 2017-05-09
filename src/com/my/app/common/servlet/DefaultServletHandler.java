package com.my.app.common.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.my.app.tbl.controller.TblController;

public class DefaultServletHandler extends HttpServlet {

	private static final long serialVersionUID = -6182112699439840614L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;

		try {
			if (request.getRequestURI().equals("/tbl/update-tbl")) {
				TblController.getInstance().updateTbl();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("ErrorCode", "000000");
		jsonObject.addProperty("ErrorMessage", "Success.");
		response.getWriter().println(new Gson().toJson(jsonObject));
		response.getWriter().flush();
	}

}
