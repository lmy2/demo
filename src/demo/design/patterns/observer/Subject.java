/*
 * �ļ�����Subject.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.observer;

public interface Subject
{
    /*���ӹ۲���*/  
    public void add(Observer observer);  
      
    /*ɾ���۲���*/  
    public void del(Observer observer);  
      
    /*֪ͨ���еĹ۲���*/  
    public void notifyObservers();  
      
    /*����Ĳ���*/  
    public void operation();  
}
