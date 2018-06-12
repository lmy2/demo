/*
 * 文件名：User.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.facade;

public class User
{
    public static void main(String[] args) {  
        Computer computer = new Computer();  
        computer.startup();  
        computer.shutdown();  
    }  
}
