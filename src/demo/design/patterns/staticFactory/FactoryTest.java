/*
 * 文件名：FactoryTest.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.staticFactory;

public class FactoryTest
{
    public static void main(String[] args) {      
        Sender sender = SendFactory.produceMail();  
        sender.Send();  
        Sender sender2 = SendFactory.produceSms();  
        sender2.Send();  
    }  
}
