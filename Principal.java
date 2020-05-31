public class Principal {
 
	public static void main(String args[]) {

		DirectorCamara directorC = new DirectorCamara();

		directorC.ordenarCamara();

		CamaraFactory camara = new Camara();

		camara.crearCamara();

 		Camara camaraAnt; 
 		camaraAnt = new CamaraAntigua();

 		camaraAnt.capturarImagen();
	}
 
}