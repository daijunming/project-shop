/*
 * 文 件 名:  BrandServiceImpl.java
 * 版    权:  Copyright 2016 咪咕互动娱乐有限公司,  All rights reserved
 * 描    述:  <描述>
 * 版    本： <版本号> 
 * 创 建 人:  daijunmin
 * 创建时间:  2018年6月24日
 
 */
package com.pinyougou.sellergoods.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mysql.jdbc.StringUtils;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.TbBrandExample;
import com.pinyougou.pojo.TbBrandExample.Criteria;
import com.pinyougou.sellergoods.service.BrandService;

import entity.PageResult;

/**
 * <品牌服务>
 * <功能详细描述>
 *2 
 * @author  daijunmin
 * @version  [版本号, 2018年6月24日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@Service
public class BrandServiceImpl implements BrandService
{
    
    @Autowired
    private TbBrandMapper brandMapper;
    
    /** {@inheritDoc} */
    
    @Override
    public List<TbBrand> findAll()
    {
        // 返回数据表全部列表
        return brandMapper.selectByExample(null);
    }
    
    /** {@inheritDoc} */
    
    @Override
    public PageResult findPage(int pageNum, int pageSize)
    {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbBrand> page = (Page<TbBrand>)brandMapper.selectByExample(null);
        PageResult result = new PageResult();
        result.setTotal(page.getTotal());
        result.setRows(page.getResult());
        return result;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void add(TbBrand brand)
    {
        brandMapper.insert(brand);
    }
    
    /** {@inheritDoc} */
    
    @Override
    public TbBrand findOne(Long id)
    {
        return brandMapper.selectByPrimaryKey(id);
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void update(TbBrand brand)
    {
        brandMapper.updateByPrimaryKey(brand);
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void delete(Long[] ids)
    {
        for (Long id : ids)
        {
            brandMapper.deleteByPrimaryKey(id);
        }
    }
    
    /** {@inheritDoc} */
    
    @Override
    public PageResult findPage(TbBrand brand, int pageNum, int pageSize)
    {
        PageHelper.startPage(pageNum, pageSize);
        TbBrandExample example = new TbBrandExample();
        Criteria criteria = example.createCriteria();
        if (brand != null)
        {
            if (!StringUtils.isNullOrEmpty(brand.getName()))
            {
                criteria.andNameLike("%" + brand.getName() + "%");
            }
            if (!StringUtils.isNullOrEmpty(brand.getFirstChar()))
            {
                criteria.andFirstCharLike("%" + brand.getFirstChar() + "%");
            }
        }
        Page<TbBrand> page = (Page<TbBrand>)brandMapper.selectByExample(example);
        PageResult result = new PageResult();
        result.setTotal(page.getTotal());
        result.setRows(page.getResult());
        return result;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public List<Map> selectOptionList()
    {
        return brandMapper.selectOptionList();
    }
    
}
