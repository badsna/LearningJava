package Week2.Day6;

public class CollectionMethods {
    public static void main(String[] args) {
        /*
        add(Object O); add an object
        addAll(Collection C); //add group of object
        remove(Object O); // remove particular object
        removeAll(Collection C); //remove group of object
        clear();// remove all obejct
        retainAll(Collection C); //except c collection object remove all other
        isEmpty(); //to check is empty
        size(); //to find size
        contains(Object O); //to know particular object is there or not
        containsAll(Collection C); //to check if group of object is available or not
        Object[] a= c.toArray();//to convert collection into array
        Iterator =iterator();



        ################# 1.List #################
        add(int index,Object O) //add object to the index of list
        addAll(int index,Collection c) //add group of object to the index of list
        remove(int index) //remove object from the index
        indexOf(Object O) //index of object
        lastIndexOf(Object O) //last index of object
        get(int index) //get the value of particular index
        ListIterrator() //to iterate the object of list
        set(int index,Object O) //to replace object to particular index


            $$$$$$$$$$$$$$$$$$$$$$$$$ i.ArrayList $$$$$$$$$$$$$
            -Based on resizeable array or growable Array
            -Duplicate
            -insertion order
            -Heterogeneneous Object
            -Null insertion is possible
             -ArrayList l=new ArrayList();
             -ArrayList l=new ArrayList(int initialcapcaity);
             -ArrayList l=new ArrayList(Collection c);
             -default capacity is 10
             -size means object available in list
             -capacity means capacity to hole object
             -New capacity=( current capacity*3/2)+1
             -Best choice for frequent retrival
             -The Worst choice for frequent addition or removal
             -Non-synchorinized so not thread-safe
             -To get synchorinized version
                -public static List synchronizedList(List l)
                    List l=Collections.synchroniziedList(l1);
                 -



            $$$$$$$$$$$$$$$$$$$$$$$$$ ii. Vector $$$$$$$$$$$$$
            -Most of the methods are synchronized
            -Thread-safe
            -Performance is low as remaining thread has to wait
            -Underlyling data structure is resizable array
            -duplicate allowed
            -insertion order
            -null
            -Heterogones object allowed
                addElement(Object O);
                removeAllElement();
                add(int index,Object O);
                Object elementsAt(int index);
            -new capacity=2*currentCapacity;
            -new Vector(int initialCapacity);
            -new Vector(int intialCapacity,int incremental capacity);
            -new Vector(Collection c);

                    ______________________ a. Stack ___________4
                    -LIFO
                    -new Stack();
                    push(Object O);
                    pop();
                    peek();
                    empty();
                    search(value); //returns offset from top of stack in what index it lies

            $$$$$$$$$$$$$$$$$$$$$$$ iii.LinkedList $$$$$$$$$$$
            -Best choice for addtion or deletion
            -Worst choice for frequent retrival
            -Underlying data structure is doubly linked list
            -insertion order is preserved
            -duplicates are allowed
            -Hetrorgenous object are allowed
            -Null insertion
            -Only for linked list
                addFirst(Object O)
                addLast(Object O)
                Object getFirst()
                Object getLast()
                Object removeFirst()
                Object removeLast()
            -LinkedList l=new LinkedList();
            -LinkedList l=new LinkedList(Collection c);



           ############################ 2.Set(I) ###########
           -No dulplicate
           -No insertion order
           -doesnt contains any new methods,
                so use only collection interface method


                $$$$$$$$$$$$$$$$$$$$$$$$$$$$ i.HashSet $$$$$$$$$$$
                - Underlying data structure is Hashtable
                -duplicates not allowed,if duplicated returns false
                -insertion order not preserved, inserted on the basis of hascode of object
                -null
                -Best for search operation
                -HashSet h=new HashSet();
                -default capacity =16
                -load factor/fill ratio :0.75 means after 75% coverage of hashset new capacity is generated
                -HashSet h=new HashSet(int initialcapacity)
                -HashSet h=new HashSet(int initalcapcity,float loadfactor)
                -HashSet h=new HashSet(Collection c)

                ___________________________-a.LinkedHashSet_____________
                    -duplication is not allowed and insertion order must also be preserved
                    -Hashtable +LinkedList
                    -Best to  develop cache based application


                $$$$$$$$$$$$$$$$$$$$$$$$$$ ii. SortedSet(I) $$$$$$$$$$$$$$$$$
                -duplication not allowed but insertion must be in some sorting order
                    first();
                    last();
                    headSet(Object O); //returns values less than O
                    tailsSet(Object O);
                    subSet(Object O,Object O);
                    comparator(); //returns comparator object that describes underlying sorting technique


               ______________________________- a. TreeSet ____________
               -underlying data structure is balanced tress
               -no duplicate and insertion order
               -inserted in sorting order
               -only homogenous object
               -null only once in empty TreeSet
               -TreeSet a=new TreeSet(); // default natural sorting
               -TreeSet a=new TreeSet(Comparator c);  //customized sorting order
               -TreeSet a=new TreeSet(Collection c);//create equivalent treeset object
               -TreeSet a=new TreeSet(SortedSet s);
               -Under default natural sorting object must be comparable and homogenous
                        --String implements Comparable(I) but Stringbuffer doesn't
               -


         */
    }
}
