/*
 * �ļ�����ProxyTest.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.proxy;

public class ProxyTest
{
    public static void main(String[] args) {  
        Sourceable source = new Proxy();  
        source.method();  
    }  
}
