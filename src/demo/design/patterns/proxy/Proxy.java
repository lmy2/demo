/*
 * 文件名：Proxy.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.proxy;

/**
 * 
 * 中介
 * @author liumy
 * @version 1.0
 * @see Proxy
 * @since 2017年3月16日
 */
public class Proxy implements Sourceable
{
    //代理了这套房子
    private Source source;  
    public Proxy(){  
        super();  
        this.source = new Source();  
    }  
    @Override  
    public void method() {  
        before();  
        source.method();  
        atfer();  
    }  
    //簽合同
    private void atfer() {  
        System.out.println("簽合同!");  
    } 
   //看房
    private void before() {  
        System.out.println("看房!");  
    }  
}
