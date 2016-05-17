package org.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.dao.SigninDao;
import org.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by wcy on 2016/5/2.
 */
public class QueryAction extends ActionSupport{
    private SigninDao query=new SigninDao();
    private Result result;
    public String execute() throws Exception{
        Map session= ActionContext.getContext().getSession();
        Map request=(Map)ActionContext.getContext().get("request");
        if(session.get("login")==null)
            return ERROR;
        int i=((Login)session.get("login")).getRoot();
        if(i!=0)
            return ERROR;
        List list=query.all();
        request.put("all",list);
        return SUCCESS;
    }
    public String persons()throws Exception{
        Map session= ActionContext.getContext().getSession();
        Map request=(Map)ActionContext.getContext().get("request");
        if(session.get("login")==null)
            return ERROR;
        int i=((Login)session.get("login")).getId();
        List list=query.person(i);
        request.put("all",list);
        return SUCCESS;
    }
    public String content()throws Exception{
        result=query.details(result.getId());
        Map request=(Map)ActionContext.getContext().get("request");
        request.put("details",result);
        return SUCCESS;
    }
    public void setResult(Result result){
        this.result=result;
    }
    public Result getResult(){
        return result;
    }
}
