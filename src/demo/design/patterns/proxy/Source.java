/*
 * 文件名：Source.java
 * 版权：Copyright by citycloud.com.cn
 * 描述：
 * 修改人：liumy
 * 修改时间：2017年3月16日
 * 跟踪问题号：
 * 修改问题号：
 * 修改内容：
 */

package demo.design.patterns.proxy;

/*
 * 房源
 */
public class Source  implements Sourceable
{
    @Override  
    public void method() {  
        System.out.println("房子交易");  
    }  
}
