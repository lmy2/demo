/*
 * �ļ�����Observer1.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.observer;

/**
 * 
 * ʵ����1
 * ��������ϸ������
 * @author liumy
 * @version 1.0
 * @see Observer1
 * @since 2017��3��16��
 */
public class Observer1 implements Observer {  
    
    @Override  
    public void update() {  
        System.out.println("observer1 has received!");  
    }  
}  
