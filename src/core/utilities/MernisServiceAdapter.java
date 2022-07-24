package core.utilities;

import entities.Player;

public class MernisServiceAdapter implements PersonCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " " + player.getIdentityNumber() + " "
                + player.getBirthDate() + " mernis'ten doğrulama yapıldı");

        return true;
	}

	

}
