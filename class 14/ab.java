class x{   
 synchronized static  void Pt(int a,int b){
   for(int i=a;i<=b;i++){  
     System.out.println(i);  
     try{  
       Thread.sleep(50);  
     }catch(Exception e){}  
   }  
 }  
}  
public class ab {  
public static void main(String[] args) {  
      
    Thread t1=new Thread(){  
        public void run(){  
            x.Pt(0,500);  
        }  
    };      
    Thread t2=new Thread(){  
        public void run(){  
            x.Pt(500,1000);  
        }  
    };   
    t1.start();  
    t2.start();  
    
      
}  
}