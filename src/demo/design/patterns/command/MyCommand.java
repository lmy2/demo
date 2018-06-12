/*
 * 文件名：MyCommand.java
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
 * 命令（实现了Command接口，持有接收对象）
 * @author liumy
 * @version 1.0
 * @see MyCommand
 * @since 2017年3月16日
 */
public class MyCommand implements  Command
{
    private Receiver receiver;  
    
    public MyCommand(Receiver receiver) {  
        this.receiver = receiver;  
    }  
  
    @Override  
    public void exe() {  
        receiver.action();  
    }  

}
