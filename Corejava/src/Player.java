public class Player {
	private int playerId;
	private String playerName;
	private Address address; // Player has Address
								// has a relationship

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void playerInfo() {
		System.out.println("Player Information ");
		System.out.println("\tId " + getPlayerId());
		System.out.println("\tId " + getPlayerName());
		System.out.println("\n\t\tAddress ");

		Address address2 = getAddress();

		System.out.println("\t\t address id " + address2.getAddrId());
		System.out.println("\t\t address city " + address2.getAddrCity());
		System.out.println("\t\t address state  " + getAddress().getAddrState());

	}

}
