package com.qcl.shiro;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.AuthenticatingFilter;


public class OAuth2Filter extends AuthenticatingFilter {
	
	private static final Logger logger=Logger.getLogger(OAuth2Filter.class);
	
	@Override
	protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) throws Exception {
		logger.info("==========request====" );
		return null;
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		logger.info("================response==============");
		
		String token=getRequestToken((HttpServletRequest)request);
		if(StringUtils.isBlank(token)){
			HttpServletResponse httpResponse=(HttpServletResponse)response;
			httpResponse.getWriter().print("error");
			logger.info("==============error===============");
			return false;
		}
		
		return executeLogin(request,response);
	}
	
	public String getRequestToken(HttpServletRequest request){
		String token=request.getHeader("token");
		if(StringUtils.isBlank(token)){
			token=request.getParameter("token");
		}
		
		return token;
		
	}

}
