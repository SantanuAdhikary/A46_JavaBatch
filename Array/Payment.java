class Payment{

public void acceptPayment(double cash){
System.out.println("payment accepted through cash " + cash);
}

public void acceptPayment(String cardNumber , double cash){
System.out.println("payment accepted through card " + cardNumber + " amount : " + cash);
}

public static void main(String [] args){
	
	Payment p = new Payment();
	p.acceptPayment(200);
	p.acceptPayment("765456787665" , 999);
	
}

}