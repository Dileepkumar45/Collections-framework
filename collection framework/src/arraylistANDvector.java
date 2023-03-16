import java.util.ListIterator;
import java.util.Vector;

public class arraylistANDvector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vector and arraylist implementation occurs by generating new sized arrays based on exponential growth of data i.e elements.
		//implements list interface
		//VECTOR
		//DUPLICATE ELEMENTS CAN BE ADDED
		//initial capacity for both =10
		//incresing capacity -vector by 100%, arraylist by 50%
		Vector<String> v=new Vector<>();
		v.add("gsvuy");
		v.add("hxgbu");
		v.add(1,"dshb");
		v.add("dshb");
		v.add("Fshb");
		v.add("dGhb");
		v.add("dshb");
		v.add("dRThb");
		v.add("dFshb");
		v.add("dHTGshb");
		v.add("dRGEshb");
		
		
		Vector <String>v1 = new Vector<>();
		v1. add ("tdyk");
		v1. add("yfkuyl");
		
	//	for(int i=0; i<v1.size();i++) {//adding of elements of an array by loops
		//	v.add(v1.get(i));
			
	//	}
//	v.addAll(v1);
	v.addAll(0, v1);//to add elements of v1 in v on starting
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v1);
		System.out.println(v);
		System.out.println(v.get(4));//retrieaval
		System.out.println(v.remove(2));//delete by index or name
		System.out.println(v);
		System.out.println(v.contains("tdyk"));//verification
		System.out.println(v.containsAll(v1));
		System.out.println(v.set(2, "hjbchs"));//update
		// v.clear();//for deleting entire collections.
		System.out.println(v.indexOf("dshb"));//to get thr index of object 
		System.out.println(v);
		
		
		
		// Creating an instance of ListIterator
		ListIterator<String> iterate = v.listIterator();

        // Using the next() method
         System.out.println(iterate.next());
        

        // Using the nextIndex()
        System.out.println(iterate.nextIndex());
       

        // Using the hasNext() method
        System.out.println( iterate.hasNext());
		
		

	}

}
