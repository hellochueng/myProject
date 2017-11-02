

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	Data first = null;
	int count = 0;
	List<String> l = new ArrayList<String>();
	//类似定义结构体
	public class Data{
		//单链表中的数据
		private Object obj;
		//指向下一个节点
		private Data next=null;
		public Data(Object obj){
			this.obj = obj;
		}
	}

	//插入第一个节点
	public void insertFirst(Object obj){
		Data data = new Data(obj);
		data.next = first;
		first = data;
	}
	
	
	
	//查询一个节点
	public Data find(Object obj){
		if(first==null){
			System.out.println("likedList is null");
			return null;
		}else{
			Data Data = first;
			while(Data!=null){
				if(Data.obj==obj){
					return Data;
				}
				Data = Data.next;
			}
			return null;
		}
	}
	
	public void insert(Object obj){
		Data data = new Data(obj);
		if(first==null){
			data.next = first;
			first = data;
			count++;
		}else{
			Data Data = first;
			while(Data!=null){
				if(Data.next==null){
					count++;
					Data.next=data;
					break;
				}
				Data = Data.next;
			}
		}
	}
	
	//删除一个节点
	public void delete(Object obj){
		Data data = first;
		if(data!=null){
			if(first.obj==obj){
				count--;
				first = first.next;
			}else{
				while(data.next!=null){
					if(data.next.obj == obj){
						if(data.next.next!=null){
							data.next = data.next.next;
						}else{
							data.next =null;
						}
						count--;
						break;
					}
					data = data.next;
				}
			}
		}else{
			System.out.println("likedList is null");
		}
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		System.out.println(ll.count);
		ll.delete(1);
		System.out.println(ll.count);
	}
}
