public class NewArrayList{
	private static final int  insize=10;
	private Object data[];
	private int count;
	private int size;

	public NewArrayList()
	{
		this.data=new Object[insize];
		this.size=insize;
	}
	public void add(Object obj)
	{

		System.out.println("Countc:"+this.count+"Size :"+this.size);
		if(this.count==this.size-1){
			increase();
		}
		data[this.count]=obj;
		this.count++;
	}
	private void increase() {
		this.size=(int)(insize*1.5);
		Object newData[]=new Object[this.size];
		for(int i=0;i<data.length;i++){
			newData[i]=data[i];
		}
		this.data=newData;
		System.out.println("***Count :"+this.count+" size :"+this.size);

	}
	void show(){
		int c=0;
		for(Object element : data){
			System.out.println(c+" element ofm array"+element);
			c++;
		}
	}

public static void main(String[] args) {
	NewArrayList n=new NewArrayList();
	n.add("0");
	n.add("1");
	n.add("2");
	n.add("3");
	n.add("4");
	n.add("5");
	n.add("6");
	n.add("7");
	n.add("8");
	n.add("9");
	n.add("10");
	n.add("11");
	n.show();

}}

