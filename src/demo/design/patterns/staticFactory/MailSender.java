/*
 * 文件名：MailSender.java
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
 * 实现接口
 * 〈功能详细描述〉
 * @author liumy
 * @version 1.0
 * @see MailSender
 * @since 2017年3月16日
 */
public class MailSender implements Sender {
    
@Override
public void Send()
{
    System.out.println("this is mailsender!");  
    
}
}