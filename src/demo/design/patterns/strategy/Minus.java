/*
 * 文件名：Minus.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.strategy;
/**
 * 
 * 减法实现类
 * @author liumy
 * @version 1.0
 * @see Minus
 * @since 2017年3月16日
 */
public class Minus extends AbstractCalculator implements ICalculator 
{
    @Override  
    public int calculate(String exp) {  
        int arrayInt[] = split(exp,"-");  
        return arrayInt[0]-arrayInt[1];  
    }  
}
