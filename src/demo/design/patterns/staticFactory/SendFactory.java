/*
 * �ļ�����SendFactory.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.staticFactory;

/**
 * 
 * ��̬����ģʽ
 * ��������ϸ������
 * @author liumy
 * @version 1.0
 * @see SendFactory
 * @since 2017��3��16��
 */
public class SendFactory
{
    public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}
