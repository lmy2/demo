/*
 * 文件名：Plus.java
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
 * 加法實現類
 * @author liumy
 * @version 1.0
 * @see Plus
 * @since 2017年3月16日
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
