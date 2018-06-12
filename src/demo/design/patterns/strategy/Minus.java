/*
 * �ļ�����Minus.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.strategy;
/**
 * 
 * ����ʵ����
 * @author liumy
 * @version 1.0
 * @see Minus
 * @since 2017��3��16��
 */
public class Minus extends AbstractCalculator implements ICalculator 
{
    @Override  
    public int calculate(String exp) {  
        int arrayInt[] = split(exp,"-");  
        return arrayInt[0]-arrayInt[1];  
    }  
}
