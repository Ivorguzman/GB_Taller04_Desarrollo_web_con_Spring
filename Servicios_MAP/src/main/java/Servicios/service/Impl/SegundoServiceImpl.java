package Servicios.service.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import Servicios.model.PaisCapital;
import Servicios.service.ItfPaisesCapital;


@Service("segundoServiceImpl")
public class SegundoServiceImpl implements ItfPaisesCapital {

	@Override
	public Map<String, PaisCapital> getCapitaPais() {


		Map<String, PaisCapital> miMapaPaisCapital = new HashMap<>();

		miMapaPaisCapital.put("p-1", new PaisCapital("Venezuela", "Caracas"));
		miMapaPaisCapital.put("p-2", new PaisCapital("Colombia", "Bogota"));
		miMapaPaisCapital.put("p-3", new PaisCapital("España", "Madrid"));
		miMapaPaisCapital.put("p-4", new PaisCapital("Paris", "Francia"));
		miMapaPaisCapital.put("p-5", new PaisCapital("Alemania", "Berlin"));

		return miMapaPaisCapital;

	}

}
