package org.action;

import com.opensymphony.xwork2.*;
import org.dao.SigninDao;
import org.model.Login;
import java.util.*;

/**
 * Created by wcy on 2016/4/23.
 */
public class RegisterAction extends ActionSupport {
    private Login login;
    public String execute() throws Exception{
        SigninDao signin=new SigninDao();
        if(signin.insertUser(login.getUsername(),login.getPassword(),login.getRoot())){
            return SUCCESS;
        }
        else{
            return ERROR;
        }
    }
    public Login getLogin(){
        return login;
    }
    public void setLogin(Login login){
        this.login=login;
    }
}
