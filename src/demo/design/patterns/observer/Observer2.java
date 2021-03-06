/*
 * 文件名：Observer1.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.observer;

/**
 * 
 * 实现类2
 * 〈功能详细描述〉
 * @author liumy
 * @version 1.0
 * @see Observer2
 * @since 2017年3月16日
 */
public class Observer2 implements Observer {  
    
    @Override  
    public void update() {  
        System.out.println("observer2 has received!");  
    }  
}  
