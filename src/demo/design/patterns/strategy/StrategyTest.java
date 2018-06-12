/*
 * 文件名：StrategyTest.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.strategy;

public class StrategyTest
{
    public static void main(String[] args) {  
         //加法
        String exp = "2+8";  
        ICalculator cal = new Plus();  
        int result = cal.calculate(exp);  
        //减法
        String exp2= "8-2";  
        ICalculator cal2 = new Minus();
        int result2 =cal2.calculate(exp2);
        System.out.println(result);  
        System.out.println(result2); 
    }  
}
