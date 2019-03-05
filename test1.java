class Test1{
	public static void f(int i){
		String j="1";
		try{
			if(i==1)throw new Exception("");
			j=j+"2";
			return;
		}catch(Exception e){
			j=j+"3";
			System.out.println(j);
			return;
		}finally{
			j=j+"4";
			System.out.println(j);
		}
	}
    public static void main(String []args) {
		f(0);
		f(1);
		// javac test1.java
		// java Test1
    }
}