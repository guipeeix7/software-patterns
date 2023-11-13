import java.util.Enumeration;


public class IteratorDemo {

	/**
	 * Reference: https://sourcemaking.com/design_patterns/iterator/java/2 
	 * Modified by Milene.
	 */
	public static void main(String[] args) {
		
		IntSet set = new IntSet();
		
		//add elements
        for (int i=2; i < 10; i += 2) set.add( i ); //{2, 4, 6, 8}
        
        for (int i=1; i < 9; i++)
            System.out.print( i + "-" + set.isMember( i ) + "  " );

        // 3. Clients ask the collection object to create many iterator objects
        IntSet.Iterator it1 = set.createIterator();
        IntSet.Iterator it2 = set.createIterator();

        // 4. Clients use the first(), isDone(), next(), currentItem() protocol
        System.out.print( "\nBy Iterator:    " );
        for ( it1.first(), it2.first();  ! it1.isDone();  it1.next(), it2.next() )
            System.out.print( "\nThe current item of the FirstIterator is: " +  it1.currentItem() + "\nThe current item of the SecondIterator is: " + it2.currentItem());

        // Java uses a different collection traversal called Enumeration
        /*For example, to print all elements of a Vector<E> v:
        	   *for (Enumeration<E> e = v.elements(); e.hasMoreElements();)
        	       *System.out.println(e.nextElement());
        *System.out.print( "\nEnumeration: " );*/
        //Here, we have the same logic, but used to print all elements of a hashtable
        System.out.print( "\nBy Enumeration:    " );
        System.out.print("\nThe elements of the IntSet Hashtable are: ");
        for (Enumeration e = set.getHashtable().keys(); e.hasMoreElements();)
            System.out.print(e.nextElement() + "  ");
        System.out.println();

	}
}
