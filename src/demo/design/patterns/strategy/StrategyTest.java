/*
 * �ļ�����StrategyTest.java
 * ��Ȩ��Copyright by citycloud.com.cn
 * ������
 * �޸��ˣ�liumy
 * �޸�ʱ�䣺2017��3��16��
 * ��������ţ�
 * �޸�����ţ�
 * �޸����ݣ�
 */

package demo.design.patterns.strategy;

public class StrategyTest
{
    public static void main(String[] args) {  
         //�ӷ�
        String exp = "2+8";  
        ICalculator cal = new Plus();  
        int result = cal.calculate(exp);  
        //����
        String exp2= "8-2";  
        ICalculator cal2 = new Minus();
        int result2 =cal2.calculate(exp2);
        System.out.println(result);  
        System.out.println(result2); 
    }  
}
