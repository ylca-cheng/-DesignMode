package com.cheng.xiangyuanmoshi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by niecheng on 2018/11/28.
 *
 * 当前角色：享元工厂
 * 让对象可以重复利用，减少内存开支
 */
public class WebSiteFactory {
    private static Map<String,WebSite> map = new HashMap<String,WebSite>();

    public static WebSite getWebSite(String type) {
        if (!map.containsKey(type)) {
            map.put(type, new WebSiteA(type));
        }
        return map.get(type);
    }
}
