/**
 * 
 */
package projPOO01.GestionPersonnes;

import projPOO01.Exceptions.ExceptionInt;
import projPOO01.Exceptions.ExceptionTailleString;

/**
 *
 * @author Pierre
 *
 */
public class Interimaire extends Salarie {

	/** contratAgence */
	private String contratAgence;
	
	/** dureeMois */
	private Integer dureeMois;

	public Interimaire() {
		super("", "", "", "", "", "", 0);
		this.contratAgence = "";
		this.dureeMois = 0;
	}

	public Interimaire(String nom, String prenom, String adresse, String ville, String codepostal, String secu,
			double salaire, String contratAgence, Integer dureeMois) {
		super(nom, prenom, adresse, ville, codepostal, secu, salaire);
		this.contratAgence = contratAgence;
		this.dureeMois = dureeMois;
	}
	
	public static void ctrlContratAgence(String contratAgence) throws ExceptionTailleString {
		
		if (contratAgence.length() < 5) {
			
			throw new ExceptionTailleString("Le nombre de caractère est inférieur à 5");
			
		}
		
	}
	
	public static void ctrlDureeMois(Integer duree) throws ExceptionInt {
		
		if (duree < 1) {
			
			throw new ExceptionInt("La durée ne peut ètre inférieur à 1 mois");
			
		}
		
	}

	/**Getter
	 *
	 * @return the contratAgence
	 */
	public String getContratAgence() {
		return contratAgence;
	}

	/**Setter
	 *
	 * @param contratAgence the contratAgence to set
	 */
	public void setContratAgence(String contratAgence) {
		this.contratAgence = contratAgence;
	}

	/**Getter
	 *
	 * @return the dureeMois
	 */
	public Integer getDureeMois() {
		return dureeMois;
	}

	/**Setter
	 *
	 * @param dureeMois the dureeMois to set
	 */
	public void setDureeMois(Integer dureeMois) {
		this.dureeMois = dureeMois;
	}

}
