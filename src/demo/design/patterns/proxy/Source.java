/*
 * �ļ�����Source.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.proxy;

/*
 * ��Դ
 */
public class Source  implements Sourceable
{
    @Override  
    public void method() {  
        System.out.println("���ӽ���");  
    }  
}
