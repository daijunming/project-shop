/*
 * 文 件 名:  PageResult.java
 * 版    权:  Copyright 2016 咪咕互动娱乐有限公司,  All rights reserved
 * 描    述:  <描述>
 * 版    本： <版本号> 
 * 创 建 人:  daijunmin
 * 创建时间:  2018年7月2日
 
 */
package entity;

import java.io.Serializable;
import java.util.List;

/**
 * <分页数据实体类>
 * <功能详细描述>
 * 
 * @author  daijunmin
 * @version  [版本号, 2018年7月2日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class PageResult implements Serializable
{
    private Long total;
    
    private List rows;
    
    /**
     * <默认构造函数>
     */
    public PageResult()
    {
        super();
    }
    
    /**
     * <默认构造函数>
     */
    public PageResult(Long total, List rows)
    {
        super();
        this.total = total;
        this.rows = rows;
    }
    
    /**
     * @return 返回 total
     */
    public Long getTotal()
    {
        return total;
    }
    
    /**
     * @param 对total进行赋值 */
    public void setTotal(Long total)
    {
        this.total = total;
    }
    
    /**
     * @return 返回 rows
     */
    public List getRows()
    {
        return rows;
    }
    
    /**
     * @param 对rows进行赋值 */
    public void setRows(List rows)
    {
        this.rows = rows;
    }
}
