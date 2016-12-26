package chapter15.quiz9;

/**
 * 泛型方法的基本用法
 * @note. T1，T2，T3可以相同，分别可以是任意的类型
 * 		  这里也可以看出基本类型参数被自动包装成对应的包装类型了
 * @author stg
 */
public class GenericMethods {

	public <T1,T2,T3> void f(T1 x, T2 y, T3 z){
		System.out.println("T1.class = " + x.getClass().getSimpleName());
		System.out.println("T2.class = " + y.getClass().getSimpleName());
		System.out.println("T3.class = " + z.getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		GenericMethods m = new GenericMethods();
		m.f(" ", 1, new GenericMethods());
		m.f(new int[10], 40, new StringBuilder());
		m.f(" ", 1.0, new Integer(1));
		m.f(" ", " ", "");
	}

}
