package INE;

import java.util.ArrayList;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import INE.INEPersona;

public class DBINE 
{
	private ObjectContainer db = null;

	private void abrirRegistro() {
		db = Db4oEmbedded.openFile("registroClientes");
	}

	private void cerrarRegistro() {
		db.close();
	}

	void insertarRegistro(INEPersona p) {
		abrirRegistro();
		db.store(p);
		cerrarRegistro();
	}

	public List<INEPersona> seleccionarPersonas() {
		abrirRegistro();
		ObjectSet<Object> listaPersonas = db.queryByExample(INEPersona.class);
		List<INEPersona> lp = new ArrayList<>();

		for (Object listaPersonas1 : listaPersonas) {
			lp.add((INEPersona) listaPersonas1);
		}

		cerrarRegistro();

		return lp;
	}

	public INEPersona seleccionarPersona(INEPersona p) {
		abrirRegistro();
		ObjectSet<Object> resultado = db.queryByExample(p);
		INEPersona persona = (INEPersona) resultado.next();
		cerrarRegistro();
		return persona;
	}

	
}
