package com.my.app.common.bean;

import java.util.List;

/*
{
	"datas" : [
		{
			"id" : "1",
			"name" : "name1"
		},
		{
			"id" : "2",
			"name" : "name2"
		}
	]
}
*/
public class JsonBean {

	private List<DataBean> datas;

	public List<DataBean> getDatas() {
		return datas;
	}

	public void setDatas(List<DataBean> datas) {
		this.datas = datas;
	}

}
