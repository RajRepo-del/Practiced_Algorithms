package stackandqueues;

class TwoStacks<V> {
    private int maxSize;
    private V[] array;
    private int arr1start = 0;
    private int arr1top = -1;
    private int arr2start = maxSize-1;
    private int arr2top = maxSize;
    private int arr1size=0;
    private int arr2size=0;

    @SuppressWarnings("unchecked")
    public TwoStacks(int max_size) {
        this.maxSize = max_size;
        array = (V[]) new Object[max_size];//type casting Object[] to V[]
        this.arr2top=this.maxSize;
    }

    //insert at top of first stack
    public void push1(V value) {
    
    	if(arr1size+arr2size < maxSize){
    		array[++arr1top]=value;
    		arr1size++;
    	}
    }

    //insert at top of second stack
    public void push2(V value) {
    	
    	if(arr1size+arr2size < maxSize){
    		array[--arr2top]=value;
    		arr2size++;
    	}
    }

    //remove and return value from top of first stack
    public V pop1() {
    	V x=null;
    	if(arr1size>0){
    		x=array[arr1top--];
    		arr1size--;
    	}
        return x;
    }

    //remove and return value from top of second stack
    public V pop2() {
    	V x=null;
    	if(arr2size>0){
    		x=array[arr2top++];
    		arr2size--;
    	}
        return x;
    }
	public static void main(String args[]){
		TwoStacks<Integer> twoStacks= new TwoStacks<Integer>(10);
		twoStacks.push1(1);
		twoStacks.push1(2);
		twoStacks.push1(3);
		System.out.println(twoStacks.pop1());
		System.out.println(twoStacks.pop1());
		twoStacks.push2(4);
		twoStacks.push2(5);
		twoStacks.push2(6);
		System.out.println(twoStacks.pop2());
		System.out.println(twoStacks.pop2());
		
	}

}


	


