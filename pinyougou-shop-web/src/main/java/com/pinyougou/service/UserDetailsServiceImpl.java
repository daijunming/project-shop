/*
 * 文 件 名:  UserDetailsServiceImpl.java
 * 版    权:  Copyright 2016 咪咕互动娱乐有限公司,  All rights reserved
 * 描    述:  <描述>
 * 版    本： <版本号> 
 * 创 建 人:  daijunmin
 * 创建时间:  2018年8月26日
 
 */
package com.pinyougou.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.pinyougou.pojo.TbSeller;
import com.pinyougou.sellergoods.service.SellerService;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  daijunmin
 * @version  [版本号, 2018年8月26日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class UserDetailsServiceImpl implements UserDetailsService
{
    
    private SellerService sellerService;
    
    public void setSellerService(SellerService sellerService)
    {
        this.sellerService = sellerService;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public UserDetails loadUserByUsername(String username)
        throws UsernameNotFoundException
    {
        List<GrantedAuthority> grantedAuths = new ArrayList<>();
        grantedAuths.add(new SimpleGrantedAuthority("ROLE_SELLER"));
        
        TbSeller seller = sellerService.findOne(username);
        if (seller != null)
        {
            if (seller.getStatus().equals("1"))
            {
                return new User(username, seller.getPassword(), grantedAuths);
            }
            return null;
        }
        else
        {
            return null;
        }
    }
}
