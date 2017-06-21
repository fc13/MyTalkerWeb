package net.qiujuer.web.italker.push.service;

import net.qiujuer.web.italker.push.bean.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;

/**
 * Created by 范超 on 2017/6/21.
 */
@Path("/account")
public class AccountService {

    @GET
    @Path("/login")
    public String get(){
        return "You get the login.";
    }

    @POST
    @Path("/login")
    //指定请求和返回的响应体为JSON
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User post(){
        User user = new User("美女",2);
        return user;
    }
}
