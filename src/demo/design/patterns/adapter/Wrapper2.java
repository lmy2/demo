/*
 * �ļ�����Wrapper2.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.adapter;

public class Wrapper2 implements Sourceable
{

    @Override
    public void method1()
    {
        System.out.println("the sourceable interface's  Wrapper2 method1!"); 
        
    }

    @Override
    public void method2()
    {
        System.out.println("the sourceable interface's Wrapper2 method1!");   
    }

}
