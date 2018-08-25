/*
 * 文 件 名:  Result.java
 * 版    权:  Copyright 2016 咪咕互动娱乐有限公司,  All rights reserved
 * 描    述:  <描述>
 * 版    本： <版本号> 
 * 创 建 人:  daijunmin
 * 创建时间:  2018年7月21日
 
 */
package entity;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  daijunmin
 * @version  [版本号, 2018年7月21日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Result
{
    private boolean success;
    
    private String message;
    
    /**
     * <默认构造函数>
     */
    public Result()
    {
        super();
    }
    
    /**
     * <默认构造函数>
     */
    public Result(boolean success, String message)
    {
        super();
        this.success = success;
        this.message = message;
    }
    
    /**
     * @return 返回 success
     */
    public boolean isSuccess()
    {
        return success;
    }
    
    /**
     * @param 对success进行赋值 */
    public void setSuccess(boolean success)
    {
        this.success = success;
    }
    
    /**
     * @return 返回 message
     */
    public String getMessage()
    {
        return message;
    }
    
    /**
     * @param 对message进行赋值 */
    public void setMessage(String message)
    {
        this.message = message;
    }
    
}
