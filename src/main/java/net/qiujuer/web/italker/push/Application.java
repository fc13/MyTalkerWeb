package net.qiujuer.web.italker.push;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import net.qiujuer.web.italker.push.service.AccountService;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.logging.Logger;

/**
 * Created by 范超 on 2017/6/21.
 */
public class Application extends ResourceConfig {
    public Application(){
        //注册逻辑处理的包名
        //下面2中方法相同
//        packages("net.qiujuer.web.italker.push.service");
        packages(AccountService.class.getPackage().getName());
        //注册json解析器
        register(JacksonJsonProvider.class);
        //注册日志输出文件
        register(Logger.class);
    }
}
