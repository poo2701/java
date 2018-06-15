
class Arraysort{
 public static void main(String[] args){
 	int i,temp=0,j,k;
    int list[] = {2,4,6,7,8,3,42,1};
    for(k=0;k<list.length-1;k++) {
    for(i=0;i<list.length-1;i++){
       if(list[i]>list[i+1]){
       	 temp=list[i+1];
       	  list[i+1]=list[i];
       	  list[i]=temp;
       	}
} 

} 
for(j=0;j<list.length;j++){
  	System.out.print(list[j]+" ");
  }

 }
}