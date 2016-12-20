package chapter15.quiz2;

/**
 * 一个可以容纳3个相同类型对象的容器
 * 只提供了简单的读写操作
 * @notes. 简单的泛型使用练习
 * @author stg0909
 */
public class Holder<T> {
	
	private T obj1;
	private T obj2;
	private T obj3;
	
	public Holder(T obj1, T obj2, T obj3){
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.obj3 = obj3;
	}
	
	public T getObj1() {
		return obj1;
	}

	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}

	public T getObj2() {
		return obj2;
	}

	public void setObj2(T obj2) {
		this.obj2 = obj2;
	}

	public T getObj3() {
		return obj3;
	}

	public void setObj3(T obj3) {
		this.obj3 = obj3;
	}
	
	public static void main(String[] args) {
		Holder<Integer>  holder = new Holder<Integer>(1,2,3);
		System.out.println(holder.getObj1());
		System.out.println(holder.getObj2());
		System.out.println(holder.getObj3());
	}

}
