/*
 * �ļ�����ObserverTest.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.observer;

public class ObserverTest
{
    public static void main(String[] args) {  
        Subject sub = new MySubject();  
        sub.add(new Observer1());  
        sub.add(new Observer2());  
          
        sub.operation();  
    } 
}
