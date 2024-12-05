package hotel;
import java.util.Scanner;
public class HotelMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int choice,choiceSouth,choiceGuj,choiceItly,choicePun,qty,totalPrice;
		System.out.println("1--------South Indian");
		System.out.println("2--------Gujrati");
		System.out.println("3--------Italian");
		System.out.println("4--------Punjabi");
		System.out.println("5--------Exit");
		System.out.println("Enter your choice");
		choice=obj.nextInt();
		switch(choice) {
		case 1:System.out.println("You have selected South Indian");
				System.out.println("1------ Dhosa");
				System.out.println("2------ Idli");
				System.out.println("3------ Upma");
				System.out.println("Enter your choice");
				choiceSouth=obj.nextInt();
				switch(choiceSouth) {
				case 1:System.out.println("You have selected Dhosa");
				       System.out.println("1--------Plain Dhosa");
				       System.out.println("2--------Masala Dhosa");
				       System.out.println("3--------Rava Dhosa");
				       System.out.println("Enter your choice");
				       choiceSouth=obj.nextInt();
				       switch(choiceSouth) {
				       case 1:System.out.println("You have selected Plain Dhosa");
				       		  System.out.println("Qunatity of Plain Dhosa you want:");
				       		  qty=obj.nextInt();
				       		  totalPrice=qty*40;
				       		  System.out.println("Your bill of plain dhosa is "+totalPrice);
				       		  System.out.println("Thanks for visiting us");
				       		  break;
				       case 2:System.out.println("YOu have selected Masala Dhosa");
				              System.out.println("Quantity of Masala Dhosa:");
				              qty=obj.nextInt();
			                  totalPrice=qty*100;	              
			                  System.out.println("Your bill of masala dhosa is "+totalPrice);
				       		  System.out.println("Thanks for visiting us");
				       		  break;
				       case 3:System.out.println("YOu have selected Rava Dhosa");
			              System.out.println("Quantity of Rava Dhosa:");
			              qty=obj.nextInt();
		                  totalPrice=qty*80;	              
		                  System.out.println("Your bill of rava dhosa is "+totalPrice);
			       		  System.out.println("Thanks for visiting us");
			       		  break;
				       case 4:System.exit(0);
				       }
			           break;
				       case 2:System.out.println("You have selected Idli");
					           System.out.println("1------Rava Idli");
					           System.out.println("2------Podi Idli");
					           System.out.println("3------Sooji Idli");
					           System.out.println("Enter your choice:");
					          choiceSouth=obj.nextInt();
					   switch(choiceSouth) {
					   case 1:System.out.println("You have selected Rava Idli");
					   		  System.out.println("Quantity for Rava Idli:");
					   		  qty=obj.nextInt();
					   		  totalPrice=qty*15;
					   		  System.out.println("Your bill of rava idli is "+totalPrice);
					   		  System.out.println("Thank for visiting us");
					   		  break;
					   case 2:System.out.println("You have selected Podi Idli");
				   		  System.out.println("Quantity for Podi Idli:");
				   		  qty=obj.nextInt();
				   		  totalPrice=qty*20;
				   		  System.out.println("Your bill of rava idli is "+totalPrice);
				   		  System.out.println("Thanks for visiting us");
				   		  break;
					   case 3:System.out.println("You have selected Sooji Idli");
				   		  System.out.println("Quantity for Sooji Idli:");
				   		  qty=obj.nextInt();
				   		  totalPrice=qty*14;
				   		  System.out.println("Your bill of rava idli is "+totalPrice);
				   		  System.out.println("Thanks for visiting us");
				   		  break;
					   case 4:System.exit(0);
					   }
					   break;
				case 3:System.out.println("You have selected Upma");
				       System.out.println("Quantity for upma:");
				       qty=obj.nextInt();
				       totalPrice=qty*45;
				       System.out.println("Your bill of upma is "+totalPrice);
				   	   System.out.println("Thanks for visiting us");
					   break;
				case 4:System.exit(0);
				}
				break;
		case 2:System.out.println("You have selected Gujrati");
			   System.out.println("1------ Dal Dhokadi");
			   System.out.println("2------ Dhokla");
			   System.out.println("3------ Thali");
			   System.out.println("Enter your choice");
			   choiceGuj=obj.nextInt();
			   switch(choiceGuj) {
			   case 1:System.out.println("You have selected Dal Dhokadi");
			   		 System.out.println("Qunatity of Dal Dhokadi per plate:");
			   		 qty=obj.nextInt();
			   		 totalPrice=qty*75;
			   		 System.out.println("Your bill of dal dhokadi is "+totalPrice);
			   		 System.out.println("Thanks for visiting us");
			   		break;
			   case 2:System.out.println("You have selected Dhokla");
			   		  System.out.println("Quantity of Dhokla per plate:");
			   		  qty=obj.nextInt();
			   		  totalPrice=qty*40;
			   		System.out.println("Your bill of dhokla is "+totalPrice);
			   		System.out.println("Thanks for visiting us");
			   		break;
			   case 3:System.out.println("You have selected Thali");
		   		      System.out.println("Quantity of Thali per plate:");
		   		      qty=obj.nextInt();
		   		      totalPrice=qty*90;
		   		      System.out.println("Your bill of Thali is "+totalPrice);
		   		      System.out.println("Thanks for visiting us");
		   		      break;
			   case  4:System.exit(0);
			   }
		        break;
		case 3:System.out.println("You have selected Italian");
		       System.out.println("1------ Pasta");
		       System.out.println("2------ Pizza");
		       System.out.println("3------ Grallic Bread");
		       System.out.println("Enter your choice");
		       choiceItly=obj.nextInt();
		       switch(choiceItly) {
		       case 1:System.out.println("You have selected Pasta.");
		       		break;
		       case 2:System.out.println("You have selected Pizza.");
		       		  System.out.println("1------Mexican");
		       		 System.out.println("2------Pesto");
		       		 System.out.println("3------Tomato");
		       		 System.out.println("Enter your choice");
		       		 choiceItly=obj.nextInt();
		       		 switch(choiceItly) {
		       		 case 1:System.out.println("You have selected Mexican Pizza");
		       		 		System.out.println("Quantity of pizza:");
		       		 		qty=obj.nextInt();
		       		 		totalPrice=qty*200;
		       		 		System.out.println("Bill of your mexican pizza is "+totalPrice);
		       		 		System.out.println("Thanks for visiting us");
		       		 		break;
		       		case 2:System.out.println("You have selected Pesto Pizza");
		       			   System.out.println("Quantity of pizza:");
       		 		       qty=obj.nextInt();
       		 		       totalPrice=qty*210;
       		 		       System.out.println("Bill of your pesto pizza is "+totalPrice);
       		 		       System.out.println("Thanks for visiting us");
       		 		       break;
		       		case 3:System.out.println("You have selected Tomato Pizza");
		       			   System.out.println("Quantity of pizza:");
       		 		       qty=obj.nextInt();
       		 		       totalPrice=qty*220;
       		 		       System.out.println("Bill of your tomato pizza is "+totalPrice);
       		 	        	System.out.println("Thanks for visiting us");
       		 		       break;
		       		case 4:System.exit(0);
		       		 }
		       		break;
		       case 3:System.out.println("You have selected Garlic Bread.");
		              System.out.println("Quantity of Garlic Bread per plate:");
		              qty=obj.nextInt();
		              totalPrice=qty*150;
		              System.out.println("Your bil of gralic bread is "+totalPrice);
		              System.out.println("Thanks for visiting us");
		       		break;
		       case 4:System.exit(0);
		       }
				break;
		case 4:System.out.println("You have selected Punjabi");
		       System.out.println("1------ Panner Chap");
		       System.out.println("2------ Lacha Paratha");
		       System.out.println("3------ Panner Tikka");
		       System.out.println("Enter your choice");
		       choicePun=obj.nextInt();
		       switch(choicePun) {
		       case 1:System.out.println("You have selected Panner Chap");
		       		  System.out.println("Quantity of panner chap:");
		       		  qty=obj.nextInt();
		       		  totalPrice=qty*60;
		       		  System.out.println("Bill of your panner chap is"+totalPrice);
		       		  System.out.println("Thank for visiting us");
		              break;
		       case 2:System.out.println("You have selected Lacha Paratha");
		              System.out.println("Quantity of Lacha Paratha:");
	       		      qty=obj.nextInt();
	       		      totalPrice=qty*45;
	       		      System.out.println("Bill of your lacha paratha is"+totalPrice);
	       		      System.out.println("Thank for visiting us");
	              break;
		       case 3:System.out.println("You have selected Panner Tikka");
		              System.out.println("Quantity of panner tikka:");
	       		      qty=obj.nextInt();
	       		      totalPrice=qty*80;
	       		      System.out.println("Bill of your panner tikka is"+totalPrice);
	       		      System.out.println("Thank for visiting us");
	                  break;
		       case 4:System.exit(0);
		       }
				break;
		case 5:System.exit(0);
		}
	}

	
}
