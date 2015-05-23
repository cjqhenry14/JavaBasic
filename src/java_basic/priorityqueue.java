package java_basic;

import java.util.Comparator;
import java.util.PriorityQueue;



public class priorityqueue {

	public static class neighbour {
		int uid;
		float similarity;
		neighbour(int id, float sim)
		{
			uid = id;
			similarity = sim;
		}
	}
	
	public static Comparator<neighbour> nComparator = new Comparator<neighbour>() {//use as minHeap
		@Override
		public int compare(neighbour c1, neighbour c2) {
			return (int) Float.compare(c1.similarity, c2.similarity);
		}
	};
	
	public static void obj_topk()
	{
		int k = 3;
		neighbour []topklist = new neighbour[k];
		
		PriorityQueue<neighbour> min_heap = new PriorityQueue<neighbour>(k, nComparator);
		
		float[] sim_array = {0.4f, 0.2f, 0.7f, 0.1f, 0.9f, 0.3f};
		for (int i = 0; i <= 5; i++) {
			neighbour nb = new neighbour(i, sim_array[i]);
			
			if (min_heap.size() < k) {
				min_heap.add(nb);
			} else if (nb.similarity > min_heap.peek().similarity)/* meet capacity and > top*/
			{
				min_heap.poll();
				min_heap.add(nb);
			}
		}
		//traverse min heap
		int idx = 0;
		while (!min_heap.isEmpty()) {
			topklist[idx++] = min_heap.poll();
		}
		
		for (int i = 0; i < k; i++) {
			System.out.println(topklist[i].uid + " " + topklist[i].similarity);
		}
	}
	
	public static void main(String[] args) {
		obj_topk();

	}

}
