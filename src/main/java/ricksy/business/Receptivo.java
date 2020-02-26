package ricksy.business;

import java.util.ArrayList;

public class Receptivo {
	
	ArrayList<GuestDispatcher> guest = new ArrayList<GuestDispatcher>();
	
	public Receptivo() {}
	public void registra(GuestDispatcher gestDispatcher) {
		this.guest.add(gestDispatcher);
	}
	
	public ArrayList<GuestDispatcher> getGuest(){
		return this.guest;
	}
	public void dispatch(CreditCard personaje) {
		for (GuestDispatcher objeto: guest) {
			objeto.dispatch(personaje);
		}
		
	}
	
}
