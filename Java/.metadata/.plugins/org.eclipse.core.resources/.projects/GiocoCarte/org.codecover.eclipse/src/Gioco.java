public class Gioco {
  static {
    CodeCoverCoverageCounter$1iwyhw3q3j530m01.ping();
  }

	/*@spec_public@*/ int[] mano;
	private /*@spec_public@*/ int[] vincitori;
	private /*@spec_public@*/ int vittoria;
	private /*@spec_public@*/ int controllo;
	
	//@public invariant  mano!=null;
	//@public invariant vincitori!=null;
	//@public invariant (\forall int x; 0<=x &&  x<vincitori.length; vincitori[x]>=-1 && vincitori[x]<=1);
	
	
	//In input voglio almeno un giocatore
		//@requires giocatori > 0 && giocatori < 1000;
	
	//Inserisco anche qua le stesse condizioni dell'invariante in quanto l'invariante funziona dopo il costruttore
		//@ensures mano!= null;
		//@ensures vincitori!=null;
	
	//Controllo che vittoria venga impostata a -1;
		//@ensures vittoria == -1;
	
	//Controllo che i vettori mano e vincitori siano della lunghezza corretta
		//@ensures (mano.length == giocatori) && (vincitori.length == giocatori);
	//Controllo che i vettori mano e vincitori siano inizializzati a zero
		//@ensures (\forall int x; 0<=x &&  x<giocatori; mano[x]==0 && vincitori[x]==0);
	public Gioco(int giocatori) {
		//All'inizio nessuno ha vinto
		CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[1]++;
this.vittoria = -1;
		CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[2]++;
this.mano = new int[giocatori];
		CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[3]++;
this.vincitori = new int[giocatori];
int CodeCoverConditionCoverageHelper_C1;
		//@loop_invariant (\forall int x; 0<=x &&  x<i; mano[x]==0 && vincitori[x]==0);
		//@loop_invariant i >= 0;
		CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[4]++;
for(int i = 0;(((((CodeCoverConditionCoverageHelper_C1 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C1 |= (2)) == 0 || true) &&
 ((i < giocatori) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) || true)) || (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) && false); i++) {
			CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[5]++;
this.mano[i] = 0;
			CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[6]++;
this.vincitori[i] = 0;
		}
	}
	
	
	
	//@diverges true;
	
	//Richiedo che il vettore delle pescate sia lungo uguale al numero di giocatori
		//@requires pescate.length == mano.length;
	
	//Richiedo che il vettore delle pescate abbia numeri positivi, compresi tra uno e sette
		//@requires (\forall int x; 0<=x &&  x<pescate.length; pescate[x]>0 && pescate[x]<8);
	
	//Controllo che la mano più la pescate non superi il numero 20
		//@requires (\forall int x; 0<=x &&  x<mano.length; (mano[x]+pescate[x])>=0 && (mano[x]+pescate[x])<=20);
	
	//Controllo che vittoria sia un numero compreso tra -1 (nessuno ha ancora vinto) e il numero dei giocatori
		//@ensures (vittoria >=-1) && (vittoria<=mano.length);
	
	//Controllo che in mano non abbia piu di 14
		//@ensures (\forall int x; 0<=x &&  x<mano.length; mano[x]>=0 && mano[x]<=14);
	
	//Controllo che il risultato sia compreso tra -1 ed il numero di giocatori
		//@ensures (\result >=-1) && (\result<=mano.length);
	public int giocata(int[] pescate) {
int CodeCoverConditionCoverageHelper_C2;
		CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[7]++;
if((((((CodeCoverConditionCoverageHelper_C2 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C2 |= (2)) == 0 || true) &&
 ((vittoria == -1) && 
  ((CodeCoverConditionCoverageHelper_C2 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 1) || true)) || (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 1) && false)) {
CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[1]++;
			CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[8]++;
int i = 0;
int CodeCoverConditionCoverageHelper_C3;
			//@loop_invariant i>=0 && i<=mano.length;
			//@loop_invariant (\forall int x; 0<=x && x<i; mano[x]>=0 && mano[x]<=20);
			CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[9]++;
for(i = 0;(((((CodeCoverConditionCoverageHelper_C3 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C3 |= (2)) == 0 || true) &&
 ((i < mano.length) && 
  ((CodeCoverConditionCoverageHelper_C3 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 1) || true)) || (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 1) && false); i++) {
int CodeCoverConditionCoverageHelper_C4;
				//Se non si ha ancora perso ne vinto allora si può pescare
				CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[10]++;
if((((((CodeCoverConditionCoverageHelper_C4 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C4 |= (2)) == 0 || true) &&
 ((vincitori[i] == 0) && 
  ((CodeCoverConditionCoverageHelper_C4 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[4].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C4, 1) || true)) || (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[4].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C4, 1) && false)) {
CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[3]++;
					CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[11]++;
mano[i] = mano[i] + pescate[i];
} else {
  CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[4]++;}
			}
			CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[12]++;
primoControllo();
			//@assert (vittoria >=-1) && (vittoria<=mano.length);
			CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[13]++;
secondoControllo();

			//@assert (vittoria >=-1) && (vittoria<=mano.length);
		} else {
  CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[2]++;}
		CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[14]++;
return vittoria;
	}
	
	
	//@diverges true;
	
	//Tutti devono avere o vinto o perso o possono continuare a giocare
		//@ensures (\forall int x; 0<=x && x<vincitori.length; (vincitori[x]==-1) || (vincitori[x]==0) || (vincitori[x]==1));
	public void primoControllo() {
		CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[15]++;
this.controllo = 0;
		CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[16]++;
int i = 0;
int CodeCoverConditionCoverageHelper_C5;
		//Chi ha in mano più di otto ha perso
			//@loop_invariant (\forall int x; 0<=x && x<i; (mano[x]>8) ==> (vincitori[x]==-1));
		//Chi ha in mano esattamente otto ha vinto
			//@loop_invariant (\forall int x; 0<=x && x<i; (mano[x]==8) ==> (vincitori[x]==1));
		CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[17]++;
for(i = 0;(((((CodeCoverConditionCoverageHelper_C5 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C5 |= (2)) == 0 || true) &&
 ((i < mano.length) && 
  ((CodeCoverConditionCoverageHelper_C5 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[5].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C5, 1) || true)) || (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[5].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C5, 1) && false); i++) {
int CodeCoverConditionCoverageHelper_C6;
			//Se in mano si ha più di otto si perde
			CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[18]++;
if((((((CodeCoverConditionCoverageHelper_C6 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C6 |= (2)) == 0 || true) &&
 ((mano[i] > 8) && 
  ((CodeCoverConditionCoverageHelper_C6 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[6].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C6, 1) || true)) || (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[6].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C6, 1) && false)) {
CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[5]++;
				CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[19]++;
vincitori[i] = - 1;
} else {
  CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[6]++;}
int CodeCoverConditionCoverageHelper_C7;
			//Se in mano si ha esattamente otto, si vince
			CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[20]++;
if((((((CodeCoverConditionCoverageHelper_C7 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C7 |= (2)) == 0 || true) &&
 ((mano[i] == 8) && 
  ((CodeCoverConditionCoverageHelper_C7 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[7].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C7, 1) || true)) || (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[7].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C7, 1) && false)) {
CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[7]++;
				CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[21]++;
vincitori[i] = 1;
				CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[22]++;
vittoria = i + 1;

			} else {
  CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[8]++;}
int CodeCoverConditionCoverageHelper_C8;
			//Se in mano si ha meno di otto, si può continuare a giocare a patto che nessuno abbia fatto esattamente otto (Controllato nel secondo metodo)
			CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[23]++;
if((((((CodeCoverConditionCoverageHelper_C8 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C8 |= (2)) == 0 || true) &&
 ((mano[i] < 8) && 
  ((CodeCoverConditionCoverageHelper_C8 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[8].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C8, 1) || true)) || (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[8].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C8, 1) && false)) {
CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[9]++;
				CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[24]++;
controllo = controllo + 1;
} else {
  CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[10]++;} 
		}
	}
	

	//Tutti devono avere o vinto o perso o possono continuare a giocare
		//@ensures (\forall int x; 0<=x && x<mano.length; (vincitori[x]==-1) || (vincitori[x]==0) || (vincitori[x]==1));
	public void secondoControllo() {
int CodeCoverConditionCoverageHelper_C9;
		CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[25]++;
for(int i = 0;(((((CodeCoverConditionCoverageHelper_C9 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C9 |= (2)) == 0 || true) &&
 ((i < mano.length) && 
  ((CodeCoverConditionCoverageHelper_C9 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[9].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C9, 1) || true)) || (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[9].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C9, 1) && false); i++) {
int CodeCoverConditionCoverageHelper_C10;
			//Se in mano si ha meno di 8, però qualcuno ha già vinto allora si ha perso
			CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[26]++;
if((((((CodeCoverConditionCoverageHelper_C10 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C10 |= (8)) == 0 || true) &&
 ((mano[i] < 8) && 
  ((CodeCoverConditionCoverageHelper_C10 |= (4)) == 0 || true)))
 && 
(((CodeCoverConditionCoverageHelper_C10 |= (2)) == 0 || true) &&
 ((vittoria!=-1) && 
  ((CodeCoverConditionCoverageHelper_C10 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[10].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C10, 2) || true)) || (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[10].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C10, 2) && false)) {
CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[11]++;
				CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[27]++;
vincitori[i] = -1;
}
			//Se in mano si ha mano di otto, però tutti gli altri hanno tutti superato l'otto, allora si ha vinto
			else {
CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[12]++;
int CodeCoverConditionCoverageHelper_C11; CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[28]++;
if((((((CodeCoverConditionCoverageHelper_C11 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C11 |= (8)) == 0 || true) &&
 ((mano[i] < 8) && 
  ((CodeCoverConditionCoverageHelper_C11 |= (4)) == 0 || true)))
 && 
(((CodeCoverConditionCoverageHelper_C11 |= (2)) == 0 || true) &&
 ((controllo == 1) && 
  ((CodeCoverConditionCoverageHelper_C11 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[11].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C11, 2) || true)) || (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[11].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C11, 2) && false)) {
CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[13]++;
				CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[29]++;
vincitori[i] = 1;
				CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[30]++;
vittoria = i + 1;

			} else {
  CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[14]++;}
}
		}
	}
	
	//Il metodo print viene escluso da jml per problemi di efficenza da parte del solver z3_4_3
	public void print() {
int CodeCoverConditionCoverageHelper_C12;
		CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[31]++;
for(int i = 0;(((((CodeCoverConditionCoverageHelper_C12 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C12 |= (2)) == 0 || true) &&
 ((i < mano.length) && 
  ((CodeCoverConditionCoverageHelper_C12 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[12].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C12, 1) || true)) || (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[12].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C12, 1) && false); i++) {
int CodeCoverConditionCoverageHelper_C13;
			CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[32]++;
if((((((CodeCoverConditionCoverageHelper_C13 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C13 |= (2)) == 0 || true) &&
 ((vincitori[i] == 1) && 
  ((CodeCoverConditionCoverageHelper_C13 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[13].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C13, 1) || true)) || (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[13].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C13, 1) && false)) {
CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[15]++;
				CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[33]++;
System.out.println("Giocatore " + i + " ha in mano: " + mano[i] + "-> WIN!");
}
			else {
CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[16]++;
int CodeCoverConditionCoverageHelper_C14; CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[34]++;
if((((((CodeCoverConditionCoverageHelper_C14 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C14 |= (2)) == 0 || true) &&
 ((vincitori[i] == 0) && 
  ((CodeCoverConditionCoverageHelper_C14 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[14].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C14, 1) || true)) || (CodeCoverCoverageCounter$1iwyhw3q3j530m01.conditionCounters[14].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C14, 1) && false)) {
CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[17]++;
				CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[35]++;
System.out.println("Giocatore " + i + " ha in mano: " + mano[i] + "-> PUO GIOCARE");
}
			else {
CodeCoverCoverageCounter$1iwyhw3q3j530m01.branches[18]++;
				CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[36]++;
System.out.println("Giocatore " + i + " ha in mano: " + mano[i] + "-> LOSE!");
}
}
		}
		CodeCoverCoverageCounter$1iwyhw3q3j530m01.statements[37]++;
System.out.println("\n");
	}
}

class CodeCoverCoverageCounter$1iwyhw3q3j530m01 extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance("C:\\Documenti\\UniBG\\Materie\\Testing\\Progetto_Testing\\Java\\.metadata\\.plugins\\org.eclipse.core.resources\\.projects\\GiocoCarte\\org.codecover.eclipse\\coverage-logs\\coverage-log-file.clf"), "64e12309-b911-4baf-be63-1e8ebcf685d1").addObservedContainer(new CodeCoverCoverageCounter$1iwyhw3q3j530m01 ());
  }
    public static long[] statements = new long[38];
    public static long[] branches = new long[19];

  public static final org.codecover.instrumentation.java.measurement.ConditionCounter[] conditionCounters = new org.codecover.instrumentation.java.measurement.ConditionCounter[15];
  static {
    final String SECTION_NAME = "Gioco.java";
    final byte[] CONDITION_COUNTER_TYPES = {0,1,1,1,1,1,1,1,1,1,2,2,1,1,1};
    for (int i = 1; i <= 14; i++) {
      switch (CONDITION_COUNTER_TYPES[i]) {
        case 0 : break;
        case 1 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallOneConditionCounter(SECTION_NAME, "C" + i); break;
        case 2 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallTwoConditionCounter(SECTION_NAME, "C" + i); break;
        case 3 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.MediumConditionCounter(SECTION_NAME, "C" + i); break;
        case 4 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.LargeConditionCounter(SECTION_NAME, "C" + i); break;
      }
    }
  }

  public CodeCoverCoverageCounter$1iwyhw3q3j530m01 () {
    super("Gioco.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 37; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= 18; i++) {
        branches[i] = 0L;
      }
    for (int i = 1; i <= 14; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].reset();
      }
    }
  }

  public void serializeAndReset(org.codecover.instrumentation.measurement.CoverageCounterLog log) {
    log.startNamedSection("Gioco.java");
      for (int i = 1; i <= 37; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= 18; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
        }
      }
    for (int i = 1; i <= 14; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].serializeAndReset(log);
      }
    }
  }
}

