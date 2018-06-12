/*
 * �ļ�����Plus.java
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
 * �ӷ����F�
 * @author liumy
 * @version 1.0
 * @see Plus
 * @since 2017��3��16��
 */
public class Plus extends AbstractCalculator implements ICalculator
{

    @Override
    public int calculate(String exp)
    {
        int arrayInt[] = split(exp,"\\+");  
        return arrayInt[0]+arrayInt[1];  
    }

}
