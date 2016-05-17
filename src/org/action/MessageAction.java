package org.action;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.dao.SigninDao;
import org.model.*;

import java.util.Map;


/**
 * Created by wcy on 2016/5/2.
 */
public class MessageAction extends ActionSupport{

    private Message message;
    public String execute() throws Exception{
        SigninDao LyDao=new SigninDao();
        Map session= ActionContext.getContext().getSession();
        if(session.get("login")==null)
            return ERROR;
        int i=((Login)session.get("login")).getId();
        if(LyDao.addLy(i,message.getTitle(),message.getContent()))
            return SUCCESS;
        else
            return ERROR;
    }

    public Message getMessage(){
        return message;
    }
    public void setMessage(Message message){
        this.message=message;
    }
}
