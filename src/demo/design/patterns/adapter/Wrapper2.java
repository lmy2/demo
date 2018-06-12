/*
 * 文件名：Wrapper2.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.adapter;

public class Wrapper2 implements Sourceable
{

    @Override
    public void method1()
    {
        System.out.println("the sourceable interface's  Wrapper2 method1!"); 
        
    }

    @Override
    public void method2()
    {
        System.out.println("the sourceable interface's Wrapper2 method1!");   
    }

}
