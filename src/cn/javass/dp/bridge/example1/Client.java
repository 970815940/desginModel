package cn.javass.dp.bridge.example1;
/**
 * 桥接模式
 *<p>Client</p>
 *<p></p> 
 *<p></p> 
 * @author <a href="taoxs@sysway.cn">taoxs</a>
 * @date Jan 7, 2014 9:02:37 AM
 * @version
 */
public class Client {
	public static void main(String[] args) {
		Message m = new CommonMessageSMS();
		m.send("aa", "au");
		
		m = new CommonMessageEmail();
		m.send("aa", "au");
	}
}
