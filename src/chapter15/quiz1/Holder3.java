package chapter15.quiz1;

import tij.officalsourcecode.pets.Mouse;
import tij.officalsourcecode.pets.Pet;

/**
 * 证明泛型的持有对象可以用导出类型来填充
 * @notes. 泛型相关规则校验
 * @author stg0909
 */
public class Holder3<T> {
	
	private T obj;
	
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public Holder3(T obj){
		this.obj = obj;
	}
	
	public static void main(String[] args) {
		Holder3<Pet> petHolder = new Holder3<Pet>(new Mouse());
		System.out.println("petHolder = " + petHolder);
		System.out.println("obj = " + petHolder.getObj());
	}

}
