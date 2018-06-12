/*
 * 文件名：MySubject.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.observer;

public class MySubject extends AbstractSubject 
{

    @Override
    public void operation()
    {
        // TODO Auto-generated method stub
        System.out.println("update self!");  
        notifyObservers();  
    }

}
