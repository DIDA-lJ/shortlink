# 短链接系统开发文档

## 短链接生成算法
如下图所示，其为生成的链接的效果：其由协议，域名，分割符，以及我们系统生成的短链接拼接而成。
![image](https://github.com/DIDA-lJ/shortlink/assets/97254796/472f4886-f6d7-4f56-a695-ddc1baef7fc4)

这里我们来说一下该短链接生成的算法，这里我们生成的短链接之所以选择的位数是 6 位，其原因如下：

我们短链接生成算法为一种哈希算法加上 Base 62 实现生成，这里假设我们使用的是 26 个字母的大小写，加上 10 个数字，那么对于短链接可以表示的最大组合数量为：
<ul>
<li> N = 4，组合数为 62 ^ 4 = 14_776_336，147 万接近 148 万</li>
<li> N = 5，组合数为 62 ^ 5 = 916_132_832，9.16 亿左右</li>
<li>N = 6，组合数为 62 ^ 6 = 56_800_235_584，568 亿左右</li>
</ul>
所以当我们选择 6位数字作为生成的短链接的时候，其生成的短链接数量基本可以满足我们的需求

然后来说明一下我们短链接的生成过程，如下图所示，只需要生成一个唯一的 10 进制数，然后再基于此 10 进制数转换为 62 进制数即可。
![image](https://github.com/DIDA-lJ/shortlink/assets/97254796/bee1e3d4-920a-4563-9a40-be1beeb7f169)

这里是我们实现的 Hash 算法的过程，并且将对应的生成的哈希串通过 Base62 算法转化成对应的字符串，然后返回就是我们的短链接了
```Java
import cn.hutool.core.lang.hash.MurmurHash;

/**
 * HASH 工具类
 */
public class HashUtil {

    private static final char[] CHARS = new char[]{
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    private static final int SIZE = CHARS.length;

    private static String convertDecToBase62(long num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int i = (int) (num % SIZE);
            sb.append(CHARS[i]);
            num /= SIZE;
        }
        return sb.reverse().toString();
    }

    public static String hashToBase62(String str) {
        int i = MurmurHash.hash32(str);
        long num = i < 0 ? Integer.MAX_VALUE - (long) i : i;
        return convertDecToBase62(num);
    }
}
```
