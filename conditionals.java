public class conditionals {
	
	public conditionals() {//a constructor initializes the instance variables for the object
	}

		public static String firstname;
		public static String ticketType1;
		public static String ticketType2;
		
	
    	public void studentName(String name) {
    		int firstIndex = name.indexOf(" ");
    		firstname = name.substring(0, firstIndex);
    	}
        
    	public void studentGrade(int grade) {
    		if (grade == 9) {
    			System.out.println("Oh, how exciting! Your first prom!"); 
    			ticketType1 = "freshman";
    		}
    		else if(grade == 12) {
    			System.out.println("Wow! Senior year! This is going to be so memorable for you."); 
    			ticketType1 = "senior";
    		}
    		else if(grade == 10) {
    			ticketType1 = "sophomore";
    		}
    		else {
    			ticketType1 = "junior";
    		}
    	}
    	
    	public void studentTicketNum(int ticketNum) {
    		if (ticketNum == 1) {
    			System.out.println("Well... nothing wrong with that I guess!"); 
    			ticketType2 = "single";
    		}
    		else if(ticketNum == 2) {
    			System.out.println("Lucky you ;)"); 
    			ticketType2 = "couple's";
    		}
    		else {
    			ticketType2 = "group";
    		}
    	}
                
    		double price;
   
        public void ticketPrice(int grade, int ticketNum) {
    		
    		if (grade == 9) {
    			if(ticketNum == 1) {
    				price = 65.00;
    			}
    			else if(ticketNum == 2) {
    				price = 98.00;
    			}
    			else {
    				price = 163.00;
    			}
    		}
        
    		else if(grade == 10) {
    			if(ticketNum == 1) {
    				price = 55.00;  
    			}
    			else if(ticketNum == 2) {
    				price = 83.00;  
    			}
    			else {
    				price = 138.00;  
    			}
    		}
        
    		else if(grade == 11) {
    			if(ticketNum == 1) {
    				price = 45.00; 
    			}
    			else if(ticketNum == 2) {
    				price = 68.00; 
    			}
    			else {
    				price = 113.00;
    			}  
    		}	
        
    		else {
    			if(ticketNum == 1) {
    				price = 40.00;
    			}
    			else if(ticketNum == 2) {
    				price = 60.00;
    			}
    			else {
    				price = 100.00;
    			}	  
    		}
        
    		System.out.println("Alright, " + firstname + ", you are a " + ticketType1 + " purchasing a " + ticketType2 + " ticket.");
    		System.out.println("That will be $" + price);
    			
        
    		//This next part generates the confirmation number
        
    		int num;
        
    		String lA = "abcdefghijklmnopqrstuvwxyz ";
    		String uA = "ABCDEFGHIJKLMNOPQRZTUVWXYZ ";
        
    		int count = 1;
        
    		System.out.println("Your confirmation number is: ");
       
    			
    		while(count <= 6) {
    			if (Math.random() < 0.5){
    				num = (int)(Math.random() * 10);
    				System.out.print(num);
    			}
    			else{
    				if (Math.random() < 0.5){
    					num = (int)(Math.random() * 27);
    					System.out.print(lA.substring(num, (num + 1)));
    				}
    				else{
    					num = (int)(Math.random() * 27);
    					System.out.print(uA.substring(num, (num + 1)));
    				}
    			}
    			count++;
    		}
    		
    		}
    	}
	


    

      
        

  

