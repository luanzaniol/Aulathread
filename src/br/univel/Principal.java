package br.univel;

public class Principal {
	//o que é uma class anonima
			//e quando ela é usada
	//o que é uma Tread
			//e quando ela é usada
	public Principal(){
		
		new Thread(
			new Runnable() {
				 @Override
				public void run() {
					tarefa("P1");
				}
			}).start();
		System.out.println("thread principal livre.");
		
		
			new Thread(
				new Runnable() {
					 @Override
					public void run() {
						tarefa("P2");
					}
				}).start();
				
			
				new Thread(
						new Runnable() {
							 @Override
							public void run() {
								tarefa("P3");
							}
						}).start();
						
	
	}
	
	private void tarefa(String nome){
		for (int i = 0 ; i < 11; i ++){
			System.out.println(nome+" " + i);
			
			try{
				Thread.sleep(10);
			}catch (InterruptedException e){
				e.printStackTrace();
				
			}
			
		}
		

		
	}	
		
	
	public static void main(String[]args){
		new Principal();
		
		
	}

}
