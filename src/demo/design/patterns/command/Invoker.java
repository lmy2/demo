/*
 * 文件名：Invoker.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.command;
/**
 * 
 * 调用者（司令员）
 * @author liumy
 * @version 1.0
 * @see Invoker
 * @since 2017年3月16日
 */
public class Invoker
{
    private Command command;  
    
    public Invoker(Command command) {  
        this.command = command;  
    }  
  
    public void action(){  
        command.exe();  
    } 
}
