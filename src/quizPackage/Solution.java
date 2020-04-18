package quizPackage;
import java.util.*;

public class Solution {
	
	List<Layout> quesSet = new LinkedList<>();
	Map<Integer,String> ansMap = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	int score =0 ;
	int rollNo;
	String name;
	
	
	
	void add(final int quesNo,final String ques,final String opa,final String opb,final String opc,final String opd,final String ans)
	{
	
	final Layout q = new Layout();
	q.setQuesNo(quesNo);
	q.setQues(ques);
	final List<String> opt = new ArrayList<String>();
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
				"    a) Array",
				"    b) Linked List",
				"    c) Tree",
				"    d) Stack",
				"c"
				);
		
		
		add(2, "Which of the following is not a Java features?", 
				"    a) Dynamic", 
				"    b) Architecture Neutral", 
				"    c) Use of pointers", 
				"    d) Object-oriented",
				"c"
				);
		
		add(3, "A queue follows", 
				"    a) FIFO (First In First Out) principle", 
				"    b) LIFO (Last In First Out) principle", 
				"    c) Ordered array", 
				"    d) Linear tree", 
				"a"
				);
		
		add(4, "Which of the following c code is used to create new node?", 
				"    a) ptr = (NODE*)malloc(sizeof(NODE));", 
				"    b) ptr = (NODE*)malloc(NODE);", 
				"    c) ptr = (NODE*)malloc(sizeof(NODE*));", 
				"    d) ptr = (NODE)malloc(sizeof(NODE));", 
				"a"
				);
		
		add(5, "What is an AVL tree?", 
				"    a) a tree with atmost 3 children", 
				"    b) a tree which is unbalanced and is a height balanced tree", 
				"    c) a tree with three children", 
				"    d) a tree which is balanced and is a height balanced tree", 
				"d"
				);
		
		add(6, "Which of the following for loop declaration is not valid?",
				"    a) for ( int i = 99; i >= 0; i / 9 )",
				"    b) for ( int i = 7; i <= 77; i += 7 )",
				"    c) for ( int i = 20; i >= 2; - -i )",
				"    d) for ( int i = 2; i <= 20; i = 2* i )",
				"a"
				);

		add(7, "Which of these best describes an array?",
				"    a) A data structure that shows a hierarchical behaviour",
				"    b) Container of objects of similar types",
				"    c) Arrays are immutable once initialised",
				"    d) Array is not a data structure",
				"b"
				);

		add(8, "The data structure required to check whether an expression contains balanced parenthesis is?",
				"    a) Queue",
				"    b) Stack",
				"    c) Linked List",
				"    d) Array",
				"b"
				);

		add(9, "What is a skip list?",
				"    a) a linkedlist with size value in nodes",
				"    b) a linkedlist that allows faster search within an ordered sequence",
				"    c) a linkedlist that allows slower search within an ordered sequence",
				"    d) a tree which is in the form of linked list",
				"b"
				);

		add(10, "Which of the following is the most widely used external memory data structure?",
				"    a) AVL tree",
				"    b) B-Tree",
				"    c) Red-Black Tree",
				"    d) Both AVL tree and Red-black tree",
				"b"
				);

		add(11, "Which of the following is true?",
				"    a) B + tree allows only the rapid random access",
				"    b) B + tree allows only the rapid sequential access",
				"    c) B + tree allows rapid random access as well as rapid sequential access",
				"    d) B + tree allows rapid random access and slower sequential access",
				"c"
				);

		add(12, "Which of the following is false about a binary search tree?",
				"    a) The left child is always lesser than its parent",
				"    b) The right child is always greater than its parent",
				"    c) The left and right sub-trees should also be binary search trees",
				"    d) In order sequence gives decreasing order of elements",
				"d"
				);

		add(13, "What is the speciality about the inorder traversal of a binary search tree?",
				"    a) It traverses in a non increasing order",
				"    b) It traverses in an increasing order",
				"    c) It traverses in a random fashion",
				"    d) It traverses based on priority of the node",
				"b"
				);

		add(14, "What is a hash table?",
				"    a) A structure that maps values to keys",
				"    b) A structure that maps keys to values",
				"    c) A structure used for storage",
				"    d) A structure used to implement stack and queue",
				"b"
				);

		add(15, "Which of these statement is incorrect?",
				"    a) Every class must contain a main() method",
				"    b) Applets do not require a main() method at all",
				"    c) There can be only one main() method in a program",
				"    d) main() method must be made public",
				"a"
				);
	}
	
	
	
	
	void askForInput(final int quesNo){
		System.out.println("Enter choice a/b/c/d");
		final String ch = sc.next();
		checkAns(quesNo,ch);
	}
	
	
	
	void checkAns(final int quesNo,final String ch)
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

		for(final Layout l : quesSet){
			System.out.print(l.getQuesNo()+"]  ");
			System.out.println(l.getQues());
			for(final String str : l.getOption())
				System.out.println(str);
			askForInput(l.getQuesNo());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution[] obj = new Solution[6];
		int n=0;
		char ans;
		do
		{
			obj[n] = new Solution();
			System.out.println("\n******* LOGIN *******");
			System.out.println("Roll No.=");
			obj[n].rollNo=sc.nextInt();
			System.out.println("\nName=");
			obj[n].name=sc.next();
			System.out.println("******* QUIZ STARTS *******\n");
			obj[n].makeQues();
			obj[n].printOnScreen();
			System.out.println("\n YOUR SCORE IS : "+obj[n].score);
			System.out.println("\n******* THANK YOU *******");
			System.out.println("Do you want to give the test again?");
			ans=sc.next().charAt(0);
			n++;
		}
		while(ans=='y');

		Solution temp=new Solution();

		for(int j=0; j<n; j++)					//Sorts the objects according to score in descending
		{							//order
			for(int k=j+1; j<n; j++)
			{
				if(obj[j].score<obj[k].score)
				{
					temp=obj[j];
					obj[j]=obj[k];
					obj[k]=temp;
				}
			}
		}
		System.out.println("\n******* RESULTS *******\n");
		for(int j=1; j<=n; j++)
		{
			System.out.println(j+"\t"+obj[j-1].rollNo+"\t"+obj[j-1].name+"\t"+obj[j-1].score);
		}
		sc.close();
	}

}
