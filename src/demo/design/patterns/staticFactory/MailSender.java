/*
 * �ļ�����MailSender.java
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
 * ʵ�ֽӿ�
 * ��������ϸ������
 * @author liumy
 * @version 1.0
 * @see MailSender
 * @since 2017��3��16��
 */
public class MailSender implements Sender {
    
@Override
public void Send()
{
    System.out.println("this is mailsender!");  
    
}
}