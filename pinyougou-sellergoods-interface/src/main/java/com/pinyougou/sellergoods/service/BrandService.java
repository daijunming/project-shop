/*
 * 文 件 名:  BrandService.java
 * 版    权:  Copyright 2016 咪咕互动娱乐有限公司,  All rights reserved
 * 描    述:  <描述>
 * 版    本： <版本号> 
 * 创 建 人:  daijunmin
 * 创建时间:  2018年6月24日
 
 */
package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

/**
 * <品牌接口>
 * <功能详细描述>
 * 
 * @author  daijunmin
 * @version  [版本号, 2018年6月24日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public interface BrandService
{
    
    /**
     * <查询全部数据>
     * <功能详细描述>
     * @return
     * @see [类、类#方法、类#成员]
     */
    public List<TbBrand> findAll();
    
    public PageResult findPage(int pageNum, int pageSize);
    
    /**
     * <一句话功能简述>
     * <功能详细描述>
     * @param brand
     * @see [类、类#方法、类#成员]
     */
    public void add(TbBrand brand);
    
    public TbBrand findOne(Long id);
    
    public void update(TbBrand brand);
    
    public void delete(Long[] ids);
    
    public PageResult findPage(TbBrand brand, int pageNum, int pageSize);
    
    /**
     * <一句话功能简述>
     * <功能详细描述>
     * @return
     * @see [类、类#方法、类#成员]
     */
    public List<Map> selectOptionList();
    
}
