package cn.javass.dp.visitor.example3;
/**
 * 具体元素的实现对象
 */
public class ConcreteElementA extends Element {
	public void accept(Visitor visitor) {
		//回调访问者对象的相应方法
		System.out.println("call");
		visitor.visitConcreteElementA(this);
	}
	/**
	 * 示例方法，表示元素已有的功能实现
	 */
	public void opertionA(){
		//已有的功能实现
		System.out.println("执行了已实现的方法了..");
	}
}

