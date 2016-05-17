package org.interceptor;

/**
 * Created by wcy on 2016/5/14.
 */
import com.opensymphony.xwork2.Action;
import org.dao.SigninDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

public class LyInterceptor extends AbstractInterceptor{
    public String intercept(ActionInvocation arg0) throws Exception {
        ActionContext context=arg0.getInvocationContext();
        Map paramMap = context.getParameters();
        String[] names = (String[]) paramMap.get("message.title");
        String title=names[0];
        SigninDao et=new SigninDao();
        if(!et.exist(title)){
            return "exist";
        }
        else
            return arg0.invoke();
    }
}
