
public class PlayerMain {

	public static void main(String[] args) {
		Player player=new Player();
		
		Address address=new Address();
		
		address.setAddrId(1);
		address.setAddrCity("jalandhar");
		address.setAddrState("punjab");
		
		player.setPlayerId(3434344);
		player.setPlayerName("rahul verma");
		player.setAddress(address);
		
		player.playerInfo();
				
		
		
	}
}
