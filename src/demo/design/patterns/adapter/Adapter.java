/*
 * �ļ�����Adapter.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.adapter;

public class Adapter extends Source implements Targetable
{

    @Override
    public void method2()
    {
        System.out.println("this is the targetable method!");  
        
    }

}
