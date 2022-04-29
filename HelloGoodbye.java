class HelloGoodbye{
	public static void main(String[] args){
		try{
			System.out.printf("Hello %s and %s.\nGoodbye %s and %s.\n",args[0],args[1],args[1],args[0]);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
