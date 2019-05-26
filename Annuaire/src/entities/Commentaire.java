package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="COMMENTAIRES")
public class Commentaire {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCommentaire ;
	private String commentaire;
	
	@ManyToOne 
	@JoinColumn (name="idUser")
	private User user;
	@ManyToOne 
	@JoinColumn (name="idLieu")
	private Lieu lieu;
	
}
