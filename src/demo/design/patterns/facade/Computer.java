/*
 * 文件名：Computer.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.facade;
/**
 * 
 * 外观模式是为了解决类与类之家的依赖关系的，像spring一样，可以将类和类之间的关系配置到配置文件中，而外观模式就是将他们的关系放在一个Facade类中，降低了类类之间的耦合度
 * @author liumy
 * @version 1.0
 * @see Computer
 * @since 2017年3月16日
 */
public class Computer
{
    private CPU cpu;  
    private Memory memory;  
    public Computer(){  
        cpu = new CPU();  
        memory = new Memory();  
       
    }  
    public void startup(){  
        System.out.println("start the computer!");  
        cpu.startup();  
        memory.startup();  
       
        System.out.println("start computer finished!");  
    }  
      
    public void shutdown(){  
        System.out.println("begin to close the computer!");  
        cpu.shutdown();  
        memory.shutdown();  
       
        System.out.println("computer closed!");  
    }  
}
