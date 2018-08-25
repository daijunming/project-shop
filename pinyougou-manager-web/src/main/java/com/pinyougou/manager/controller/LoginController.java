/*
 * 文 件 名:  LoginController.java
 * 版    权:  Copyright 2016 咪咕互动娱乐有限公司,  All rights reserved
 * 描    述:  <描述>
 * 版    本： <版本号> 
 * 创 建 人:  daijunmin
 * 创建时间:  2018年8月25日
 
 */
package com.pinyougou.manager.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  daijunmin
 * @version  [版本号, 2018年8月25日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@RestController
@RequestMapping("/login")
public class LoginController
{
    @RequestMapping("/name")
    public Map name()
    {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Map map = new HashMap<>();
        map.put("loginName", name);
        return map;
        
    }
}
