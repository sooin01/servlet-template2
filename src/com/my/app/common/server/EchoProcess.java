package com.my.app.common.server;

import com.google.gson.Gson;
import com.my.app.common.bean.JsonBean;

public class EchoProcess {

	private static EchoProcess echoProcess = new EchoProcess();

	public static EchoProcess getInstance() {
		return echoProcess;
	}

	public void process(String received) {
		JsonBean jsonBean = new Gson().fromJson(received, JsonBean.class);
		// DB 처리 or 로직 처리
	}

}
