package com.excelsiorsoft.spring.cloud;

import com.netflix.zuul.ZuulFilter;


public class CustomZuulFilter extends ZuulFilter {

	@Override
	public Object run() {
		System.out.println("This request has passed through the custom Zuul filter.");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
