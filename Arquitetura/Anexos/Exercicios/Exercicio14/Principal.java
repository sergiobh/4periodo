import java.util.List;

import Model.Position;
import Services.ResponseListener;


public class Principal implements ResponseListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal principal = new Principal();
		principal.findPosition();

	}
	
	public void findPosition(){
		Position.find(this).description("java").location("contagem").full_time(true).execute();
	}

	@Override
	public void onResult(List<Position> positions) {
		// TODO Auto-generated method stub
		
	}

}
