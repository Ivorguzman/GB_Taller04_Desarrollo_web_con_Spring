package Logs_y_Componentes.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;


@Component("primerComponente")
public class PrimerComponente {

	// Declarar un LOG
	private static final Log MILOG_COMPONENTE = LogFactory.getLog(PrimerComponente.class);

	public void EjemploComponente() {

		MILOG_COMPONENTE.info("ESTAMOS ENTRANDO EN EL COMPONENTES");


	}


}
