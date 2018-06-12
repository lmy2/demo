/*
 * �ļ�����Invoker.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.command;
/**
 * 
 * �����ߣ�˾��Ա��
 * @author liumy
 * @version 1.0
 * @see Invoker
 * @since 2017��3��16��
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
