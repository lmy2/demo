/*
 * �ļ�����MyCommand.java
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
 * ���ʵ����Command�ӿڣ����н��ն���
 * @author liumy
 * @version 1.0
 * @see MyCommand
 * @since 2017��3��16��
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
