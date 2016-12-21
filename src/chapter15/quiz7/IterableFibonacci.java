package chapter15.quiz7;

import java.util.Iterator;
import java.util.Random;

/**
 * 用组合的方式实现队列迭代器
 * @note. 实现Iterable接口(泛型接口)就可以使生成的对象可以以for(xx:xx)方式使用
 * 		  只需在类中实现iterator方法返回迭代器
 * 		  迭代器需要定义个上限(因为不能无限for下去)
 * @author stg
 */
public class IterableFibonacci implements Iterable<Integer>{

	private Fibonacci fibo;
	private int n;
	
	public IterableFibonacci(int size){
		fibo = new Fibonacci();
		n = size;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>(){

			@Override
			public boolean hasNext() {
				return n > 0;
			}

			@Override
			public Integer next() {
				--n;
				return fibo.next();
			}};
	}
	
	public static void main(String[] args) {
		for(int i : new IterableFibonacci(new Random().nextInt(20))){
			System.out.println(i + " ");
		}
	}
}
