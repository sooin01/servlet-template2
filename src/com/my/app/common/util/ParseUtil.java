package com.my.app.common.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.my.app.common.bean.DataBean;

public class ParseUtil {

	/**
	 * Properties에 있는 변수를 하나씩 순서데로 끄집어 내어 map에 담는다.
	 * @param t
	 * @param props
	 * @return
	 */
	public static String parsePropertiesToString(String[] keys, Properties... props) {
		StringBuffer sb = new StringBuffer();

		for (Properties p : props) {
			for (String key : keys) {
				sb.append(key);
				sb.append(p.get(key));
			}
		}

		return sb.toString();
	}

	public static <T> String parseTypeToString(T t) throws Exception {
		StringBuffer sb = new StringBuffer();

		for (Field field : t.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			sb.append(field.getName());
			sb.append(field.get(t));
		}

		return sb.toString();
	}

	/**
	 * list에 있는 변수를 하나씩 순서데로 끄집어 내어 map에 담는다.
	 * @param <E>
	 * @param list
	 * @param ttl
	 * @return
	 * @throws Exception
	 */
	public static <E> String parseCollectionToString(List<E> list) throws Exception {
		StringBuffer sb = new StringBuffer();

		for (E e : list) {
			sb.append(parseTypeToString(e));
		}

		return sb.toString();
	}

	public static void main(String[] args) throws Exception {
		DataBean vo = new DataBean();
		vo.setId("AAA");
		vo.setName("ABB");

		String s1 = parseTypeToString(vo);
		System.out.println(s1);

		List<DataBean> list = new ArrayList<DataBean>();
		list.add(vo);
		String s2 = parseCollectionToString(list);
		System.out.println(s2);

		String[] keys = {
			"id", "name", "age", "address1", "address2", "address3"
		};
		Properties properties = new Properties();
		properties.setProperty("id", "AAA");
		properties.setProperty("name", "BBB");
		properties.setProperty("age", "CCC");
		properties.setProperty("address1", "DDD1");
		properties.setProperty("address2", "DDD2");
		properties.setProperty("address3", "DDD3");
		String s3 = parsePropertiesToString(keys, properties);
		System.out.println(s3);
	}
}
