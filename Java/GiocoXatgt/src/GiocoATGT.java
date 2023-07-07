public class GiocoATGT {
	private int mano;
	
	public GiocoATGT() {
		mano = 0;
	}
	
	//1=vinto 0=continua a giocare -1=perso
	/*public int giocata(){
		if(mano > 8)
			return -1;
		int pescata = (int) Math.random() * 7;
		mano = mano + pescata;
		if(mano == 8)
			return 1;
		return 0;
	}*/
	
	//1=vinto 0=continua a giocare -1=perso
	public int giocata(int pescata){
		if(partitaPersa())
			return -1;
		if(pescata <= 7 && pescata >= 1) 
			mano = mano + pescata;
		if(mano == 8)
			return 1;
		if(mano > 8)
			return -1;
		return 0;
	}
	
	public void azzeraPartita() {
		mano = 0;
	}
	
	public int getMano() {
		return mano;
	}
	
	private boolean partitaPersa() {
		if(mano > 8)
			return true;
		return false;
	}
}
