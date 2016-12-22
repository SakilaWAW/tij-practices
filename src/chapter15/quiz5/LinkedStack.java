package chapter15.quiz5;

/**
 * 优化P357页程序，在内部类中使用外部类泛型
 * @note. 验证外部类泛型可以直接在内部类使用
 * 		  ！tip: 在Java8中已经对new泛型过于繁琐进行了优化
 * 			原来:Map<XXXXX> map = new HashMap<XXXXX>();
 * 			现在:Map<XXXXX> map = new HashMap<>();
 * 			简化了许多
 * @author stg
 */
public class LinkedStack<T> {

	private class Node {
		T item;
		Node next;
		
		Node(){
			item = null; 
			next = null;
		}
		
		Node(T item, Node next){
			this.next = next;
			this.item = item;
		}
		boolean isEnd(){
			return item == null && next == null;
		}	
	}
	
	/**
	 * top of stack
	 */
	private Node top = new Node();
	
	public void push(T item){
		top = new Node(item, top);
	}
	
	public T pop(){
		T result = top.item;
		if(!top.isEnd()) top = top.next;
		return result;
	}
	
	public static void main(String[] args) {
		LinkedStack<String> ls = new LinkedStack<String>();
		for(String s : "sa fsf aks hj fsdh a ksd".split(" ")){
			ls.push(s);
		}
		String s;
		while((s = ls.pop())!= null) System.out.println(s);
	}

}
