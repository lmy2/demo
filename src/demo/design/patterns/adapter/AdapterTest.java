/*
 * 文件名：AdapterTest.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.adapter;

public class AdapterTest
{
    public static void main(String[] args) {  
        //Adapter类继承Source类，实现Targetable接口
        Targetable target = new Adapter();  
        target.method1();  
        target.method2();  
    }  
}
