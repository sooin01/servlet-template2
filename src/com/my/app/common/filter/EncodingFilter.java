package com.my.app.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// Nothing.
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		req.setCharacterEncoding("MS949");
		res.setCharacterEncoding("MS949");

		chain.doFilter(req, res);
	}

	@Override
	public void destroy() {
		// Nothing.
	}

}
