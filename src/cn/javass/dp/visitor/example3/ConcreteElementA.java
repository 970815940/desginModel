package cn.javass.dp.visitor.example3;
/**
 * ����Ԫ�ص�ʵ�ֶ���
 */
public class ConcreteElementA extends Element {
	public void accept(Visitor visitor) {
		//�ص������߶������Ӧ����
		System.out.println("call");
		visitor.visitConcreteElementA(this);
	}
	/**
	 * ʾ����������ʾԪ�����еĹ���ʵ��
	 */
	public void opertionA(){
		//���еĹ���ʵ��
		System.out.println("ִ������ʵ�ֵķ�����..");
	}
}

