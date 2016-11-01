package practicals.conditionals;

public class StackImplementation {

   	int[] stck = new int[10];
   	int TOS;

    StackImplementation(){
    	TOS = -1;
    }

    void push(int item){
    	if (TOS>=10) {
    		System.out.println("Stack OverFlow");    		
    	}else{
	    	stck[++TOS]=item;
    	}
    }

    void pop(){
    	if (TOS<=0) {
    		System.out.println("Stack Underflow");
    	}
    	else{
    		for (int i=TOS;i>=0;i--) {
    			System.out.println(stck[i]);
    		}
    	}
    }
}