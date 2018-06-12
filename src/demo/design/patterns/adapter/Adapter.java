/*
 * 文件名：Adapter.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.adapter;

public class Adapter extends Source implements Targetable
{

    @Override
    public void method2()
    {
        System.out.println("this is the targetable method!");  
        
    }

}
