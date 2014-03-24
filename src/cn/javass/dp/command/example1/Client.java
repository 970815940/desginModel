package cn.javass.dp.command.example1;

public class Client {
	/**
	 * ʾ�⣬���𴴽�������󣬲��趨���Ľ�����
	 */
	public static  void assemble(){
		//����������
		Receiver receiver = new Receiver();
		//������������趨���Ľ�����
		Command command = new ConcreteCommand(receiver);
		//����Invoker��������������ý�ȥ
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.runCommand();
	}
	public static void main(String[] args) {
		assemble();
	}
}
