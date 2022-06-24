package vista;


/**
 * @(#) ModelPersona.java 11 may. 2018
 * Universidad Politecnica Salesiana
 * Cuenca-Ecuador
 */


import java.sql.Date;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelo.Medicamento;





public class Tabla_Medicamentos extends AbstractTableModel {

	public String[] columnas = {"id","Codigo de Barra", "Marca","Descripcion","Cantidad","Unidad de Medida","Stock"};//array de las columnas con el titulo del contenido
	public Class[] columnasTipos = {Integer.class, String.class,String.class,String.class,Integer.class,String.class,Integer.class};//tipo de dato a trbajar
	private ArrayList<Medicamento> listaMedicamentos = new ArrayList<>();//array list de tipo medico

	/**
	 * constructor de la clase que recibe los datos
	 * @param datos
	 */
	public Tabla_Medicamentos(ArrayList<Medicamento> datos) {
		super();
		listaMedicamentos= new ArrayList<Medicamento>();
		this.listaMedicamentos = datos;
	}

	/** 
	 * constructor vacio
	 */
	public Tabla_Medicamentos() {
	}


	/**
	 * devuelve el numero de columnas que posee la tabla
	 * @return 
	 */
	public int getColumnCount() {
		return columnas.length;
	}

	/**
	 * devuelve la cantidad de filas que posee la tabla
	 */
	public int getRowCount() {
		return listaMedicamentos.size();
	}

	/**
	 * establece los tados que se optiene de persona
	 */
	public void setValueAt(Object value, int row, int col) {
		Medicamento med = (Medicamento) (listaMedicamentos.get(row));

		switch (col) {
		
		case 0:
			med.setMed_id((int) value);
			break;
		case 1:
			med.setMed_codigo_barra((String) value);
			break;
		
		case 2:
			med.setMed_marca((String) value);
			break;
		case 3:
			med.setMed_descripcion((String) value);
			break;
                case 4:
			med.setMed_cantidad((int) value);
			break;
                case 5:
			med.setMed_unidad_medida((String) value);
			break;        
		case 6:
			med.setMed_stock((int) value);
			break; 
                
                
		}
	}

	/**
	 * devuelve el nombre de la columna
	 */
	public String getColumnName(int col) {
		return columnas[col];
	}

	/**
	 * devuelve el tipo de colunma
	 */
	public Class getColumnClass(int col) {
		return columnasTipos[col];
	}
	/**
	 * obtiene la informacion de persona 
	 */
	public Object getValueAt(int row, int col) {
		Medicamento emp = (Medicamento) (listaMedicamentos.get(row));

		switch (col) {
		
		case 0:
			return emp.getMed_id();
		case 1:
			return emp.getMed_codigo_barra();
                case 2:
			return emp.getMed_marca();
		case 3:
			return emp.getMed_descripcion();
                 case 4:
			return emp.getMed_cantidad();        
                case 5:
			return emp.getMed_unidad_medida();
		case 6:
			return emp.getMed_stock();
	
		
		}
		return new String();
	}

}
