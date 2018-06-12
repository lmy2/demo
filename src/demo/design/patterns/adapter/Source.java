/*
 * 文件名：Source.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：適配器模式
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.adapter;
/**
 * 
 * 適配器模式
 * 有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 * @author liumy
 * @version 1.0
 * @see Source
 * @since 2017年3月16日
 */
public class Source
{
    public void method1() {  
        System.out.println("this is original method!");  
    } 
}
