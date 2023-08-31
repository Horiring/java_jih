package kr.kh.study.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import kr.kh.study.vo.MemberVO;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public void postHandle(HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
		MemberVO user = (MemberVO)modelAndView.getModel().get("user");
		
		if(user != null ) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
		}
	}
}
