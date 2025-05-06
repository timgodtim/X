import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 获取当前时间（单位：秒）并进行计算
        long count = ((((System.currentTimeMillis() / 1000) / 60) / 60) + 8) / 24;

        // 输出计算的 count 值
        System.out.println("Original count: " + count);

        // 定义X天作为变量 只改这里就可以了
        long daysToAdd = 23;

        count = count + daysToAdd;

        // 输出加 daysToAdd 后的 count 值
        System.out.println("Modified count: " + count);

        // 将最终的 count 转换为十六进制字符串
        String hexString = Long.toHexString(count);

        // 输出最终的十六进制结果
        System.out.println("Hexadecimal representation: " + hexString);

        // 计算 count 天后的日期（从当前日期开始）
        long futureTimeMillis = (count * 24 * 60 * 60 * 1000) - 8 * 60 * 60 * 1000;

        // 创建日期对象
        Date futureDate = new Date(futureTimeMillis);

        // 使用 SimpleDateFormat 格式化日期为 yyyy mm dd
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(futureDate);

        // 输出格式化后的日期
        System.out.println("Date after 63 days (yyyy MM dd): " + formattedDate);
    }
}
