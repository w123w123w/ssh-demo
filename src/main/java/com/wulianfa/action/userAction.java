package com.wulianfa.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wulianfa.model.User;
import com.wulianfa.service.userService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class userAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    public User getModel() {
        return user;
    }

    private Map<String,Object> dataMap;

    public Map<String, Object> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<String, Object> dataMap) {
        this.dataMap = dataMap;
    }

    @Autowired
    private userService userService;

    public String saveUser() {
        userService.saveUser(user);
        return "succeed";
    }

    public String queryUser() {
        try {
            User u = userService.queryUser(user);
            dataMap = new HashMap<String, Object>();
            dataMap.put("user", u);
            return "succeed";
        }catch (Exception e){
            return "error";
        }
    }

    public String updateUser() {
        userService.updateUser(user);
        return "succeed";
    }

    public String deleteUser() {
        userService.deleteUser(user);
        return "succeed";
    }

}
