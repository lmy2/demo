/*
 * 文件名：CommandTest.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.command;
//命令模式的目的就是达到命令的发出者和执行者之间解耦，
//实现请求和执行分开，熟悉Struts的同学应该知道，
//Struts其实就是一种将请求和呈现分离的技术，其中必然涉及命令模式的思想！
public class CommandTest
{

        
        public static void main(String[] args) { 
            //被调用者
            Receiver receiver = new Receiver();  
            //命令对象
            Command cmd = new MyCommand(receiver);  
            //发送命令
            Invoker invoker = new Invoker(cmd);  
            invoker.action();  
        }  
     
}
