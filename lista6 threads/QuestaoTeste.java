
public class QuestaoTeste {

	public static void main(String[] args) {
		
		
		Questao q1 = new Questao(1,999);
		Questao q2 = new Questao(1001,2000);
		Thread  ques = new Thread(q1);
		Thread  ques1 = new Thread(q2);
		ques.start();
		try {
			ques.join();
		} catch (InterruptedException e) {
		}
		ques1.start();
		
		
		
	}

}
