/*
 * �ļ�����MySubject.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.observer;

public class MySubject extends AbstractSubject 
{

    @Override
    public void operation()
    {
        // TODO Auto-generated method stub
        System.out.println("update self!");  
        notifyObservers();  
    }

}
