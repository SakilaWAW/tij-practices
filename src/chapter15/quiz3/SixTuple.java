package chapter15.quiz3;

/**
 * 用继承的方式让二元元组"生长"成六元元组
 * @notes. 在实现的过程中，发现包装器类型在tuple初始化时并不会进行自动的转换成目标类型
 * 		   这证明了泛型的存在只是进行编译检查，只是检查并抛出错误，并不会帮你改正错误(进行类型转换)。
 * @author stg0909
 */
public class SixTuple<A,B,C,D,E,F> extends Tuple<A, B> {

	public final C obj3;
	public final D obj4;
	public final E obj5;
	public final F obj6;
	
	public SixTuple(A obj1, B obj2, C obj3, D obj4, E obj5, F obj6) {
		super(obj1, obj2);
		this.obj3 = obj3;
		this.obj4 = obj4;
		this.obj5 = obj5;
		this.obj6 = obj6;
	}
	
	@Override
	public String toString() {
		return "(" + obj1 + "," + obj2 + ","+ obj3 + "," + obj4 + "," + obj5 + "," + obj6 + ")";
	}

	public static void main(String[] args) {
		SixTuple<Integer,Long,Double,Float,Character,Boolean> sixTuple 
					= new SixTuple<>(1,(long)2,3.0,(float)4.0,'5',true);
		System.out.println(sixTuple);
	}

}
