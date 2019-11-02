## Adaugare Clase Noi

Clasele trebuie sa fie numite dupa foarma `<nume>_<nume clasa>`, unde:
	- `<nume>` este numele vostru (cu litera mare)
	- `<nume_clasa>` este numele clasei pe care vreti sa o creati (preferabil tot cu litera mare)
	
Exemplu: Matei_DriverMode

Cand lucrati in acest repo, **nu modificati nimic din alte clase in afara de ale voastre**.

## Coding Conventions

### Variabile

**Nume**: 
- prima litera mica, restul cuvintelor incep cu litera mare
- pentru boolean preferabil sa fie sub forma de intrebare
- sa fie cat mai explicite

**Exemple**: `double speedLeft` , `int currentTicksLeftMotor` , `boolean hasPressedX`

### Functii

**Antet**:
- prima litera mare, restul cuvintelor incep cu litera mare
- parametrii pastreaza conventiile de le variabile
- acolada incepe pe acelasi rand cu antetul functiei

**Exemple**:
	```
	void StopWheels(){
		
	}
	```
	```
	void SetWheelsPower(double speedLeft, double speedRight){
	
	}
	```
	
### Constante

**Nume**:
- toate literele cu caps

**Exemplu**: `final double DEADZONE = 0.1`

	
