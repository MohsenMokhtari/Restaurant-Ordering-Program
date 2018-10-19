import java.util.*;
public class person {
	private static Scanner input;
	private static Scanner sc;
	private static Scanner inputt;

	public static void main (String[] args){
		
		input = new Scanner(System.in);
		
	    int a,b,c,d,e,f,g,h,j,k,l,m,n,o,p,s,x;
	    int basket = 0;
	    long r;
	    String Adress;
	    int pricefastbreakfast = 9;
	    int pricesteak = 22;  // THIS IS FOR CAMPAIGN 
	    
	    int fastCounter = 0;
	    int bigCounter = 0;
	    int onlycheeseCounter = 0;
	    int mixedCounter = 0;
	    int sucukcheeseCounter = 0;
	    int bigdaddyCounter = 0;
	    int cheeseburgerCounter = 0;
	    int hamburgerCounter = 0;
	    int mexicanCounter = 0;
	    int koriCounter = 0;
	    int steakCounter = 0;
	    int alfredoCounter = 0;
	    int napolitanCounter = 0;
	    int bologneseCounter = 0;
	    int arabiataCounter = 0;
	    int sutlacCounter = 0;
	    int kazandibiCounter = 0;
	    int trileceCounter = 0;
	    int sufleCounter = 0;
	    int teaCounter = 0;
	    int coffeCounter = 0;
	    int salepCounter = 0;
	    int colaCounter = 0;
	    int fantaCounter = 0;
	    int spriteCounter = 0;
	    int hotwineCounter = 0;
	    int beerCounter = 0;
	    int vodkaCounter = 0;
	    int wineCounter = 0;
	    int tequilaCounter = 0;
	    int whiskeyCounter = 0;
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	        do{
	        	
		
		
		
	    System.out.println("Hello Mr or Mrs Customer. Welcome to our restourant. Please press 1 to see the menus." );
	    
		    
		    a = input.nextInt();
		    while(a==1)
		    if(a==1){
		     
		    System.out.println("This is the Eat menu. Press the numbers which you want.");    
		    
		    System.out.println("1-Breakfasts");
		    System.out.println("2-Sandwiches");
		    System.out.println("3-Burgers");
		    System.out.println("4-Special Meals (NEW!! There is Campaign product here!!)");
		    System.out.println("5-Pastas");
		    System.out.println("6-Sweets");
			System.out.println("Press 7 then 2 to see Drink Menu");
			
		                      b = input.nextInt();
		                      if(b==1){
		    	              System.out.println("***THESE ARE THE BREAKFASTS***");
		    	              System.out.println("1-Fast Breakfast = 9TL");
		    	              System.out.println("2-Big Breakfast = 12TL");
		    
		                         c = input.nextInt();
		                               if(c==1){ fastCounter++;
		    	                       basket = pricefastbreakfast + basket;}
		                               
		    
		                               else if(c==2){bigCounter++;
		    	                       basket = 12 + basket;}
		                                }
		                      
		                      else if(b==2){ 
		                    	  System.out.println("***THESE ARE THE SANDWICHES***"); 
		                    	System.out.println("1-Only Cheese Sandwich = 10TL");  
		                    	System.out.println("2-Mixed Sandwich = 12TL");  
		                    	System.out.println("3-Sucuk & Cheese Sandwich = 10TL");  
		                    	       
		                    	  d = input.nextInt();
		                                  if(d==1){
		                                	onlycheeseCounter++;  
		                                  basket = 10 + basket;}
		                                  else if(d==2){mixedCounter++;
		                                  basket = 12 + basket;
		                                  }
		                                  else if(d==3){sucukcheeseCounter++;
		                                basket = 10 + basket;
		                                  }
		                      }
		                      else if(b==3){         
		                    	  System.out.println("***THESE ARE THE BURGERS***");
		                    	  System.out.println("1-Big Daddy Burger = 15TL");  
		                          System.out.println("2-CheeseBurger = 15TL");  
		                          System.out.println("3-Hamburger = 12TL");  
		                                                   
		                          e = input.nextInt();
		                          if(e==1){bigdaddyCounter++;
		                           basket = 15 + basket;}
		                          else if(e==2){cheeseburgerCounter++;
		                        	  basket = 15 + basket;}
		                          else if(e==3){hamburgerCounter++;
		                        	  basket = 12 + basket;}
		                          }
		                          
		                      else if(b==4){ 
		                    	  System.out.println("***THESE ARE THE CHICKENS***"); 
		                    	  System.out.println("***We have Campaign on Steak with Tomato souge. If you buy 1x Mexican Chicken, you will be able to buy Steak with Tomato Souge for ONLY 15 TL!!!!***"); 
		                    	  System.out.println("1-Mexican Chicken = 15TL");  
		                          System.out.println("2-Kˆri Chicken = 16TL");  
		                          System.out.println("3-Steak with Tomato Souge = 22TL");
		                          
		                          f = input.nextInt();
		                          if(f==1){mexicanCounter++;
		                              pricesteak = pricesteak - 7;
		                              basket = 15 + basket;}
		                          else if(f==2){koriCounter++;
		                        	  basket = 16 + basket;}
		                          else if(f==3){steakCounter++;
		                        	  basket = pricesteak + basket;}
		                          }
		                      else if(b==5){
		                    	  System.out.println("***THESE ARE THE PASTAS***"); 
		                    	  System.out.println("1-Penne Alfredo = 15TL");  
		                          System.out.println("2-Napolitan Pasta = 14TL");  
		                          System.out.println("3-Bolognes Pasta = 16TL");
		                          System.out.println("4-Penne Arabiata 17TL");
		                          g = input.nextInt();
		                          if(g==1){alfredoCounter++;
		                        	  basket = 15 + basket;}
		                          else if(g==2){napolitanCounter++;
		                        	  basket = 14 + basket;}
		                          else if(g==3){bologneseCounter++;
		                        	  basket = 16 + basket;}
		                          else if(g==4){arabiataCounter++;
		                        	  basket = 17 + basket;}
		                          }
		                      else if(b==6){
		                    	  System.out.println("***THESE ARE THE SWEETS***"); 
		                    	  System.out.println("1-S¸tlaÁ = 5TL");  
		                          System.out.println("2-Kazandibi = 7TL");  
		                          System.out.println("3-TrileÁe = 10TL");
		                          System.out.println("4-Suffle = 12TL");
		                          h = input.nextInt();
		                          if(h==1){sutlacCounter++;
		                        	  basket = 5 + basket;}
		                          else if(h==2){kazandibiCounter++;
		                        	  basket = 7 + basket;}
		                          else if(h==3){trileceCounter++;
		                        	  basket = 10 + basket;}
		                          else if(h==4){sufleCounter++;
		                        	  basket = 12 + basket;}
		                    	  }
		                      else if(b==7){
		                    	  break;
		                    	 }
		                         }
		    
		    a = input.nextInt();
		    while(a==2)
		    if(a==2){
		     System.out.println("This is the Drink Menu. Press the numbers which you want.");    
		    
		    System.out.println("1-Hot Without Alcohol");
		    System.out.println("2-Cold Without Alcohol");
		    System.out.println("3-Hot With Alcohol");
		    System.out.println("4-Cold with Alcohol");
		    System.out.println("Press 5 then 1, If you have choosed your wantings and want to see price :) ");
		  
		    
		                  
		                          j = input.nextInt(); 
		                          if(j==1){
		                        	  System.out.println("***THESE ARE THE HOT DRINKS***"); 
		                        	  System.out.println("1-Tea = 2TL");  
		                              System.out.println("2-Coffee = 5TL");  
		                              System.out.println("3-Salep = 5TL");
		                              k = input.nextInt();
		                              if(k==1){teaCounter++;
		                            	  basket = 2 + basket;}
		                              else if(k==2){coffeCounter++;
		                            	  basket = 5 + basket;}
		                              else if(k==3){salepCounter++;
		                            	  basket = 5 + basket;}
		                               }
		                          else if(j==2){
		                        	  System.out.println("***THESE ARE THE COLD DRINKS***"); 
		                        	  System.out.println("1-Coca Cola = 3TL");  
		                              System.out.println("2-Sprite = 3TL");  
		                              System.out.println("3-Fanta = 3TL");
		                              l = input.nextInt();
		                              if(l==1){colaCounter++;
		                            	  basket = 2 + basket;}
		                              else if(l==2){spriteCounter++;
		                            	  basket = 5 + basket;}
		                              else if(l==3){fantaCounter++;
		                            	  basket = 5 + basket;}
		                          }
		                              else if(j==3){
		                            	  System.out.println("*THIS IS ONLY HOT DRINK WITH ALCOHOL*"); 
		                        	   System.out.println("1-Hot Wine = 14TL");  
		                               m = input.nextInt();
		                               if(m==1){hotwineCounter++;
		                             	  basket = 14 + basket;}
		                                }
		                              else if(j==4){
		                            	  System.out.println("***THESE ARE THE ALCOHOLS***"); 
		                            	  System.out.println("1-Beer = 10TL");  
		                                  System.out.println("2-Vodka = 15TL");  
		                                  System.out.println("3-Wine = 13TL");
		                                  System.out.println("4-Tequila = 3TL");
		                                  System.out.println("5-Whiskey = 20TL");
		                                  n = input.nextInt();
		                                  if(n==1){beerCounter++;
		                                	  basket = 10 + basket;}
		                                  else if(n==2){vodkaCounter++;
		                                	  basket = 15 + basket;}
		                                  else if(n==3){wineCounter++;
		                                	  basket = 13 + basket;}
		                                  else if(n==4){tequilaCounter++;
		                                	  basket = 3 + basket;}
		                                  else if(n==5){whiskeyCounter++;
		                                	  basket = 20 + basket;}
		                                  
		                                  }
		                                else if(j==5){
		                                	break;
		                                }
		                               
		                                }
		    
		                                  

		    
		    
		            
		              sc = new Scanner(System.in);
		              o = input.nextInt();          
		              if(o==1){
		            	  
		            	  if(fastCounter>=1){
		            	  System.out.println(fastCounter + "x Fast Breakfast");
		            	  }
		            	  if(bigCounter>=1){
		            	  System.out.println(bigCounter + "x Big Breakfast");  
		            	  }
		            	  if(onlycheeseCounter>=1){
		            		  System.out.println(onlycheeseCounter + "x Only Cheese Sandwich");
		            	  }
		            	  if(mixedCounter>=1){
		            		  System.out.println(mixedCounter + "x Mixed Sandwich");
		            	  }
		            	  if(sucukcheeseCounter>=1){
		            		  System.out.println(fastCounter + "x Sucuk & Cheese Sandwich");
		            	  }
		            	  if(bigdaddyCounter>=1){
		            		  System.out.println(bigdaddyCounter + "x Big Daddy Burger");
		            	  }
		            	  if(cheeseburgerCounter>=1){
		            		  System.out.println(cheeseburgerCounter + "x Cheeseburger");
		            	  }
		            	  if(hamburgerCounter>=1){
		            		  System.out.println(hamburgerCounter + "x Hamburger");
		            	  }
		            	  if(mexicanCounter>=1){
		            		  System.out.println(mexicanCounter + "x Mexican Chicken");
		            	  }
		            	  if(koriCounter>=1){
		            		  System.out.println(koriCounter + "x Kori Chicken");
		            	  }
		            	  if(steakCounter>=1){
		            		  System.out.println(steakCounter + "x Steak with Tomato Souge");
		            	  }
		            	  if(alfredoCounter>=1){
		            		  System.out.println(alfredoCounter + "x Penne Alfredo");
		            	  }
		            	  if(napolitanCounter>=1){
		            		  System.out.println(napolitanCounter + "x Napolitan Pasta");
		            	  }
		            	  if(bologneseCounter>=1){
		            		  System.out.println(bologneseCounter + "x Bolognese Pasta");
		            	  }
		            	  if(arabiataCounter>=1){
		            		  System.out.println(arabiataCounter + "x Penne Arabiata");
		            	  }
		            	  if(sutlacCounter>=1){
		            		  System.out.println(sutlacCounter + "x Sutlac");
		            	  }
		            	  if(kazandibiCounter>=1){
		            		  System.out.println(kazandibiCounter + "x Kazandibi");
		            	  }
		            	  if(trileceCounter>=1){
		            		  System.out.println(trileceCounter + "x Trilece");
		            	  }
		            	  if(sufleCounter>=1){
		            		  System.out.println(sufleCounter + "x Suffle");
		            	  }
		            	  if(teaCounter>=1){
		            		  System.out.println(teaCounter + "x Tea");
		            	  }
		            	  if(coffeCounter>=1){
		            		  System.out.println(coffeCounter + "x Coffee");
		            	  }
		            	  if(salepCounter>=1){
		            		  System.out.println(salepCounter + "x Salep");
		            	  }
		            	  if(colaCounter>=1){
		            		  System.out.println(colaCounter + "x Coca Cola");
		            	  }
		            	  if(fantaCounter>=1){
		            		  System.out.println(fantaCounter + "x Fanta");
		            	  }
		            	  if(spriteCounter>=1){
		            		  System.out.println(spriteCounter + "x Sprite");
		            	  }
		            	  if(hotwineCounter>=1){
		            		  System.out.println(hotwineCounter + "x Hot Wine");
		            	  }
		            	  if(beerCounter>=1){
		            		  System.out.println(beerCounter + "x Beer");
		            	  }
		            	  if(vodkaCounter>=1){
		            		  System.out.println(vodkaCounter + "x Vodka");
		            	  }
		            	  if(wineCounter>=1){
		            		  System.out.println(wineCounter + "x Wine");
		            	  }
		            	  if(tequilaCounter>=1){
		            		  System.out.println(tequilaCounter + "x Tequila");
		            	  }
		            	  if(whiskeyCounter>=1){
		            		  System.out.println(whiskeyCounter + "x Whiskey");
		            	  }
		            	  
		            	  
		            	  System.out.println("has added to the basket!");
		            	  
		            	  System.out.println("The price is = " + basket + "TL");
		            	  
		            	  
		            	  
		            	  System.out.println("Press 2 to write your adress and payment option adjacently (Cash or Credit Card)");
		            	  
		                  
		            	  p = input.nextInt();
		            	  if(p==2){
		            		  Adress = sc.nextLine();
		            	System.out.println("In any case, please write a number(without country code) that we can get to you instantly = ");	  
		            	inputt = new Scanner(System.in);
		            	   r = inputt.nextLong();
		            	  
		            	   
		            	   
		                   System.out.println("Thank you !");
		                   
		                   System.out.println("Your adress is = " + Adress + " And your number is = " + r);
		                   
		                   System.out.println("Now, if you are sure about these informations please press 0 to finish it!");
		                   System.out.println("If you are not sure about these informations please press 1 to fix it!");
		                   
		                   
		                   s = inputt.nextInt();
		                   if(s==0){
		                   System.out.println("Your order has arrived to us succesfully!!! Your wishes will be there in max 45 min 25 minutes. Have a nice day!");}
		                   else if(s==1){
		                	   System.out.println("Press 2 to fix your informations");
		                       
		                 	  p = input.nextInt();
		                 	  while(p==2)
		                 	  if(p==2){
		                 		 System.out.println("Please write your adress and payment option(cash or credit card)(Do not use space button)");
		                 		  Adress = sc.nextLine();
		                 	System.out.println("In any case, please write a number(without country code) that we can get to you instantly = ");	  
		                 	inputt = new Scanner(System.in);
		                 	   r = inputt.nextLong();
		                 	  
		                 	   
		                 	   
		                        System.out.println("Thank you !");
		                        
		                        System.out.println("Your adress is = " + Adress + " And your number is = " + r);
		                        
		                        System.out.println("Now, if you are sure about these informations please press 0 to finish it!");
		                        System.out.println("If you are not sure about these informations please press 2 to fix it!");
		                        p = inputt.nextInt();
		                	   }
		                 	  else if(p==0){
		                 		  break;
		                 		 }
		                 System.out.println("Your order has arrived to us succesfully!!! Thank you for choosing us !!! Your wishes will be there in max 45 min 25 minutes. Have a nice day!");
		                 
		                
		                 
		                 
		                 	  
		    }
		    }
		    } 	
		
		       System.out.println(" ");
		       System.out.println("If you want to give another order please press 0");
		       System.out.println("If you dont want to give another order please press 1 EXIT ! ");
		      
		       x = input.nextInt();
		       
		       System.out.println("*************************************************************************************");
		       System.out.println("*************************************************************************************");
		       System.out.println("*************************************************************************************");
               if(x==1){
            	   break;
            	  
               }
              
	}
	 
	 while(x==0);
	
}
}