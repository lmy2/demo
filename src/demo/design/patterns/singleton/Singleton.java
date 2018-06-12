/*
 * �ļ�����Singleton.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.singleton;

public class Singleton
{
    private static Singleton instance = null;  
    /* ˽�й��췽������ֹ��ʵ���� */  
    private Singleton() {  
    }  
  /*���߳��£���ͬ��������ֹͬʱ�������ʵ��*/
    private static synchronized void syncInit() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
    }  
  
    public static Singleton getInstance() {  
        //��һ��ʱ�򴴽�ʵ��
        if (instance == null) {  
            syncInit();  
        }  
        return instance;  
    }
}
