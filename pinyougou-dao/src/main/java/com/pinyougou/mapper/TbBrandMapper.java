package com.pinyougou.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.TbBrandExample;

public interface TbBrandMapper
{
    int countByExample(TbBrandExample example);
    
    int deleteByExample(TbBrandExample example);
    
    int deleteByPrimaryKey(Long id);
    
    int insert(TbBrand record);
    
    int insertSelective(TbBrand record);
    
    List<TbBrand> selectByExample(TbBrandExample example);
    
    TbBrand selectByPrimaryKey(Long id);
    
    int updateByExampleSelective(@Param("record") TbBrand record, @Param("example") TbBrandExample example);
    
    int updateByExample(@Param("record") TbBrand record, @Param("example") TbBrandExample example);
    
    int updateByPrimaryKeySelective(TbBrand record);
    
    int updateByPrimaryKey(TbBrand record);
    
    /**
     * <一句话功能简述>
     * <功能详细描述>
     * @return
     * @see [类、类#方法、类#成员]
     */
    List<Map> selectOptionList();
}