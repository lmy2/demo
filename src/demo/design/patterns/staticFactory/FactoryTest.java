/*
 * �ļ�����FactoryTest.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.staticFactory;

public class FactoryTest
{
    public static void main(String[] args) {      
        Sender sender = SendFactory.produceMail();  
        sender.Send();  
        Sender sender2 = SendFactory.produceSms();  
        sender2.Send();  
    }  
}
