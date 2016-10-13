import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner
	{	
		static boolean questionsLeft =true;
		static String name;
		static int score;
		static int numOfQuestions;
		static int num=1;
		static int randomSub;
		static int randomMethod;
		static int studentAnswer;
		static int correctAnswer;
		static ArrayList<Integer> holdingAnswer = new ArrayList<Integer>();
		static String [] substantiations = {"Bird x= new Bird();","Bird x= new Penguin();","Penguin x= new Bird();","Penguin x = new Penguin();"};
		static String [] methodNames = {"ShowFeathers();","PeckBeak();","StatePenguin();"};
		static String [] answers = {"Waddle waddle waddle waddle","I am a penguin","Here are all my feathers","Ouch! Stop that","It will throw an error"};
		public static void main(String[] args)
			{
				greetUser();
				for(int i =0;i<=numOfQuestions;i++)
					{
				askQuestions();
				printAnswers();
				checkAnswer();
					}
				//gradeScore();
			}
		public static void greetUser()
			{
				System.out.println("Hi, Whats your name?");

				Scanner sc = new Scanner(System.in);
				name = sc.nextLine();
				System.out.println("Hi there " + name + "! " + "Let's learn about Polymorphism");
				System.out.println("How many questions would you like?");
				Scanner sc1 = new Scanner(System.in);
				numOfQuestions = sc.nextInt();
			}
		public static void askQuestions()
		{
				randomSub = (int)(Math.random()*4);
				randomMethod = (int)(Math.random()*3);
				System.out.println("If you were to substantiate " + substantiations[randomSub] + "..." );
				System.out.println("What would it print out if you ran x.run" + methodNames[randomMethod]+"?");
				if(randomSub==0&&randomMethod==0)
					{
						correctAnswer =2;
					}
				else if(randomSub==0&&randomMethod==1)
					{
						correctAnswer =3;
					}
				else if(randomSub==0&&randomMethod==2)
					{
						correctAnswer =4;
					}
				else if(randomSub==1&&randomMethod==0)
					{
						correctAnswer =2;
					}
				else if(randomSub==1&&randomMethod==1)
					{
						correctAnswer =0;
					}
				else if(randomSub==1&&randomMethod==2)
					{
						correctAnswer =1;
					}
				else if(randomSub==2&&randomMethod==0)
					{
						correctAnswer =4;
					}
				else if(randomSub==2&&randomMethod==1)
					{
						correctAnswer =4;
					}
				else if(randomSub==2&&randomMethod==2)
					{
						correctAnswer =4;
					}
				else if(randomSub==3&&randomMethod==0)
					{
						correctAnswer =2;
					}
				else if(randomSub==3&&randomMethod==1)
					{
						correctAnswer =0;
					}
				else if(randomSub==3&&randomMethod==2)
					{
						correctAnswer =1;
					}
				
				
		}
		public static void printAnswers()
		{
				while(num<=4)
					{
						
						int answerInt = (int)(Math.random()*4);
						
							if(holdingAnswer.size()==1)
								{
									if(answerInt==holdingAnswer.get(0))
										{
											printAnswers();
										}
									
									else
										{
											System.out.println("("+num+") " + answers[answerInt]);
											holdingAnswer.add(answerInt);
											num++;
										}
								}
						
						
							else if(holdingAnswer.size()==2)
								{
									if(answerInt==holdingAnswer.get(0)||answerInt==holdingAnswer.get(1))
										{
											printAnswers();
										}
									else
										{
											System.out.println("("+num+") " + answers[answerInt]);
											holdingAnswer.add(answerInt);
											num++;
										}
								}
						
						
							else if(holdingAnswer.size()==3)
								{
									if(answerInt==holdingAnswer.get(0)||answerInt==holdingAnswer.get(1)||answerInt==holdingAnswer.get(2))
										{
											printAnswers();
										}
									else
										{
											System.out.println("("+num+") " + answers[answerInt]);
											holdingAnswer.add(answerInt);
											num++;
										}
								}
						
						
							else if(holdingAnswer.size()==4)
								{
									if(answerInt==holdingAnswer.get(0)||answerInt==holdingAnswer.get(1)||answerInt==holdingAnswer.get(2)||answerInt==holdingAnswer.get(3))
										{
											printAnswers();
										}
									else
										{
											System.out.println("("+num+") " + answers[answerInt]);
											holdingAnswer.add(answerInt);
											num++;
										}
								}
						
						
						else
							{
								System.out.println("("+num+") " + answers[answerInt]);
								holdingAnswer.add(answerInt);
								num++;
							}
						}

			
					}
		public static void checkAnswer()
		{
			System.out.println("(5) "+answers[4]);
			Scanner sc = new Scanner(System.in);
			studentAnswer = sc.nextInt();
			if(answers[studentAnswer-1].equals(answers[correctAnswer]))
				{
					System.out.println("Correct!");
					score++;
				}
			else
				{
					System.out.println("Sorry that is not right!");
				}
		}

}
	
