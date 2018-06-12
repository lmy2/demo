/*
 * 文件名：SendFactory.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.staticFactory;

/**
 * 
 * 静态工厂模式
 * 〈功能详细描述〉
 * @author liumy
 * @version 1.0
 * @see SendFactory
 * @since 2017年3月16日
 */
public class SendFactory
{
    public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}
