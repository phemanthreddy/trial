package Question2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Question {
	private int questionId;
	private String question;
	private List<String> answers;
	private Set<String> answers1;
	private Map<Integer, String> answers3;

	public Question(int questionId, String question, List<String> answers, Set<String> answers1,
			Map<Integer, String> answers3) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
		this.answers1 = answers1;
		this.answers3 = answers3;
	}

	public void display() {
		System.out.println(questionId + " " + question);
		System.out.println("answers are:");
		Iterator<String> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		Iterator<String> itr1 = answers1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		Set<Entry<Integer, String>> set = answers3.entrySet();
		Iterator<Entry<Integer, String>> itr3 = set.iterator();
		while (itr3.hasNext()) {
			Entry<Integer, String> entry = itr3.next();
			System.out.println("Answer:" + entry.getKey() + " " + entry.getValue());
		}
	}
}

public class Question2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Question2.xml");
		Question question = (Question) context.getBean("question");
		question.display();

	}

}