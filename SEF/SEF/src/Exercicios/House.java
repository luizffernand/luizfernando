/**
 * 
 */
package Exercicios;

/**
 * @author treinamento
 *
 */
public class House {
	
	private Room room;
	private LivingRoom livingroom;
	private Kitchen kitchen;
	
	public House (){
		this.room = new room("sala de jantar");
		this.livingroom = new LivingRoom("sala de tv");
		this.kitchen = new Kitchen("cozinha");
		
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public LivingRoom getLivingroom() {
		return livingroom;
	}

	public void setLivingroom(LivingRoom livingroom) {
		this.livingroom = livingroom;
	}

	public Kitchen getKitchen() {
		return kitchen;
	}

	public void setKitchen(Kitchen kitchen) {
		this.kitchen = kitchen;
	}
	
	public static void main (String[] args){
		
	}
}
