/*
 * �ļ�����AdapterTest.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.adapter;

public class AdapterTest
{
    public static void main(String[] args) {  
        //Adapter��̳�Source�࣬ʵ��Targetable�ӿ�
        Targetable target = new Adapter();  
        target.method1();  
        target.method2();  
    }  
}
