package chapter15.quiz7;

import java.util.Random;

/**
 * 简单fibonacci数列，可以不断生成下一个数
 * @notes. 泛型简单应用-生成器
 * 		   不光生成数列，一切有规律的一组东西都可以生成
 * @author stg
 */
public class Fibonacci implements Generator<Integer>{

	private int count = 0;
	
	@Override
	public Integer next() {
		return fib(count++);
	}
	
	private Integer fib(int count){
		if(count < 2) return 1;
		else return fib(count-1) + fib(count-2);
	}
	

	/**
	 * for test
	 */
	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci();
		int rand = new Random().nextInt(15);
		for(int i = 0; i <= rand; ++i){
			System.out.println(fibo.next());
		}
	}
}
