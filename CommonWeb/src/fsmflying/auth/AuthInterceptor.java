package fsmflying.auth;

import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter {
	
	public static final String SESSION_USERID = "kUSERID";  
	public static final String SESSION_AUTHS = "kAUTHS";
    
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		boolean flag = true;  
        if (handler instanceof HandlerMethod) {  
            Auth auth = ((HandlerMethod) handler).getMethod().getAnnotation(Auth.class);  
            if (auth != null) {// ��Ȩ�޿��Ƶľ�Ҫ���  
                if (request.getSession().getAttribute(SESSION_USERID) == null) {// û��¼��Ҫ���¼  
                    response.setStatus(HttpStatus.FORBIDDEN.value());  
                    response.setContentType("text/html; charset=UTF-8");  
                    PrintWriter out=response.getWriter();  
                    out.write("{\"type\":\"nosignin\",\"msg\":\"�����ȵ�¼!\"}");  
                    out.flush();  
                    out.close();  
                    flag = false;  
                } else {// ��¼�˼��,������ֻ��@Auth,��ʾֻҪ���¼����ͨ��.@Auth("authority")������,��֤�û�Ȩ��  
                    if (!"".equals(auth.value())) {  
                        @SuppressWarnings("unchecked")
						Set<String> auths = (Set<String>) request.getSession().getAttribute(SESSION_AUTHS);  
                        if (!auths.contains(auth.value())) {// ��ʾ�û�ûȨ��  
                            response.setStatus(HttpStatus.FORBIDDEN.value());  
                            response.setContentType("text/html; charset=UTF-8");  
                            PrintWriter out=response.getWriter();  
                            out.write("{\"type\":\"noauth\",\"msg\":\"��û��"+auth.name()+"Ȩ��!\"}");  
                            out.flush();  
                            out.close();  
                            flag = false;  
                        }  
                    }  
                }  
            }  
        }  
        return flag;  
		//return super.preHandle(request, response, handler);
	}
}
