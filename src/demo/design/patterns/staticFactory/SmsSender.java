/*
 * �ļ�����SmsSender.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.staticFactory;

public class SmsSender implements Sender
{

    @Override
    public void Send()
    {
        System.out.println("this is smssender!");  
        
    }

}
