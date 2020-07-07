
package onlinequize;

import java.util.Scanner;


public class Quizegame {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
         int countr,r,r1,count,i;
        countr=0;
        System.out.println("\t\t\tjava PROGRAM QUIZ GAME\n");
        System.out.println("\n\t\t________________________________________");
        System.out.println("\n\t\t\t   WELCOME");
        System.out.println("\n\t\t\t      to ");
        System.out.println("\n\t\t\t   THE GAME ");
        System.out.println("\n\t\t________________________________________");
        System.out.println("\n\t\t________________________________________");
        System.out.println("\n\t\t   BECOME A MILLIONAIRE!!!!!!!!!!!   ");
        System.out.println("\n\t\t________________________________________");
        System.out.println("\n\t\t________________________________________");
        System.out.println("\n\t\t > Press S to start the game");
        System.out.println("\n\t\t > Press V to view the highest score");
        System.out.println("\n\t\t > Press R to reset score");
        System.out.println("\n\t\t > press H for help            ");
        System.out.println("\n\t\t > press Q to quit             ");
        System.out.println("\n\t\t________________________________________\n\n");
        
        String c,n;
        System.out.println("please enter your choice :");
        c=input.nextLine();
        if(c.equals("S")){
            System.out.println("\"\n\n\n\n\n\n\n\n\n\n\t\t\tResister your name:");
            n=input.nextLine();
            System.out.println("\n ------------------  Welcome %s to java Program Quiz Game --------------------------");
            System.out.println("\n\n Here are some tips you might wanna know before playing:");
   
            System.out.println("\n -------------------------------------------------------------------------");
            System.out.println("\n >> There are 2 rounds in this Quiz Game,WARMUP ROUND & CHALLANGE ROUND");
            System.out.println("\n >> In warmup round you will be asked a total of 3 questions to test your");
            System.out.println("\n    general knowledge. You are eligible to play the game if you give atleast 2");
            System.out.println("\n    right answers, otherwise you can't proceed further to the Challenge Round.");
            System.out.println("\n >> Your game starts with CHALLANGE ROUND. In this round you will be asked a");
            System.out.println("\n    total of 10 questions. Each right answer will be awarded $100,000!");
            System.out.println("\n    By this way you can win upto ONE MILLION cash prize!!!!!..........");
            System.out.println("\n >> You will be given 4 options and you have to press A, B ,C or D for the");
            System.out.println("\n    right option.");
            System.out.println("\n >> You will be asked questions continuously, till right answers are given");
            System.out.println("\n >> No negative marking for wrong answers!");
            System.out.println("\n\n\t!!!!!!!!!!!!! ALL THE BEST !!!!!!!!!!!!!");
            System.out.println("\n\n\n Press Y  to start the game!\n");
            System.out.println("\n Press any other key to return to the main menu!");
         
          count=0;
          String z;
            for (int l = 1; l <=3; l++) {
                r1=1;
                switch(r1){
                    case 1:
		
                        System.out.println("\n\nWhich of the following is a Palindrome number?");
		                      System.out.println("\n\nA.42042\t\tB.101010\n\nC.23232\t\tD.01234");
                                      System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("C"))
			{
			                         System.out.println("\n\nCorrect!!!");count++;
			    
			    break;
}
		else
		       {
		                         System.out.println("\n\nWrong!!! The correct answer is C.23232");
		           
		       break;
		       }
                case 2:
		                  System.out.println("\n\n\nThe country with the highest environmental performance index is...");
		                  System.out.println("\n\nA.France\t\tB.Denmark\n\nC.Switzerland\t\tD.Finland");
                                  System.out.println("answer :");
                                      z=input.nextLine();
                                  
		if (z.equals("C"))
			{
                            System.out.println("\n\nCorrect!!!");count++;
			
			break;
                        }
		else
		       {
                           System.out.println("\n\nWrong!!! The correct answer is C.Switzerland");
		       
		       break;
                       }
                 case 3:
		                   System.out.println("\n\n\nWhich animal laughs like human being?");
		                   System.out.println("\n\nA.Polar Bear\t\tB.Hyena\n\nC.Donkey\t\tD.Chimpanzee");
                                   System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("B"))
			{
                            System.out.println("\n\nCorrect!!!");count++;
			
			break;
                        }
		else
		       {
                           System.out.println("\n\nWrong!!! The correct answer is B.Hyena");
		       
		       break;
                       }

        case 4:
		          System.out.println("\n\n\nWho was awarded the youngest player award in Fifa World Cup 2006?");
		          System.out.println("\n\nA.Wayne Rooney\t\tB.Lucas Podolski\n\nC.Lionel Messi\t\tD.Christiano Ronaldo");
                          System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("B"))
			{
                            System.out.println("\n\nCorrect!!!");count++;
			
			 break;
                        }
		else
		       {
                           System.out.println("\n\nWrong!!! The correct answer is B.Lucas Podolski");
		       
		       break;}

        case 5:
            System.out.println("\n\n\nWhich is the third highest mountain in the world?");
            System.out.println("\n\nA.Mt. K2\t\tB.Mt. Kanchanjungha\n\nC.Mt. Makalu\t\tD.Mt. Kilimanjaro");
            System.out.println("answer :");
                z=input.nextLine();
        if(z.equals("B"))
               {
                   System.out.println("\n\nCorrect!!!");count++;
               
                break;}
        else
		       {System.out.println("\n\nWrong!!! The correct answer is B.Mt. Kanchanjungha");
		       
		       break;}

        case 6:
		          System.out.println("\n\n\nWhat is the group of frogs known as?");
		          System.out.println("\n\nA.A traffic\t\tB.A toddler\n\nC.A police\t\tD.An Army");
                          System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("D") )
			{System.out.println("\n\nCorrect!!!");count++;
			
			break;}
		else
		       {System.out.println("\n\nWrong!!! The correct answer is D.An Army");
		      
		       break;
                       
		       }



		       }

                }
            System.out.println("correct ans is:"+count);
            if(count>=2){
                System.out.println("");
                
                    System.out.println("\n\n\t*** CONGRATULATION %s you are eligible to play the Game ***");
                    System.out.println("\n\n\n\n\t!Press any key to Start the Game!");
                    
                    
                    //1
		                  System.out.println("\n\nWhat is the National Game of England?");
		                  System.out.println("\n\nA.Football\t\tB.Basketball\n\nC.Cricket\t\tD.Baseball");
                                  System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("C"))
			{
                            System.out.println("\n\nCorrect!!!");countr++;
			 }
		else
                {
                    System.out.println("\n\nWrong!!! The correct answer is C.Cricket");
		       
		       }

		//case 2:
		                  System.out.println("\n\n\nStudy of Earthquake is called............,");
		                  System.out.println("\n\nA.Seismology\t\tB.Cosmology\n\nC.Orology\t\tD.Etimology");
                                  System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("A"))
			{
                            System.out.println("\n\nCorrect!!!");countr++;
			 }
		else
		       {
                           System.out.println("\n\nWrong!!! The correct answer is A.Seismology");
		     
		      
		       }

        //case 3:
		                  System.out.println("\n\n\nAmong the top 10 highest peaks in the world, how many lie in Nepal? ");
		                  System.out.println("\n\nA.6\t\tB.7\n\nC.8\t\tD.9");
                                  System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("C"))
			{
                            System.out.println("\n\nCorrect!!!");countr++;
			 }
		else
		       {
                           System.out.println("\n\nWrong!!! The correct answer is C.8");
		       
		       }

        //case 4:
		                  System.out.println("\n\n\nThe Laws of Electromagnetic Induction were given by?");
		                  System.out.println("\n\nA.Faraday\t\tB.Tesla\n\nC.Maxwell\t\tD.Coulomb");
                System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("A"))
			{
                            System.out.println("\n\nCorrect!!!");countr++;
			 }
		else
		       {
                           System.out.println("\n\nWrong!!! The correct answer is A.Faraday");
		       
		       
		       }

        //case 5:
		 System.out.println("\n\n\nIn what unit is electric power measured?");
	 System.out.println("\n\nA.Coulomb\t\tB.Watt\n\nC.Power\t\tD.Units");
                System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("B"))
			{ 
                            System.out.println("\n\nCorrect!!!");countr++;
                        }
		else
		       {
		            System.out.println("\n\nWrong!!! The correct answer is B.Power");
		       
		       }

		//case 6:
		 System.out.println("\n\n\nWhich element is found in Vitamin B12?");
		 System.out.println("\n\nA.Zinc\t\tB.Cobalt\n\nC.Calcium\t\tD.Iron");
                System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("B") )
			{ 
                            System.out.println("\n\nCorrect!!!");countr++;
			 }
		else
		       { 
                           System.out.println("\n\nWrong!!! The correct answer is B.Cobalt");
		       
		       }

       // case 7:
		 System.out.println("\n\n\nWhat is the National Name of Japan?");
		 System.out.println("\n\nA.Polska\t\tB.Hellas\n\nC.Drukyul\t\tD.Nippon");
                System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("D"))
                { 
                    System.out.println("\n\nCorrect!!!");countr++;
			 }
		else
		       { 
                           System.out.println("\n\nWrong!!! The correct answer is D.Nippon");
		      
		       }

       // case 8:
		 System.out.println("\n\n\nHow many times a piece of paper can be folded at the most?");
		 System.out.println("\n\nA.6\t\tB.7\n\nC.8\t\tD.Depends on the size of paper");
                System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("B"))
			{
                            System.out.println("\n\nCorrect!!!");countr++; 
                        }
		else
		       {
                           System.out.println("\n\nWrong!!! The correct answer is B.7");
		       
		       }

        //case 9:
		 System.out.println("\n\n\nWhat is the capital of Denmark?");
		 System.out.println("\n\nA.Copenhagen\t\tB.Helsinki\n\nC.Ajax\t\tD.Galatasaray");
                System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("A"))
			{
                            System.out.println("\n\nCorrect!!!");countr++;
			}
		else
		       { 
                           System.out.println("\n\nWrong!!! The correct answer is A.Copenhagen");
		    
		    }

        //case 10:
		 System.out.println("\n\n\nWhich is the longest River in the world?");
		 System.out.println("\n\nA.Nile\t\tB.Koshi\n\nC.Ganga\t\tD.Amazon");
                System.out.println("answer :");
                                      z=input.nextLine();
                
		if (z.equals("A"))
			{ 
                            System.out.println("\n\nCorrect!!!");countr++;
                        }
		else
		       { 
                           System.out.println("\n\nWrong!!! The correct answer is A.Nile");
                       }

       // case 11:
		 System.out.println("\n\n\nWhat is the color of the Black Box in aeroplanes?");
		 System.out.println("\n\nA.White\t\tB.Black\n\nC.Orange\t\tD.Red");
                System.out.println("answer :");
                                      z=input.nextLine();
                
		if (z.equals("C"))
			{ 
                            System.out.println("\n\nCorrect!!!");countr++;
			 }
		else
              { 
                  System.out.println("\n\nWrong!!! The correct answer is C.Orange");
              }

        //case 12:
		 System.out.println("\n\n\nWhich city is known at 'The City of Seven Hills'?");
		 System.out.println("\n\nA.Rome\t\tB.Vactican City\n\nC.Madrid\t\tD.Berlin");
                System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("A"))
			  { 
                              System.out.println("\n\nCorrect!!!");countr++;
			 }
		else
              { 
                  System.out.println("\n\nWrong!!! The correct answer is A.Rome");
            }

		//case 13:
		 System.out.println("\n\n\nName the country where there no mosquitoes are found?");
		 System.out.println("\n\nA.Japan\t\tB.Italy\n\nC.Argentina\t\tD.France");
                System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("D"))
			{ 
                            System.out.println("\n\nCorrect!!!");countr++;
			}
		else
		       {
                           System.out.println("\n\nWrong!!! The correct answer is D.France");
		      }

        //case 14:
		 System.out.println("\n\n\nWho is the author of 'Pulpasa Cafe'?");
		 System.out.println("\n\nA.Narayan Wagle\t\tB.Lal Gopal Subedi\n\nC.B.P. Koirala\t\tD.Khagendra Sangraula");
                System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("A"))
			{
                            System.out.println("\n\nCorrect!!!");countr++;
			 }
		else
		       {
                           System.out.println("\n\nWrong!!! The correct answer is A.Narayan Wagle");
		      }

		//case 15:
		 System.out.println("\n\n\nWhich Blood Group is known as the Universal Recipient?");
		 System.out.println("\n\nA.A\t\tB.AB\n\nC.B\t\tD.O");
                System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("B"))
			{
                            System.out.println("\n\nCorrect!!!");countr++;
			}
		else
		       {
                           System.out.println("\n\nWrong!!! The correct answer is B.AB");
		       
		      }

		//case 16:
		 System.out.println("\n\n\nWhat is the unit of measurement of distance between Stars?");
		 System.out.println("\n\nA.Light Year\t\tB.Coulomb\n\nC.Nautical Mile\t\tD.Kilometer");
                System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("A"))
			{
                            System.out.println("\n\nCorrect!!!");countr++;
			}
		else
		       {
                           System.out.println("\n\nWrong!!! The correct answer is A.Light Year");
		      }


		//case 17:
		 System.out.println("\n\n\nThe country famous for Samba Dance is........");
		 System.out.println("\n\nA.Brazil\t\tB.Venezuela\n\nC.Nigeria\t\tD.Bolivia");
                System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("A"))
			{
                            System.out.println("\n\nCorrect!!!");countr++;
			}
		else
		       { 
                           System.out.println("\n\nWrong!!! The correct answer is A.Brazil");
		      }

		//case 18:
		 System.out.println("\n\n\nWind speed is measure by__________?");
		 System.out.println("\n\nA.Lysimeter\t\tB.Air vane\n\nC.Hydrometer\t\tD.Anemometer\n\n");
                System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("D"))
			{ 
                            System.out.println("\n\nCorrect!!!");countr++;
			}
		else
		       { 
                           System.out.println("\n\nWrong!!! The correct answer is D.Anemometer");
		     }

		//case 19:
		 System.out.println("\n\n\nWhich city in the world is popularly known as The City of Temple?");
		 System.out.println("\n\nA.Delhi\tB.Bhaktapur\n\nC.Kathmandu\tD.Agra\n\n");
                System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("C"))
			{
                            System.out.println("\n\nCorrect!!!");countr++;
			}
		else
		       {
                           System.out.println("\n\nWrong!!! The correct answer is C.Kathmandu");
		      }

		//case 20:
		System.out.println("\n\n\nWhich hardware was used in the First Generation Computer?");
		System.out.println("\n\nA.Transistor\t\tB.Valves\n\nC.I.C\t\tD.S.S.I");
                 System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("B"))
			{
                            System.out.println("\n\nCorrect!!!");countr++;
			}
		else
		       {
                           System.out.println("\n\nWrong!!! The correct answer is B.Valves");
		       }

		//case 21:
		System.out.println("\n\n\nOzone plate is being destroyed regularly because of____ ?");
		System.out.println("\n\nA.L.P.G\t\tB.Nitrogen\n\nC.Methane\t\tD. C.F.C");
                System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("D"))
			{
                            System.out.println("\n\nCorrect!!!");countr++;
			}
		else
		       {
                           System.out.println("\n\nWrong!!! The correct answer is D. C.F.C");
		       }

		//case 22:
		System.out.println("\n\n\nWho won the Women's Australian Open Tennis in 2007?");
		System.out.println("\n\nA.Martina Hingis\t\tB.Maria Sarapova\n\nC.Kim Clijster\t\tD.Serena Williams");
                System.out.println("answer :");
                                      z=input.nextLine();
		if (z.equals("D"))
			{
                            System.out.println("\n\nCorrect!!!");countr++;
			}
		else
		       {
                           System.out.println("\n\nWrong!!! The correct answer is D.Serena Williams");
                       
                       }
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
    
               
                } else{
                     System.out.println("\n\nSORRY YOU ARE NOT ELIGIBLE TO PLAY THIS GAME, BETTER LUCK NEXT TIME");
}
                //score
                int score;
                System.out.println("your correct ans is :"+countr);
         
                score=countr*100000;
                 System.out.println("your total score :"+score);
              if(score>0.00 && score<1000000)
	{
	   	   System.out.println("\n\n\t\t**************** CONGRATULATION *****************");

	     System.out.println("\n\t You won $%.2f");}

	 else if(score==1000000.00)
	{
	 System.out.println("\n\n\n \t\t**************** CONGRATULATION ****************");
	  System.out.println("\n\t\t\t\t YOU ARE A MILLIONAIRE!!!!!!!!!");
	   System.out.println("\n\t\t You won $%.2f");
	    System.out.println("\t\t Thank You!!");
	}
	 else
{
	 System.out.println("\n\n\t******** SORRY YOU DIDN'T WIN ANY CASH ********");
	    System.out.println("\n\t\t Thanks for your participation");
	    System.out.println("\n\t\t TRY AGAIN");}   
                
                
                
            }
        else if(c.equals("H")){
                System.out.println("\n\n                              HELP");
       System.out.println("\n -------------------------------------------------------------------------");
       System.out.println("\n ......................... C program Quiz Game...........");
       System.out.println("\n >> There are two rounds in the game, WARMUP ROUND & CHALLANGE ROUND");
       System.out.println("\n >> In warmup round you will be asked a total of 3 questions to test your general");
       System.out.println("\n    knowledge. You will be eligible to play the game if you can give atleast 2");
       System.out.println("\n    right answers otherwise you can't play the Game...........");
       System.out.println("\n >> Your game starts with the CHALLANGE ROUND. In this round you will be asked");
      System.out.println("\n    total 10 questions each right answer will be awarded $100,000.");
       System.out.println("\n    By this way you can win upto ONE MILLION cash prize in USD...............");
      System.out.println("\n >> You will be given 4 options and you have to press A, B ,C or D for the");
       System.out.println("\n    right option");
       System.out.println("\n >> You will be asked questions continuously if you keep giving the right answers.");
       System.out.println("\n >> No negative marking for wrong answers");

	   System.out.println("\n\n\t*********************BEST OF LUCK*********************************");
	   System.out.println("\n\n\t*****C PROGRAM QUIZ GAME is developed by CODE WITH C TEAM********");
            
        }
        
        
        
        
    }



}