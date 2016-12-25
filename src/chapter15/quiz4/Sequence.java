package chapter15.quiz4;

/**
 * 用泛型重写tij.officalsourcecode.innerclasses.Sequence 泛型的基本使用方式
 * @note. 需要注意的是Java泛型中的擦除机制 有关泛型与数组的联合使用注意事项见:泛型与数组.markdown
 * @author stg0909
 */
interface Selector<T> {
	void next();
	T value();
	boolean isEnd();
}

public class Sequence<T> {

	private T[] sequence;
	private int index = 0;
	
	@SuppressWarnings("unchecked")
	public Sequence(int size){
		sequence = (T[]) new Object[size];
	}
	
	public void add(T element){
		if(index < sequence.length)
			sequence[index++] = element;
	}
	
	private class SequenceSelector implements Selector<T>{
		
		private int selector_index = 0;
		@Override
		public void next() {
			if(selector_index < sequence.length -1) ++selector_index;
		}

		@Override
		public T value() {
			return sequence[selector_index];
		}

		@Override
		public boolean isEnd() {
			return selector_index == sequence.length - 1;
		}
	}
	
	public SequenceSelector selector(){
		return new SequenceSelector();
	}
	
	public static void main(String[] args) {
		Sequence<Integer> sequence = new Sequence<>(10);
		for (int i = 0; i < 10; i++)
			sequence.add(i);
		Selector<Integer> selector = sequence.selector();
		while (!selector.isEnd()) {
			System.out.print(selector.value() + " ");
			selector.next();
		}
	}

}
