package org.interceptor;

/**
 * Created by wcy on 2016/5/14.
 */
import java.util.Locale;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
public class LauInterceptor extends AbstractInterceptor{
    public String intercept(ActionInvocation arg0) throws Exception{
        ActionContext context=arg0.getInvocationContext();
        Map session=context.getSession();
        Locale nowLocale=(Locale)session.get("WW_TRANS_I18N_LOCALE");
        if(nowLocale==null){
            nowLocale=new Locale("zh","CN");
            session.put("WW_TRANS_I18N_LOCALE",nowLocale);
        }
        return arg0.invoke();
    }
}
