package java01;

//Oueue : 순서가 있는 데이터들의 집합. FIFO방식으로 관리 
import java.util.LinkedList;
import java.util.Queue;


class Msg{
	String command;
	String to;
	
	public Msg(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
public class e28_QueueTest {
	public static void main(String[] args) {
		Queue<Msg> msgQueue = new LinkedList<Msg>();
		//offer : 객체를 큐에 넣음
		msgQueue.offer(new Msg("sendMail", "홍길동"));
		msgQueue.offer(new Msg("sendSMS","김자바"));
		msgQueue.offer(new Msg("sendKAKAO","박철수"));
		//peek() : 큐에서 객체를 하나가져옴, 객체를 큐에서 제거는 안함
		//poll() : 큐에서 객체를 하나가져옴, 객체를 큐에서 제거
		
		while(!msgQueue.isEmpty()) {
			Msg m = msgQueue.poll();
			switch(m.command) {
			case "sendMail" :
				System.out.println(m.to + "님께 메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(m.to + "님께 문자을 보냅니다.");
				break;
			case "sendKAKAO" :
				System.out.println(m.to + "님께 카톡을 보냅니다.");
				break;
			default:
				break;
			}
		}
	}
}
