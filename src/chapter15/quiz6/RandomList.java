package chapter15.quiz6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import tij.officalsourcecode.pets.Cat;

/**
 * 验证P358中构筑的RandomList的正确性
 * @note. 基本的范型使用
 * @author stg
 */
public class RandomList<T> {

	private List<T> storage = new ArrayList<T>();
	private Random rand = new Random(15);
	
	public void addAll(T[] args){
		storage.addAll(Arrays.asList(args));
	}
	
	public void add(T element){
		storage.add(element);
	}
	
	public T select(){
		return storage.get(rand.nextInt(storage.size()-1));
	}
	
	public static void main(String[] args) {
		RandomList<String> str_list = new RandomList<>();
		str_list.addAll("sffafsafk".split("a"));
		selectTenNum(str_list);
		
		RandomList<Integer> int_list = new RandomList<>();
		Integer[] arr = {1,2,3,1,2,3,3,2,1,3,2,1};
		int_list.addAll(arr);
		selectTenNum(int_list);
		
		RandomList<Cat> animal_list = new RandomList<>();
		for(int i = 0; i < 10; ++i){
			Cat cat = new Cat("cat " + i);
			animal_list.add(cat);
		}
		selectTenNum(animal_list);
	}
	
	//从列表中随即打印10个数
	private static void selectTenNum(RandomList<?> list ){
		for(int i = 0; i < 10; ++i){
			System.out.println(list.select());
		}
		System.out.println();
	}

}
