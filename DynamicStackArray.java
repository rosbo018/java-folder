class DynamicStackArray<E> implements Stack<E>{
	public final int DEFAULT_INC = 25;
	private E[] elems;
	private int top;    // Designates the first free cell

	@SuppressWarnings( "unchecked" )

	public DynamicStackArray(int capacity){
		elems = (E[]) new Object[DEFAULT_INC*(capacity/DEFAULT_INC)];//creates array with multiple of DEFAULT_INC size
		top = 0;

	}
	void updateArraySize(){
		if ((top+1) %DEFAULT_INC == 0){
			E[] tempElems = (E[]) new Object[DEFAULT_INC*((top+1)/DEFAULT_INC)];
			for (int i = 0; i < top; i++){
				tempElems[i] = elems[i];
			}
			elems = null;
			elems = tempElems;
		}

	}

	public boolean isEmpty() {

        // Same as:
        // if ( top == 0 ) {
        //     return true;
        // } else {
        //     return false;
        // }

        return ( top == 0 );
    }

    // Returns the top element of this ArrayStack without removing it

    public E peek() {

        // pre-conditions: ! isEmpty()

        return elems[ top-1 ];
    }

    // Removes and returns the top element of this stack

    public E pop() {

        // pre-conditions: ! isEmpty()
        
        // *first* decrements top, then access the value!
        --top;
        updateArraySize();
        E saved = elems[ top ];

        elems[ top ] = null; // scrub the memory!
        return saved;
        
    }

    // Puts the element onto the top of this stack.

    public void push( E element ) {

        // Pre-condition: the stack is not full

        // *first* stores the element at position top, then increments top
    	top++;
    	updateArraySize();
        elems[ top ] = element;
        

    }

    //clears the array
    public void clear(){
        //for each element in elems
        for (int i = elems.length;i>0;i++){
            elems[i] = null;//set that element to null
        }
        top = 0;//set the index to zero(indicating a empty array)
        updateArraySize();
    }


}