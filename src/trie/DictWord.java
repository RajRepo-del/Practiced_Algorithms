package trie;

public class DictWord {
	
	  public static Object isFormationPossible(String[] dict,String word) {

		  if(word.length() < 2 || dict.length < 2) {
		      return false;
		    }
		  
		  Trie trie = new Trie();
		  for(String str: dict){
			  trie.insert(str);
		  }
				  
		  char[] key = word.toCharArray();
		  TrieNode trieNode = trie.getRoot();
		  
		  for(int i=0;i<word.length();i++){
			  if(trieNode.children[key[i] - 'a' ] != null && trieNode.children[ key[i] - 'a' ].isEndWord){
				  trieNode = trie.getRoot();
			  }else if(trieNode.children[key[i] - 'a' ] != null){
				  trieNode = trieNode.children[key[i] - 'a'];
			  }else if(trieNode.children[key[i] - 'a' ] == null){
				  return false;
			  }
		  }
		  
		    return true;
		  }
	  
	  public static void main(String args[]){
		  
		  String dict[] = {"the" ,"hell", "there", "answer", "any", "Dragon", 
	                 "world", "their", "inc"};
		  
		  String word = "helloworld";
		  
		  
		  System.out.println(isFormationPossible(dict, word));
	  }

}
