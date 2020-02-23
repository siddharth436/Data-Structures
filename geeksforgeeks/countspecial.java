package geeksforgeeks;

class countspecial{
    
    static void follPatt()
    {
        int countx=0;
        int county=0;
        String s = "xxyy";
        for(char i : s.toCharArray()){
            if(i=='x')
                countx++;
            else if(i=='y')
                county++;
        }
        if(countx==county)
        	System.out.println("1");
        else 
        	System.out.println("0");
        //Your code here
       
      
    }
}
