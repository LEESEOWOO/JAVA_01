package java01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class e27_MapScore {
	public static void main(String[] args) {
		Map<String, Integer> score = new HashMap<String, Integer>();
		score.put("kim", 96);
		score.put("hong", 86);
		score.put("park", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		score.keySet().iterator(); //keySet : map안에 key로 이루어진 set을 리턴하는 메소드
								   //iterator() : key를 하나씩 순회하기위한 반복자를 리턴하는 메소드
		Iterator<String> na = score.keySet().iterator();
		//#1
		while(na.hasNext()) {
			String key = na.next();
			if(score.get(key) > maxScore) {
				name = key;
				maxScore = score.get(key);
			}
			totalScore += score.get(key);
		}
		//#2
		for (Map.Entry<String, Integer> entry: score.entrySet()) {
			if( entry.getValue() > maxScore) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
			totalScore += entry.getValue();
		}
		int avgScore = totalScore/score.size();
		
		System.out.println("평균 :" + avgScore);
		System.out.println("총점 :" + totalScore);
		System.out.println("최고점자 :" + name);
	}
}
