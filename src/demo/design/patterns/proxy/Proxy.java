/*
 * �ļ�����Proxy.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.proxy;

/**
 * 
 * �н�
 * @author liumy
 * @version 1.0
 * @see Proxy
 * @since 2017��3��16��
 */
public class Proxy implements Sourceable
{
    //���������׷���
    private Source source;  
    public Proxy(){  
        super();  
        this.source = new Source();  
    }  
    @Override  
    public void method() {  
        before();  
        source.method();  
        atfer();  
    }  
    //����ͬ
    private void atfer() {  
        System.out.println("����ͬ!");  
    } 
   //����
    private void before() {  
        System.out.println("����!");  
    }  
}
