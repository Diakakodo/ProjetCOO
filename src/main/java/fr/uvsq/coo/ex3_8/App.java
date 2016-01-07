package fr.uvsq.coo.ex3_8;

public class App {
	
	private static App INSTANCE;
	
	private App(){
		
	}
	
	public static App getInstance(){
		if(INSTANCE==null){
			INSTANCE=new App();
		}
		return INSTANCE;
	}
	
	public void run(String args[]){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInstance().run(args);
	}

}
