import java.util.ListIterator;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stack extends vector
		//STACK - APPLICATIONS= FOR UNDO,REDO,BACK AND FORWARD IN BROWSESRS. BASED ON LIFO PRINCIPLE.
		Stack<String> players = new Stack<>();
		players.push(null);//it accepts null and duplicate values
		players.push("sachin");
		players.push("Rohit");
		players.push(null);
		players.add(1,"Kohli");//add by index
		players.set(3, "shreyas");
	
		System.out.println(players.peek());//it will helps to see the last element or object
		players.pop();//it will remove the last element
		System.out.println(players);
		System.out.println(players.search("Kohli"));
		System.out.println(players.indexOf("Kohli"));
		System.out.println(players.isEmpty());
		System.out.println(players.empty());
		
		System.out.println(players);
		
		
		 ListIterator<String> iterate = players.listIterator();
		 iterate.next();
		 iterate.next();
		 // Using the previous() method
         System.out.println(iterate.previousIndex());
        

        // Using the previousIndex()
        System.out.println(iterate.previous());
       
		
		

	}

}
