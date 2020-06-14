<h2> Single Dimensional Array </h2>
<br>
<h3> Creating single dimensional array </h3>


    //declaring an array 
      int[] arry;   

      //creating an array
      arry = new int[5]; 

      //initializing an array 
      arry[0] = 3; 
      arry[1] = 6;
      arry[2] = 0;
      arry[3] = 534;
      arry[4] = 2;
      
<b> Other way to create single dimensional array </b>
 
    int[] arry = {2,445,566,23,353}; 


<h3>Traversing an array </h3>

     int[] arry = {2,445,566,23,353};

     public static void traverseArray(int [] arry) {
      try {
        for(int i = 0; i <= arry.length - 1; i++) {
          System.out.println("arry value is  :" + arry[i]);

        }
      }catch(Exception ex) {
        System.out.println("Array do not exists.");
      }
    }
    
