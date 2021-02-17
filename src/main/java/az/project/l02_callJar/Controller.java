package az.project.l02_callJar;

import az.project.l01_createJar.Repository;

public class Controller {
	
	public static void main(String[] args) {
		
		Repository repository = new Repository();
		
		repository.insert("Elshan HUSEYNZADA");
		System.out.println();
		repository.delete("Elshan HUSEYNZADA");
		System.out.println();
		repository.update("Elshan HUSEYNZADA");
	}

}
