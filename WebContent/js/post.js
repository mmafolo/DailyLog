var el;


el = document.getElementById('msgbody');
el.addEventListener('keyup',countCharacters(),false);
	/*	Add event listener
	 *  keyup is a js method for keys
	 *  
	 */
window.onload=function countCharacters(){
	var textEntered, countRemaining, counter;
	 
	textEntered = document.getElementById('msgbody').value;
	counter = 1000 - (textEntered.length);
	contRemaining = document.getElementById('chardisp');
	countRemaining.textContent = counter;
}