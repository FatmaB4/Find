class Main {
  public static void main(String[] args) {
    char[]needle= {'W','E','S','T','W','O','O','D'};
    char[]hangstack= {'W','E','S','T','L','A','K','E','W','E','S','T','W','O','O','D'};

    
  }
  public int find(char[]needle, char[]hangstack){
    int startingindex=0;
    //find the size of both needle and hangstack
    int needlesize = needle.length;
    int hangstacksize = hangstack.length;
      int j=0;
    for(int i=0; i<= hangstacksize-(needlesize-1); i++ ){
    
       if (needle[j] == hangstack[i+j] ){
       j++;
       }
       else {
         j=0;
        break;
       }
       
       if ( j == needlesize-1){
        startingindex = i-(needlesize-1);
       
    
       }

    }
       return startingindex;
  }

}