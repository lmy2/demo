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
 * ʵ����2
 * ��������ϸ������
 * @author liumy
 * @version 1.0
 * @see Observer2
 * @since 2017��3��16��
 */
public class Observer2 implements Observer {  
    
    @Override  
    public void update() {  
        System.out.println("observer2 has received!");  
    }  
}  
