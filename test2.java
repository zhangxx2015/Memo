class Test2{
	public static long getN(int n){
		return n==0?1:n*getN(n-1);
	}
    public static void main(String []args) {
		System.out.println(getN(10));
		// javac test2.java
		// java Test2
    }
}