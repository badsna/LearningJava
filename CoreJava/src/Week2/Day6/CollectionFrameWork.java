package Week2.Day6;

public class CollectionFrameWork {
    public static void main(String[] args) {
        /*

        ##### Need of Collection ####
            1.When we dont know  the size for data
            2. When we need to store heterogeneous
            3.To hold and transfer object from one place to another,
                to do this object should be serializable object,
                to support this every collection class implements serializable interface
            4. When a object  is sent over network ,after reaching destination receiver doesn't perform operation in data
                as any fault cant be recovered so receiver makes exact clone of the object

            5. For ArrayList and Vector, they implement RandomAcccess interface
                -It is in java.util package
                -It is marker interface as it doesnt have any method






        ########Arrays Vs Collection ######
            1.If we know size for data use Arrays
            2.With respect to memory arrays are not recommended
            3. WRT performance arrays are recommended
            4. Ready-made method not available
            5.Primitive and Object can be hold in arrays


        ######### Collection############
            Collection is group of individual object.
            Collection framework defines different class and interface to represent group of individual object as single
            entity.

        ############# Collection Vs Collections #######
              1.Collection is a interface and Collections are class
              2. Collection is used to represent individual object as a single entity. Collections is the utility class which define several utility methods for collection
              3.


        ########## 9 key interfaces of Collections FrameWork ############
            A.Collection(I)
            1. List(I)
                -Duplication is allowed
                -insertion order should be preserved
                    i.ArrayList
                    ii.LinkedList
                    iii.Vector (legacy classes)
                        a.Stack

             2. Set(I)
                -Duplication not allowed
                -Insertion order should not be preserved
                i.HashSet
                    a. LinkedHashSet
                 ii. SortedSet(I)
                    -Duplicate is not allowed
                    -Object should be inserted according to some sorting order

                    a.NaviagableSet(I)
                        -defines several methods for navigation like previous element
                        -implementation interface is TreeSet

              3. Queue(I)
                -before processing if we want to represent group prior to processing

                i. PriorityQueue
                ii.BlockingQueue
                    a. LinkedBlockingQueue
                    b. PriorityBlockingQueue

           B. Map(I)
           -If we want to represent in key value base where both key and value are object.
           -Key is not duplicated but value can be

           1. HashMap
            i. LinkedHashMap
           2.WeakHashMap
           3.IdentityHashMAp
           4.Dictionary(Legacy class)
            i.Hashtable
                a..Properties
           5.SortedMap(I)
                -If we want to represent the group of object as key,value base
                    where duplicate is  available according to some sorting order of key.
                i.NavigableMap
                    a.TreeMap


##################  Sorting ###############
1. Comparable
    -If we want default sorting order
    -Under java.lang
    -only one method compareTo()
    -public int  comapreTo(Object obj)
            //retrun -ve iffobj1 has to come before obj2
            //retruns trueiff obj1 has to come after obj2
            //returns 0 iff obj1 and obj2 are equal
            //obj1 is one which we are trying to inser
            //obj2 is the one which is already in treeSet

2. Comparator
    -If we want customized sorting order
    -under java.util
    -2 methods
        -compare()
        -equals()
   -public int compare(Onject obj1,Object obj2)
        //reteuns -ve if obj1 has to come before Objec
        //same as compareTo()
   -public boolean equals()
        //it is oprtional cause it is already under Object Class
    -object may not be comparable

################## Cursors #############
-I want the objects from collection one by one then we need cursors
1.Enumeration
    -Available for legacy classes
    -only read access
    - We can get it by using Elements method available in vectors
    Enumeration e=v.elements();
    hasmoreElements();
    nextElements();


2. Iterator(I)
    -for any collection class
    -both read and remove
    -public Iterator iterator()
    -Iterator itr=collectionObject.iterator();
        hasNext()
        next()
        remove()
    -Only forward direction
    -no replace access
    -addtion of new object is also missing



3.ListIterator(I)
     -bidirectional cursor
     -read,remove,replace and addtion of new objects
     -public ListIterator listIterator()
     -ListIterator ltr=l.listIterator();
     -child of Iterator(I)
        hasNext();
        next();
        nextIndex();

        hasPrevious();
        previous();
        previousIndex();

        remove();
        set(Object new); //for replacement
        add(Object new);

     -only applicable for list implemented class objects


#################### Utility Classes ############
1. Collections
2.Arrays




#############  Note #############
-Except TreeSet and TreeMap everywhere heterogenous object is allowed
    because object are stored in sorting order, for that object needs to be compared














         */
    }
}
