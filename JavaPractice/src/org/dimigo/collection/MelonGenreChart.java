/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ MelonGenreChart
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 5.
 * </pre>
 *
 * @author       : 김용환
 * @version     : 1.0
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Music> balist = new ArrayList<Music>();
		balist.add(new Music("팔레트","아이유"));
		
		List<Music> dalist = new ArrayList<Music>();
		dalist.add(new Music("I LUV IT","PSY"));
		dalist.add(new Music("맞지?","언니쓰"));
		Map<String,List<Music>> map = new HashMap<>();
		
		map.put("[발라드]", balist);
		map.put("[댄스]", dalist);
		System.out.println("--<< 멜론 장르별 차트 >>--");
		
		printMap(map);
		System.out.println("--<< 댄스 2위 곡 변경 >>--");
		dalist.remove(1);
		dalist.add(new Music("SIGNAL","트와이스"));
		printMap(map);
		System.out.println("--<< 댄스 1위 곡 삭제 >>--");
		dalist.remove(0);
		printMap(map);
		System.out.println("--<< 전체 리스트 삭제 >>--");
		map.clear();
		printMap(map);
		
		
		
		
		

	}
	
	
	
	public static void printMap(Map<String,List<Music>> map){
		int i;
		for(String a :  map.keySet() ){
			System.out.println(a+map.get(a));
		}
	}

}
