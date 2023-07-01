asm SetteEMezzoATGT

import StandardLibrary

signature: 

	enum domain StatoPartita = {VINTA | PERSA | NONDEFINITA}
	enum domain Carte = {ASSO | DUE | TRE | QUATTRO | CINQUE | SEI | SETTE}
	
	dynamic monitored pescataIniziale: Carte
	dynamic monitored pescata: Carte
	dynamic controlled vittoria: StatoPartita
	dynamic controlled mano: Carte
	
definitions:	
	
	rule r_partita =
			if(mano = ASSO and pescata = ASSO)then
				mano := DUE
			else if((mano = ASSO and pescata = DUE) or (mano = DUE and pescata = ASSO)) then
				mano := TRE
			else if((mano = ASSO and pescata = TRE) or (mano = TRE and pescata = ASSO)) then
				mano := QUATTRO
			else if((mano = ASSO and pescata = QUATTRO) or (mano = QUATTRO and pescata = ASSO)) then
				mano := CINQUE
			else if((mano = ASSO and pescata = CINQUE) or (mano = CINQUE and pescata = ASSO)) then
				mano := SEI
			else if((mano = ASSO and pescata = SEI) or (mano = SEI and pescata = ASSO)) then
				mano := SETTE
			else if((mano = ASSO and pescata = SETTE) or (mano = SETTE and pescata = ASSO)) then
				vittoria := VINTA
			else if(mano = DUE and pescata = DUE) then
				mano := QUATTRO
			else if((mano = DUE and pescata = TRE) or (mano = TRE and pescata = DUE)) then
				mano := CINQUE
			else if((mano = DUE and pescata = QUATTRO) or (mano = QUATTRO and pescata = DUE)) then
				mano := SEI
			else if((mano = DUE and pescata = CINQUE) or (mano = CINQUE and pescata = DUE)) then
				mano := SETTE
			else if((mano = DUE and pescata = SEI) or (mano = SEI and pescata = DUE)) then
				vittoria := VINTA
			else if(mano = TRE and pescata = TRE) then
				mano := SEI
			else if((mano = TRE and pescata = QUATTRO) or (mano = QUATTRO and pescata = TRE)) then
				mano := SETTE
			else if((mano = TRE and pescata = CINQUE) or (mano = CINQUE and pescata = TRE)) then
				vittoria := VINTA
			else if(mano = QUATTRO and pescata = QUATTRO) then
				vittoria := VINTA
			else 
				vittoria := PERSA
		endif
		endif
		endif
		endif
		endif
		endif
		endif
		endif
		endif
		endif
		endif
		endif
		endif
		endif
		endif
		endif
	
	main rule r_main = 
		if(vittoria = NONDEFINITA) then
			r_partita[]
		endif

default init s0:
	function vittoria = NONDEFINITA
	function mano = pescataIniziale
