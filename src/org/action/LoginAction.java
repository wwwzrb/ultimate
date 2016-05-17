package org.action;

/**
 * Created by wcy on 2016/4/23.
 */
import com.opensymphony.xwork2.*;
import org.dao.SigninDao;
import org.model.Login;

import java.util.*;
public class LoginAction extends ActionSupport{
    private Login login;
    public String execute() throws Exception{
        SigninDao signin=new SigninDao();
        Login u=signin.checkUser(login.getUsername(),login.getPassword());
        if(u!=null){
            Map session= ActionContext.getContext().getSession();
            session.put("login",u);
            return SUCCESS;
        }
        else{
            return ERROR;
        }
    }
    public void validate(){
        if(login.getUsername().equals("")||login.getUsername()==null){
            this.addFieldError("login.username","用户名为空");
        }
        if(login.getPassword().equals("")||login.getPassword()==null){
            this.addFieldError("login.password","密码为空");
        }
    }

    public Login getLogin(){
        return login;
    }
    public void setLogin(Login login){
        this.login=login;
    }
}
