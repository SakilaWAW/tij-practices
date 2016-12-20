package chapter15.quiz3;

/**
 * 用泛型实现二元元组的概念
 * @notes. 泛型的应用方式-元组
 * 		   其中public和final的配合简洁有效,很不错
 * @author stg0909
 */
public class Tuple<A,B> {

	public final A obj1;
	public final B obj2;
	
	public Tuple(A obj1, B obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	@Override
	public String toString() {
		return "(" + obj1 + "," + obj2 + ")";
	}
	
	public static void main(String[] args) {
		Tuple<Integer,Double> tuple = new Tuple<Integer,Double>(1,1.5);
		System.out.println(tuple);
	}

}
