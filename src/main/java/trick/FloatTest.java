package trick;
/*
对于float来说，4个字节，32位，0-22位表示尾数，23-30(8位)表示指数，31位表示符号位。

对于double来说，8个字节，64位，0-51表示尾数，52-62(11位)表示指数，63位最高位表示符号位。

20.3 = 10100.010011001…1001
     =1.01000100110011E10…..（十进制科学计数）
     =1.01000100110011E100…..(二进制科学计数)


举个简单的例子，现在有个"01000001001100010100011110101110"字符串进行简单的分析：

符号位为0，表示正数
指数位为10000010，结果为130，减去偏移量127后为3
尾数位为01100010100011110101110，对应的值为1.0110001010001111010111
于是得到浮点数为1011.0001010001111010111，转成十进制为11.07999992370605469，约等于11.08

链接：https://juejin.cn/post/6844903927838670862

 */
public class FloatTest {
    public static void main(String[] args) {
        try{
            Float f1 = new Float("11.08");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x  +b +d);
        } catch (NumberFormatException e)
        {
            System.out.println("bad number");
        }
    }
}
