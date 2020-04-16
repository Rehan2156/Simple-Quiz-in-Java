package quizPackage;
import java.util.*;

public class Solution {
	
	List<Layout> quesSet = new LinkedList<>();
	Map<Integer,String> ansMap = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	static int score =0 ;
	
	
	
	void add(int quesNo,String ques,String opa,String opb,String opc,String opd,String ans)
	{
	
	Layout q = new Layout();
	q.setQuesNo(quesNo);
	q.setQues(ques);
	List<String> opt = new ArrayList<String>();
	opt.add(opa);
	opt.add(opb);
	opt.add(opc);
	opt.add(opd);
	
	q.setOption(opt);
	quesSet.add(q);
	ansMap.put(quesNo,ans);	
	
	}
	
	
	
	void makeQues()
	{
		
		add(1, "Which is not a linear data structure?",
				"a) Array",
				"b) Linked List",
				"c) Tree",
				"d) Stack",
				"c"
				);
		
		
		add(2, "Which of the following is not a Java features?", 
				"a) Dynamic", 
				"b) Architecture Neutral", 
				"c) Use of pointers", 
				"d) Object-oriented",
				"c"
				);
		
		add(3, "A queue follows", 
				"a) FIFO (First In First Out) principle", 
				"b) LIFO (Last In First Out) principle", 
				"c) Ordered array", 
				"d) Linear tree", 
				"a"
				);
		
		add(4, "Which of the following c code is used to create new node?", 
				"a) ptr = (NODE*)malloc(sizeof(NODE));", 
				"b) ptr = (NODE*)malloc(NODE);", 
				"c) ptr = (NODE*)malloc(sizeof(NODE*));", 
				"d) ptr = (NODE)malloc(sizeof(NODE));", 
				"a"
				);
		
		add(5, "What is an AVL tree?", 
				"a) a tree with atmost 3 children", 
				"b) a tree which is unbalanced and is a height balanced tree", 
				"c) a tree with three children", 
				"d) a tree which is balanced and is a height balanced tree", 
				"d"
				);
		
	}
	
	
	
	
	void askForInput(int quesNo){
		System.out.println("Enter choice a/b/c/d");
		String ch = sc.next();
		checkAns(quesNo,ch);
	}
	
	
	
	void checkAns(int quesNo,String ch)
	{
		if(!(ch.equals("a") || ch.equals("b") ||ch.equals("c") ||ch.equals("d")))
			{
			System.out.println("Invalid choice! Try again");
			askForInput(quesNo);
			}
		else if(ch.compareTo(ansMap.get(quesNo))==0){
			System.out.println("Correct choice!\n");
			score++;
		}
		else
		{
			System.out.print("Wrong choice! ");
			System.out.println("Correct option is "+ansMap.get(quesNo)+"\n");
		}
	}
	
	
	
	
	void printOnScreen(){

		for(Layout l : quesSet){
			System.out.print(l.getQuesNo()+"]  ");
			System.out.println(l.getQues());
			for(String str : l.getOption())
				System.out.println(str);
			askForInput(l.getQuesNo());
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution obj = new Solution();
		System.out.println("****** QUIZ STARTS *******\n");
		obj.makeQues();
		obj.printOnScreen();
		System.out.println("\n YOUR SCORE IS : "+score);
		System.out.println("\n****** THANK YOU *******");
		sc.close();
	}

}
