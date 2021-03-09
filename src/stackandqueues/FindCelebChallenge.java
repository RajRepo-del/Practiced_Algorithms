package stackandqueues;

public class FindCelebChallenge {
	public static int findCelebrity(int[][] party,int numPeople){
		Stack<Integer> stack = new Stack<>(numPeople);
		for(int i=0;i<numPeople;i++){
			stack.push(i);
		}
		while(!stack.isEmpty()){
			int celeb=-1;
			int c1 = stack.pop();
			if(stack.isEmpty() && c1==-1){
				return c1;
			} else if(!stack.isEmpty() && c1==-1){
				c1=stack.pop();
			}else if(stack.isEmpty() && c1!=-1){
			
				for(int i=0;i<c1;i++){
					if(party[c1][i]==1){
						return celeb;
					}
				} return c1;
			}
			int c2 = stack.pop();
			if(party[c1][c2]==1 && party[c2][c1] !=1){
				celeb = c2;
			} else if(party[c2][c1] ==1 && party[c1][c2]!=1){
				celeb = c1;
			}
			stack.push(celeb);
			
		}
		
		
		return Integer.MIN_VALUE;
	}
	
public static void main(String args[]) {
        
        int [][] party1 = {
          {0,1,1,0},
          {1,0,1,1},
          {0,0,0,0},
          {0,1,1,0},   
        };

        int [][] party2 = {
          {0,1,1,0},
          {1,0,1,1},
          {0,0,0,1},
          {0,1,1,0},   
        };

        int [][] party3 = {
          {0,0,0,0},
          {1,0,0,1},
          {1,0,0,1},
          {1,1,1,0},   
        };
        
        System.out.println(findCelebrity(party1,4));
        System.out.println(findCelebrity(party2,4));
        System.out.println(findCelebrity(party3,4));
    }

}
