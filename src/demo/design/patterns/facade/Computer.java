/*
 * �ļ�����Computer.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.facade;
/**
 * 
 * ���ģʽ��Ϊ�˽��������֮�ҵ�������ϵ�ģ���springһ�������Խ������֮��Ĺ�ϵ���õ������ļ��У������ģʽ���ǽ����ǵĹ�ϵ����һ��Facade���У�����������֮�����϶�
 * @author liumy
 * @version 1.0
 * @see Computer
 * @since 2017��3��16��
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
